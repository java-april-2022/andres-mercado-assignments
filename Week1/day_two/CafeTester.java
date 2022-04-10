package Week1.day_two;

public class CafeTester {
    public static void main(String[] args) {
        Cafe myCafe=new Cafe();
        myCafe.chaiLatte();
        myCafe.americano("Danny");
        myCafe.buildMenu();
        myCafe.customerList();
        myCafe.dripCoffee();
        
        

        System.out.println(myCafe.customerList());
        myCafe.customerFavorites();
        
    }
    // Array
    // ArrayList
    // HashMap
}
