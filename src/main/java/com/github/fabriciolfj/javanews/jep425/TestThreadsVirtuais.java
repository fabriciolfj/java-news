package com.github.fabriciolfj.javanews.jep425;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

//nao prende uma thread do so
//uma thread do SO pode executar varias threads virtuais
//podemos utilizar o modelo thread por requisicao
public class TestThreadsVirtuais {

    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                var result = executor.submit(() -> {
                   Thread.sleep(1);
                   return i;
                });

                try {
                    System.out.println(result.get());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
