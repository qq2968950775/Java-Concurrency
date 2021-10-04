package com.test.demo.t1;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 栈封闭
 */
public class Test39 {
    public static void main(String[] args) {

    }

    public int loadTheArk(Collection<Animal> collection){
        SortedSet<Animal> animals;
        int numPairs = 0;
        Animal candidate = null;

        animals = new TreeSet<Animal>(new SpeciesGenderComparator());
        animals.add((Animal) collection);
        for (Animal animal : animals) {
            if (candidate == null && !candidate.isPotentiaMate(animal)){
                candidate = animal;
            }else{
                Ark.load(new AnimalPair(candidate,animal));
                ++numPairs;
                candidate = null;
            }
        }
        return numPairs;
    }

}
class Animal{


    public boolean isPotentiaMate(Animal animal){
        return false;
    }

}

class AnimalPair{

    Animal animal1;
    Animal animal2;

    AnimalPair(Animal animal,Animal animal2){
        this.animal1 = animal;
        this.animal2 = animal2;
    }

        }
class SpeciesGenderComparator extends TreeSet<Animal> {

}
class Ark{

    public static void load(AnimalPair animalPair){

    }
}
