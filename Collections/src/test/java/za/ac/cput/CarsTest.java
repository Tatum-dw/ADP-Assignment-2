/*
Tatum De Wet
218069227
ADP372S Assignment 2
 */

package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

public class CarsTest{
    //1. Collection
    Collection<String>yearModel = new LinkedList<String>(Arrays.asList("2012", "2016", "2008"));

    //2. Map
    HashMap<String, String> licence = new HashMap<String, String>();

    public void setMap(HashMap<String, String>licence) {
        licence.put("BMW","CAA129401");
        licence.put("Tesla","CY28937529");
        licence.put("Ford", "CA2483592");
    }

    //3. Set
    String[] arr = {"Blue", "Black", "Silver"};
    TreeSet<String> colours = new TreeSet<String>(Arrays.asList(arr));

    //4. List
    ArrayList<String> cars = new ArrayList<String>(Arrays.asList("Toyota", "BMW", "Tesla"));

    @Test
    public void testAdd(){
        System.out.println("All Add Tests:");

        //1. Collection
        System.out.println("1. COLLECTION: " + yearModel);
        yearModel.add("2018");
        System.out.println("Collection Added 2018 model: " + yearModel + "\n");

        //2. Map
        setMap(licence);
        System.out.println("2. MAP: " + licence);
        licence.put("Toyota", "CA1234567");
        System.out.println("Map Added Toyota: " + licence + "\n");

        //3. Set
        System.out.println("3. SET: " + colours);
        colours.add("White");
        System.out.println("Set Added colour White: " + colours + "\n");

        //4. List
        System.out.println("4. LIST: " + cars);
        cars.add("Ford");
        System.out.println("List Added car Ford" + cars + "\n");
    }

    @Test
    public void testRemove(){
        System.out.println("All Remove Tests:");

        //1. Collection
        System.out.println("1. COLLECTION: " + yearModel);
        System.out.println("Collection Removed 2008 model: " + yearModel.remove("2008"));
        System.out.println(yearModel + "\n");

        //2. Map
        setMap(licence);
        System.out.println("2. MAP: " + licence);
        System.out.println("HashMap Removed BMW: " + licence.remove("BMW"));
        System.out.println(licence + "\n");

        //3. Set
        System.out.println("3. SET: " + colours);
        System.out.println("Set Removed colour Black: " + colours.remove("Black"));
        System.out.println(colours + "\n");

        //4. List
        System.out.println("4. LIST: " + cars);
        System.out.println("List Removed car Toyota: " + cars.remove("Toyota"));
        System.out.println(cars + "\n");
    }

    @Test
    public void testFind(){
        System.out.println("All Find Tests:");

        //1. Collection
        System.out.println("1. COLLECTION: " + yearModel);
        System.out.println("Collection finds 2016 model: " + yearModel.contains("2016") + "\n");

        //2. Map
        setMap(licence);
        System.out.println("2. MAP: " + licence);
        System.out.println("HashMap finds Ford: " + licence.containsKey("Ford") + "\n");

        //3. Set
        System.out.println("3. SET: " + colours);
        System.out.println("Set finds colour Blue: " + colours.contains("Blue") + "\n");

        //4. List
        System.out.println("4. LIST: " + cars);
        System.out.println("List finds BMW: " + cars.contains("BMW") + "\n");
    }
}
