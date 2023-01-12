package Cat_1;

public class Cat {
    private int weight;
    private int age;
    private String name;
    private String color;
    private String ownerAdress;
    private boolean isSpeak;

    public Cat(int weight, int age, String name, String color, String adress) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.name = name;
        this.ownerAdress = adress;
        // ArrayList<String> list = new Cat<>(weight, age, name, color, adress);
    }
}