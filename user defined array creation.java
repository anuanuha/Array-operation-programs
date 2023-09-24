package array;

import java.util.Scanner;

public class dynami_array_double {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the array");
	      int size=sc.nextInt()	;
	      double []arr = new double[size];
	      System.out.println("enter the array values");
	      for(int i=0;i<arr.length;i++)
	      {
	    	   arr[i]=sc.nextDouble();
	    	  //System.out.print(arr[i]=sc.nextInt());
	      }
	      System.out.println("the array values are:");
	      for(int i=0;i<arr.length;i++)
	      {
	    	  System.out.print(arr[i]+" ");
	      }

	    }
}
