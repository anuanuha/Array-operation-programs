package array;

import java.util.Scanner;

public class dynamic_array_float {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the array");
	      int size=sc.nextInt()	;
	      float[] arr = new float[size];
	      System.out.println("enter the array values");
	      for(int i=0;i<arr.length;i++)
	      {
	    	   arr[i]=sc.nextFloat();
	    	  //System.out.print(arr[i]=sc.nextInt());
	      }
	      System.out.println("the array values are:");
	      for(int i=0;i<arr.length;i++)
	      {
	    	  System.out.print(arr[i]+" ");
	      }

	    }

}
