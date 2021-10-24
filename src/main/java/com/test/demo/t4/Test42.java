package com.test.demo.t4;

import java.util.HashSet;
import java.util.Set;

public class Test42 {

    public class PersonSet{
        private final Set<Person> myset = new HashSet<Person>();

        public synchronized void addPerson(Person person){
            myset.add(person);
        }

        public synchronized boolean containsPerson(Person p){
            return myset.contains(p);
        }
    }
    class Person{

    }
}
