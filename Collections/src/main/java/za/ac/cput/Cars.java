/*
Tatum De Wet
218069227
ADP372S Assignment 2
 */

package za.ac.cput;

import java.util.*;

public class Cars{

    //1. Collection
    Collection<String>yearModel = new LinkedList<String>(Arrays.asList("2012", "2016", "2008"));

    //2. Map
    HashMap<String, String> licence = new HashMap<String, String>();

    //3. Set
    String[] arr = {"Blue", "Black", "Silver"};
    TreeSet<String> colours = new TreeSet<String>(Arrays.asList(arr));

    //4. List
    ArrayList<String> cars = new ArrayList<String>(Arrays.asList("Toyota", "BMW", "Tesla"));

    public void add() {
        //1. Collection
        yearModel.add("2018");
        System.out.println(yearModel);

        //2. Map
        licence.put("Toyota", "CA1234567");
        System.out.println(licence);

        //3. Set
        colours.add("White");
        System.out.println(colours);

        //4. List
        cars.add("Ford");
        System.out.println(cars);
    }

    public void remove() {
        //1. Collection
        yearModel.remove("2008");
        System.out.println(yearModel);

        //2. Map
        licence.remove("BMW");
        System.out.println(licence);

        //3. Set
        colours.remove("Black");
        System.out.println(colours);

        //4. List
        cars.remove("Toyota");
        System.out.println(cars);
    }

    public void find() {
        //1. Collection
        yearModel.contains("2016");
        System.out.println(yearModel);

        //2. Map
        licence.containsKey("Ford");
        System.out.println(licence);

        //3. Set
        colours.contains("Blue");
        System.out.println(colours);

        //4. List
        cars.contains("BMW");
        System.out.println(cars);
    }
}
