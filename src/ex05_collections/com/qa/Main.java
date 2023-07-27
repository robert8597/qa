package ex05_collections.com.qa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Cat c = new Cat("Whiskers", 10);
        Cat c2 = new Cat("Midas", 8);
        Dog d = new Dog("Spot", 2);
        Rabbit r = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Cottontail", 3);

        //ARRAYLIST
        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(r);
        animalList.add(d);

        System.out.println("\n---ArrayList---");
        for (int x = 0; x < animalList.size(); x ++){
            System.out.println(animalList.get(x));
        }

        //HASHMAP
        HashMap<String, Animal> animalMap = new HashMap<>();

        animalMap.put(c.getName(), c);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d.getName(), d);
        animalMap.put(r.getName(), r);
        animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<>();

        animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");

        System.out.println("\n---HashMap---");
        for (String key : animalMap.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }

        //Set
        HashSet<Animal> set = new HashSet<>();
        //we can just add all the elements of another collection
        set.addAll(animalList);

        set.add(c); // replaces the previous version of the cat
        set.add(c2);

        System.out.println("\n---Set---");
        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // this is the same for the animal list and the set, we
        // need to iterate through everything
        System.out.println("\n---Finding Spot.---");
        for (Animal a : animalList){
            if (a.getName().equals("Spot")){
                System.out.println(
                        "Found Spot in the ArrayList: " + a);
            }
        }

        // And for a HashMap
        System.out.println("Found Spot in the HashMap: " +
                animalMap.get("Spot"));

        // Sorting collection

        Collections.sort(animalList);
        System.out.println("\n---Sorted animal list---");
        for (int x = 0; x < animalList.size(); x++){
            System.out.println(animalList.get(x));
        }

        // TreeMap
        TreeMap<String, Animal> tree = new TreeMap<>();
        tree.putAll(animalMap);

        System.out.println("\n---TreeMap---");
        for (String key : tree.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    tree.get(key));
        }
    }
}
