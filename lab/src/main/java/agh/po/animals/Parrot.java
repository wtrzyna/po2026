package agh.po.animals;

public class Parrot extends Animal{
    public Parrot(String name) {
        this.name = name;
        this.legs = 2;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Kra");
    }
}
