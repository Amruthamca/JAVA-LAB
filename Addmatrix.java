/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addmatrix;
import java.util.*;
public class Addmatrix {
    Scanner sc=new Scanner(System.in);
    int row;
    int column;
    int[][] array = new int[10][10];
      public void get_metrix(){
        int r,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        row = sc.nextInt();
        System.out.print("Enter the number of column  : "); 
        column = sc.nextInt();
        System.out.print("Enter matrix elements : ");
        for(r=0;r<row;r++){
            for(c=0;c<column;c++){
                array[r][c] = sc.nextInt();
            }
        }
    }
       static Addmatrix sum(Addmatrix c1, Addmatrix c2) {
        int r, c;
        Addmatrix temp = new Addmatrix();

        if (c1.row == c2.row && c1.column == c2.column) {
            temp.row =c1.row;
            temp.column = c1.column;
            for (r = 0; r < c1.row; r++) {
                for (c = 0; c < c1.column; c++) {
                    temp.array[r][c] =  c1.array[r][c] +  c2.array[r][c];
                }
            }
        } 
        else {
            System.out.println("Order of matrixs is not same ");
        }

        return temp;
    }

    public void display_matrix(){
        int r,c;
        for(r=0;r<row;r++){
            for(c=0;c<column;c++){
                System.out.print(array[r][c] + "\t" );
              
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Addmatrix first = new Addmatrix();
        Addmatrix second = new Addmatrix();
        Addmatrix temp = sum(first, second);

        first.get_metrix();
        second.get_metrix();
        temp = sum(first,second);
        System.out.println("......AfterMatr Addition.......");
        temp.display_matrix();
       
    }
    
}
