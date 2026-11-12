package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void fillZoo (){
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int los = random.nextInt(3);
            if (los == 0) {
                animals[i] = new Dog("Pies" + i);
            } else if (los == 1) {
                animals[i] = new Parrot("Papuga" + i);
            } else if (los == 2) {
                animals[i] = new Snake("Wąż" + i);
            }
        }
    }

    public int countLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            sum += animal.getLegs();
        }
        return sum;
    }

    public void pom() {
        for (Animal animal : animals) {
            String desc = animal.getDescription();
            int legs = animal.getLegs();
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillZoo();
        System.out.println("Suma nóg: " + zoo.countLegs());
        zoo.pom();
    }
}
