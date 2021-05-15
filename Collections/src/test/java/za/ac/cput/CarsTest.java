/*
Tatum De Wet
218069227
ADP372S Assignment 2
 */

package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

public class CarsTest implements CollectionsTest{

    //1. Map
    HashMap<String, String> licence = new HashMap<String, String>();

    public void setMap(HashMap<String, String>licence) {
        licence.put("BMW","CAA129401");
        licence.put("Tesla","CY28937529");
        licence.put("Ford", "CA2483592");
    }

    //2. Set
    String[] arr = {"Blue", "Black", "Silver"};
    TreeSet<String> colours = new TreeSet<String>(Arrays.asList(arr));

    //3. List
    ArrayList<String> cars = new ArrayList<String>(Arrays.asList("Toyota", "BMW", "Tesla"));

    @Test
    public void testAdd(){
        //1. Map
        setMap(licence);
        System.out.println(licence);
        licence.put("Toyota", "CA1234567");
        System.out.println("Map Added Toyota: " + licence + "\n");

        //2. Set
        System.out.println(colours);
        colours.add("White");
        System.out.println("Set Added colour White: " + colours + "\n");

        //3. List
        System.out.println(cars);
        cars.add("Ford");
        System.out.println("List Added car Ford" + cars + "\n");
    }

    @Test
    public void testRemove(){
        //1. Map
        setMap(licence);
        System.out.println(licence);
        System.out.println("HashMap Removed BMW: " + licence.remove("BMW"));
        System.out.println(licence + "\n");

        //2. Set
        System.out.println(colours);
        System.out.println("Set Removed colour Black: " + colours.remove("Black"));
        System.out.println(colours + "\n");

        //3. List
        System.out.println(cars);
        System.out.println("List Removed car Toyota: " + cars.remove("Toyota"));
        System.out.println(cars + "\n");
    }

    @Test
    public void testFind(){
        //1. Map
        setMap(licence);
        System.out.println(licence);
        System.out.println("HashMap finds Ford: " + licence.containsKey("Ford") + "\n");

        //2. Set
        System.out.println(colours);
        System.out.println("Set finds colour Blue: " + colours.contains("Blue") + "\n");

        //3. List
        System.out.println(cars);
        System.out.println("List finds BMW: " + cars.contains("BMW") + "\n");
    }
}
