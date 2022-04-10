package Week1.day_two;

import java.util.ArrayList;




public class Drinks {

    public ArrayList <String> drinksCost(){
        ArrayList<String> drinksCost=new ArrayList<>();
        drinksCost.add("2");
        drinksCost.add("3");
        drinksCost.add("4");
        System.out.println("cost of the drink is " + drinksCost.get(1));
        return drinksCost;
    }

    public ArrayList <String> customerName(){
        ArrayList <String> customerName = new ArrayList<>();
        customerName.add("Sam");
        customerName.add("jimmy");
        customerName.add("Noah");
        System.out.println("name of custmoer buying this drink is" + customerName);
        return customerName;
    }
}
