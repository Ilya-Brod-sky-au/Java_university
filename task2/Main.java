package Threads;

public class Main {
    public static void main(String[] args) {
        var Game = new Player();
        new Thread(Game).start();
        new Thread(Game).start();
        new Thread(Game).start();
        new Thread(Game).start();
    }
}
