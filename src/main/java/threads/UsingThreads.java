package main.java.threads;

public class UsingThreads extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from a thread extending threads!");
    }

    public static void main(String args[]) {
        (new UsingThreads()).start();
    }

}
