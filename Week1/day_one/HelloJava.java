package Week1.day_one;

/**
 * HelloJava
 */
public class HelloJava {
    
    //entry point

    public static void main(String[] args) {
        System.out.println("Hello Team java!!!");
        // primitive type
        byte myAge=80;
        int myInt=27973973;
        long myLong=1438;
        float myFloat=160.90f;
        double myDouble=180.2372937283728;


        //non-primitive type
        String student="richard";
        System.out.println("Hello wELCOME TO MEXICO, " + student.toUpperCase());
        System.out.println(student.length());
        greet();
        greet("Danny");
        greet("JOsh", "Data Science");
        System.out.println(evenOdd(130));
        System.out.println(evenOdd(131));
        OneTo255();

    }
    //method overloading
    public static void greet() {
        System.out.print("Hello,welcome to coding dojo!");

        
    }
    public static void greet(String studentName) {
        System.out.println("Welcome to coding Dojo," + studentName);
    }
    public static void greet(String studentName, String stack) {
        System.out.printf("Welcome to coding Dojo %s to %s", studentName , stack);
    }
    
    public static String evenOdd(int number) {
        if(number%2 == 0){
            return String.format("\n%d Is Even", number);
        }else{
            return String.format("%d Is odd", number);

        }
        
    }
    // loops
    public static void OneTo255() {
        for(var i=0; i<=256; i++){
            System.out.println(evenOdd(i));
            
        }
        
    }

}