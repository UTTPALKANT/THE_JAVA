package Array;

import java.util.Scanner;

public class Marks {
   public static void main(String[] args) {
    int marks[]=new int[50];
    System.out.println("Enter your marks Alphabatically:");
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    System.out.println("Marks of English:");
    System.out.println("English:"+marks[0]);
    System.out.println("Hindi:"+marks[1]);
    System.out.println("Physics:"+marks[2]);

   
   
   }

}
