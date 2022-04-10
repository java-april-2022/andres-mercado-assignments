package Week1.day_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Cafe {

    public void chaiLatte() {
        System.out.println("Welcome, here is your chai");
    }
    public void americano(String name){
        System.out.printf("Welcome %s, here is your americano", name);
    }
    public void dripCoffee() {
        System.out.printf("Welcome, here is your drip cofee");
    }

    // Array
    public void buildMenu() {
        String[] menu={"chai","hot chocolate", "Frappuccino"};
        System.out.println(menu[0]);
        System.out.println(Arrays.toString(menu));
        for (String item : menu) {
            System.out.println(item);
        }
        int[] numbers=new int[5];
        numbers[0]=10;
        numbers[1]=20;
        try {
            numbers[6]=90;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("hey you neec more work");
        
        }
        System.out.println(Arrays.toString(numbers));

        
    }


    public ArrayList <String> customerList(){
        ArrayList<String> customers=new ArrayList<>();
        customers.add("Sara");
        customers.add("diana");
        customers.add("Jamal");
        customers.add("reena");
        customers.remove(3);
        System.out.println(customers);
        System.out.println(customers.get(2));
        System.out.println(customers.size());
        return customers;
    }
    public void customerFavorites(){
        HashMap<String,String> favorites=new HashMap<String,String>();
        favorites.put("Reena","GreenTea");
        favorites.put("Josh","Oolong Tea");
        favorites.put("Alex", "Espresso");
        favorites.put("herlan","Passion Fruit");
        favorites.put("diana", "lemonade");

        System.out.println(favorites.get("Josh"));
        System.out.println("number of favorites in drinks in cafe:\t" + favorites.size());
        System.out.println(favorites);
        for (String key : favorites.keySet()) {
            System.out.printf("%s's favorite drink in cafe is %s\n",key,favorites.get(key));
            
        }
    }
}
