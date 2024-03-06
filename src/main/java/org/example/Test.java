package org.example;

public class Test {
    private static Test INSTANCE=new Test();
    public static Test getInstance(){
        return INSTANCE;
    }
}
