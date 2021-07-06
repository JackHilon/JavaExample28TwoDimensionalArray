
package javaexample28twodimensionalarray;

import java.util.Scanner;


public class JavaExample28TwoDimensionalArray {

    
    public static void main(String[] args) {
        
        // int[n][m]
        // n: number of rows
        // m: number of columns. Can be different for each row.
        // int[n][m] is array of n references (arrays)
        
        Scanner in=new Scanner(System.in);
        int row=0, col=0;
        
        System.out.print("Enter number of rows (references): ");
        row=GetInteger(in);
        in.nextLine();
        System.out.print("Enter number of columns..........: ");
        col=GetInteger(in);
        in.nextLine();
        System.out.println();
        
        int[][] nums=new int[row][col];
        Initialize2DIntArray(nums, in);
        System.out.println();
        Print2DIntArray(nums);
        
    } // end main()
    
    private static void Print2DIntArray(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            PrintOneLineIntArray(arr[i]);
        }
    }
    
    private static void PrintOneLineIntArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    private static void Initialize2DIntArray(int[][] arr, Scanner input)
    {
        try{for (int i = 0; i < arr.length; i++) {
            
            InitializeOneArray(arr[i], input);
            input.nextLine();
        }
        }//end try
        catch(Exception e)
        {
            input.nextLine();
            System.out.println(e.toString());
            System.out.println("Re-initialize your array.");
            Initialize2DIntArray(arr, input);
        }
    }
    
    private static void InitializeOneArray(int[] arr, Scanner input)
    {
        try{
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
            //input.nextLine(); // to accept one item per line only!
        }
        }catch(Exception e)
        {
            input.nextLine();
            System.out.println(e.toString());
            System.out.println("Re-initialize your array.");
            InitializeOneArray(arr, input);
        }
    }
    
    public static int GetInteger(Scanner input)
    {
        int res=0;
        try{
            res=input.nextInt();
            return res;
        }catch(Exception e)
        {
            input.nextLine();
            System.out.println(e.toString());
            return GetInteger(input);
        }
    }// end GetInteger()
    
}
