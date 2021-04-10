package main.oop;

public class ZooKeeper {
    public void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
    }
}