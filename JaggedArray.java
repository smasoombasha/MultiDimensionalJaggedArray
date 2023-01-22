package CoreJavaYouTube.Array;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the columns size : ");
        int n = sc.nextInt();
        int nums[][]= new int[n][];
        sc.close();
        // Creating random numbers
       // int random = (int )(Math.random() *10); 
        //Assigning the random values to jagged array for size of rows 
        for(int i=0;i<n;i++)nums[i]=new int[(int )(Math.random() *10)];
       // nums[0]=new int[random];
       // nums[1]=new int[random];
       // nums[2]=new int[random];


        for(int i=0;i<n;i++){
            for(int j=0;j<nums[i].length;j++){ 
                nums[i][j]=(int )(Math.random() *10);
            } 
        }
        //Printing the multidimensional Jagged Array
        for(int i=0;i<n;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(" "+nums[i][j]);
            }
            System.out.println();
        }
    } 
}
