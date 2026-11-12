package agh.po.animals;

public class Snake extends Animal{
    public Snake(String name) {
        this.name = name;
        this.legs = 0;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Sss");
    }
}
