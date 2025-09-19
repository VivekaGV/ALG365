
public class Loop3{

    // Function for Sequential print - USing StringBuilder 
    public static void printstarssequential(int number ){
          StringBuilder builder = new StringBuilder();
        for(int count = 0 ; count < number ; count++){
            builder.append('*');
        }
        String result = builder.toString();
        System.out.println(result);
    }
        // Function for grid print-1- USing StringBuilder 
    public static void printgrid1(int number ){
        for(int row=0; row <= number ; row++){
              StringBuilder builder = new StringBuilder();
            for(int column = 0 ; column<number;column++){
                builder.append('*');
            }
            String result = builder.toString();
                System.out.println(result);     
        }
    }

     // Function for grid print- USing StringBuilder 
    public static void printgrid2(int number ){
        for(int row=1; row <=number ;row++){
            StringBuilder builder = new StringBuilder();
            for(int column = 0 ; column < row; column++){
                builder.append('*');
            }
            String result = builder.toString();
                System.out.println(result);     
        }
    }
// Function to print stars for value of array- USing StringBuilder 
    public static void printstarsarray(int[] numbers){
        for(int index=0 ; index < numbers.length ;index++){
            StringBuilder builder = new StringBuilder();
            for(int count =0 ; count < numbers[index] ; count++){
                builder.append('*');
            }
              String result = builder.toString();
                System.out.println(result);   
        }
    }
    // Fuction to print even characters

   public static void printeven(int number) {
    StringBuilder builder = new StringBuilder();
    for (int count = 1; count < number; count++) {
        if (count % 2 == 0)
            builder.append('E');
        else
            builder.append('O');
    }
    String result = builder.toString();
    System.out.println(result);
}
    

     public static void main(String[] args) {
     /*  printstarssequential(1000);
       printgrid1(10);  
       printgrid2(10);  
       int[] array = { 2,4,3,6,3,8,2};
       printstarsarray(array);    
       */ 
       printeven(10);
    }
}
