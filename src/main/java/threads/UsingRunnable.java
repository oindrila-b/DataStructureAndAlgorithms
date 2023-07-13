package main.java.threads;

public class UsingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new UsingRunnable())).start();
    }

}
