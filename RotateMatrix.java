import java.util.Scanner;
//main class of this java file
public class RotateMatrix{
//main function of this java class
  public static void main(String [] args){
//now define a Scanner(input) ariable of this java file
     Scanner input = new Scanner(System.in);
     //define the matrix to store the elements
     int[][] Matrix = new int[3][3];
     int column = 0;
     int row = 0;
     int element = 0;
     //take the input of matrix elements from user
     System.out.println("number of columns in Matrix = ");
     for(column = 0; column < 3; column++){
       //number of row in Matrix
       for(row = 0; row < 3; row++){
         //variable of input elements of Matrix
         int inelement = input.nextInt();
         Matrix[column][row] = inelement;
       }
     }
System.out.println("Entered Matrix is = ");
     //print the inserted Matrix on display
     for(column = 0; column < 3; column++){
       //number of row in Matrix
       for(row = 0; row < 3; row++){
         //get the element from the matrix according the column and row index
        int outelement = Matrix[column][row];
        //print the element according the row and column number
        System.out.print(outelement + "\t");
       }
       System.out.print("\n");
     }

//this code will help to ratate the Matrix
     System.out.println("Rotated Matrix = ");
     for(row = 0; row < 3; row++){
       for(column = 2; column >= 0; column--){
         //get the element from the matrix accoeding the row and column
         element = Matrix[column][row];
         //print the accessed element in index
         System.out.print(element + "\t");
       }
       //forward the curser in next line
       System.out.print("\n");
     }
  }
}
