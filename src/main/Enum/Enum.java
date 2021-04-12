package main.Enum;

enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;

    Fruit(String color) {
        System.out.println("Call Constructor " + this);
        this.color = color;
    }

    String getColor() {
        return this.color;
    }
}

enum Company {
    GOOGLE, APPLE, ORACLE;
}

public class Enum {

    public static void main(String[] args) {
        for (Fruit f : Fruit.values()) {
            System.out.println(f + ", " + f.getColor());
        }
    }
}