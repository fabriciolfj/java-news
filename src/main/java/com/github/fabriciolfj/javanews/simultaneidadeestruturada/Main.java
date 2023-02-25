package com.github.fabriciolfj.javanews.simultaneidadeestruturada;

import jdk.incubator.concurrent.StructuredTaskScope;

import java.util.List;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        final Main main = new Main();
        System.out.println(main.execute());
    }

    public Response execute() {
        //encerra as subtarefas, quando alguma delas dar errado
        //a thread principal é dona do scope (tarefa principal), e dentro deste podemos bifurcar para outras subtarefas
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<Shelter> shelter = scope.fork(this::getShelter);
            Future<List<Dog>> dogs = scope.fork(this::getDogs);

            scope.join();
            Response response = new Response(shelter.resultNow(), dogs.resultNow());
            return response;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Shelter getShelter() {
        return new Shelter("Shelter");
    }

    private List<Dog> getDogs() {
        return List.of(new Dog("Buddy"), new Dog("Simba"));
    }
}
