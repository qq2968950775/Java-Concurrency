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
            if (candidate == null && !candidate.isPotentiaMate(a)){
                candidate = a;
            }else{
                ark.load(new AnimalPair(candidate,a));
                ++numPairs;
                candidate = null;
            }
        }
        return numPairs;
    }
}
class Animal{

}
