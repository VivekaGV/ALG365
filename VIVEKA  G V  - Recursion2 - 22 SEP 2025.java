public class Recursion2 {
// Recursive Function
    public static void printrecursive(int number){
        // Termination part
        if( number ==0){
            return;
        }
        number = number -1 ;
        System.out.println("Before REcursice CAll : " + number);
        // Recursive Call
        printrecursive(number);

        System.out.println("After REcursice CAll : " +number);
    }

    // Function to Fibonnaci Series....
    public static int fibonacciprint(int number){
        if(number <=1 ){
            return number;
        }
        int result1 = fibonacciprint(number-1) ;
         System.out.println("First REcursice call : "+ result1);
        System.out.println("REcursive call value after 1: ");


         int result2 = fibonacciprint(number-2);
         System.out.println("Second REcursice call : "+result2);
        System.out.println("REcursive call value after 2: ");

        int answer = result1 + result2 ;
        return answer;
    }
    public static void main(String[] args) {
        printrecursive(5);
        System.out.println(fibonacciprint(5));
    }
    
}
