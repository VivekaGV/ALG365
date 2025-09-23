public class Array {

    // Function To print the Elements in Array

    public static void printarray(int[] newarray){
        for(int index =0 ; index<newarray.length;index++){
            System.out.println("Array Element at index " + index + " : "+ newarray[index]);
        }
        
    }

    public static void main(String[] args) {
        int[] array = {2,5,3,5};
        System.out.println("Array Length : " + array.length);
        array[0] = 10 ;
        int[] newarray = new int[3];
        newarray[0] = 98;
        newarray[1]= 456;
        newarray[2] = 67;
        printarray(newarray);
         
        System.out.println("Array Elemnts with Short For Loop");
        for(int Element : newarray){
             System.out.println("Array Element at index  : "+ Element);
        }

        // 2D Array
        int[][] matrix = new int[2][3];

        matrix[0][0]=1;
        matrix[0][1]=1;
        matrix[0][2]=1;
        matrix[1][0]=1;
        matrix[1][1]=1;
        matrix[1][2]=1;

            for (int row = 0; row < matrix.length; row++) {
               for (int column = 0; column < matrix[row].length; column++) {
                  System.out.print(matrix[row][column] + " ");
    }
    System.out.println();
}
    }
    
}
