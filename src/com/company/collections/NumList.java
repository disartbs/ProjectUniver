package com.company.collections;

import java.util.*;

public class NumList {
    ArrayList<Human> numbers;

    public NumList() {
        numbers =  new ArrayList<>();
    }

    public NumList(ArrayList<Human> numbers) {
        this.numbers = numbers;
    }

    public void add(Human number) {
        numbers.add(number);

    }

    int getDifCount(){
        return (new TreeSet<Human>(numbers).size());
    }

    TreeMap<Integer, Integer> ageCount(){
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        Iterator<Human> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Human human = iterator.next();
            int k = 0;
            if(mp.containsKey(human.getAge())){
                k = mp.get(human.getAge());
            }
            mp.put(human.getAge(), ++k);


        }
        return mp;
    }

    void outTreeSet(){
        TreeSet<Human> treeSet = new TreeSet<Human>(numbers);
        Iterator<Human> iterable = treeSet.iterator();
        while (iterable.hasNext()){
            System.out.println("\n" + iterable.next());
        }
    }

    void sort() {
        Collections.sort(numbers);
    }

    public void outMinMax(){
        Iterator<Human> humanIterator = numbers.iterator();
        Human younger = numbers.get(0);
        Human older = numbers.get(0);
        while(humanIterator.hasNext()){
            Human human = humanIterator.next();
            if(human.getBirthday().before(younger.getBirthday())){
                System.out.println("y" + younger);
                System.out.println("h" + human);
                younger = human;
            }
            if(human.getBirthday().after(older.getBirthday())){
                System.out.println("o" + older);
                System.out.println("h" + human);
                older = human;
            }
        }
        System.out.println(younger);
        System.out.println(older);
    }

    @Override
    public String toString() {
        return "NumList{" +
                "numbers=" + numbers +
                '}';
    }
}

