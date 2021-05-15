/*
Tatum De Wet
218069227
ADP372S Assignment 2
 */

package za.ac.cput;

import java.util.*;

public class Cars implements Collections{


    //1. Map
    HashMap<String, String> licence = new HashMap<String, String>();

    //2. Set
    String[] arr = {"Blue", "Black", "Silver"};
    TreeSet<String> colours = new TreeSet<String>(Arrays.asList(arr));

    //3. List
    ArrayList<String> cars = new ArrayList<String>(Arrays.asList("Toyota", "BMW", "Tesla"));

    @Override
    public void add() {
        //1. Map
        licence.put("Toyota", "CA1234567");
        System.out.println(licence);

        //2. Set
        colours.add("White");
        System.out.println(colours);

        //3. List
        cars.add("Ford");
        System.out.println(cars);
    }

    @Override
    public void remove() {
        //1. Map
        licence.remove("BMW");
        System.out.println(licence);

        //2. Set
        colours.remove("Black");
        System.out.println(colours);

        //3. List
        cars.remove("Toyota");
        System.out.println(cars);
    }

    @Override
    public void find() {
        //1. Map
        licence.containsKey("Ford");
        System.out.println(licence);

        //2. Set
        colours.contains("Blue");
        System.out.println(colours);

        //3. List
        cars.contains("BMW");
        System.out.println(cars);
    }
}
