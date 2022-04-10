package Week1.CafeBusinessLogic;
import java.util.ArrayList;
import java.util.Arrays;


public class CafeUtil {
    public void getStreakGoal(){
        int[] numbers=new int[10];
        numbers[0]=1+2+3+4+5+6+7+8+9+10;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        numbers[7]=8;
        numbers[8]=9;
        numbers[9]=10;
        System.out.println(Arrays.toString(numbers));
        
     }

     double getOrderTotal(double[] prices){
        double total = 0;

         for(int i=0; i < prices.length; i++) {
            total = total + prices[i];
         }
             return total;
    } 
        


    public void displayMenu(){
        ArrayList<String> menuItems=new ArrayList<>();
        menuItems.add("Drip Coffee");
        menuItems.add("Cappucino");
        menuItems.add("late");
        menuItems.add("mocha");
        System.out.println(menuItems);
       for(int i =0; i<menuItems.size(); i++){
           System.out.printf("%s %s", i, menuItems.get(i));
       }

    
     }

     public void addCustomer(ArrayList <String> customer){
        //  userName.add("Please Enter your name");
        //  customer.add("");
        //  customer.add("aron");
        String userName = System.console().readLine("Please Enter your name: ");
        // userName = "";
        System.out.println("hello " + userName);
        System.out.println(userName);
        System.out.printf("There are %s people in front of you", customer.size());
        customer.add(userName);
        // String name = listOfNames.(0);
        // System.out.printf(" There are", + userName.size());

}
    // ArrayList <String> customers = new ArrayList<String>();
    // String userName = System.console().readLine("Please Enter your name: ")
    // for(int i=0; i<4; i++){
    //     System.out.println("\n");


    // }








     
    
}
