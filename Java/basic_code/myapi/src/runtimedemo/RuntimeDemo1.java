package runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        Runtime runtime1 = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();

        System.out.println(runtime1.availableProcessors());

        System.out.println(runtime2.maxMemory() / 1024 / 1024);


        System.out.println(runtime2.totalMemory() / 1024 / 1024);

        System.out.println(runtime2.freeMemory() / 1024 / 1024);


    }
}
