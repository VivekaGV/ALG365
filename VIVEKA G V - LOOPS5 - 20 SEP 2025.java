public class Loops5 {
  // Functio to print egde only - first row and first column
  public static void printegde(int number){
    for( int row = 0 ; row < number ; row++){
        for(int column =0 ; column < number ; column++){
            if( row == 0 || row ==number-1 || column ==0 || column== number-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
  }

// Function to print the pyramid
public static void printPyramid(int height) {
    int countStars = 1;

    for (int level = 1; level <= height; level++) {
        int noOfSpaces = height - level; 

       
        for (int count = 0; count < noOfSpaces; count++) {
            System.out.print(" ");
        }

        for (int count = 0; count < countStars; count++) {
            System.out.print("*");
        }

        System.out.println();
        countStars += 2;
    }
}
// Function to print an inverted pyramid
public static void printInvertedPyramid(int height) {
    int countStars = 2 * height - 1; 

    for (int level = 1; level <= height; level++) {
        int noOfSpaces = level - 1; 

        // print spaces
        for (int count = 0; count < noOfSpaces; count++) {
            System.out.print(" ");
        }

        // print stars
        for (int count = 0; count < countStars; count++) {
            System.out.print("*");
        }

        System.out.println();
        countStars -= 2; 
    }
}



    public static void main(String[] args) {
        printegde(5);
       printPyramid(5);
    }
}
