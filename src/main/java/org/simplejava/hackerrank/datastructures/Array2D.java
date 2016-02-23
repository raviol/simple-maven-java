package org.simplejava.hackerrank.datastructures;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		int mb = 1024 * 1024; 
		 
		// get Runtime instance
		Runtime instance = Runtime.getRuntime();
 

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
        //start calculating
        int top, middle, bottom, total, max = 0;
        max = -100;
        for(int i=0; i<4; i++){
        	for(int j=0;j<4;j++){
	        	top = arr[i][j] + arr[i][j+1] + arr[i][j+2];
	        	middle = arr[i+1][j+1];
	        	bottom =  arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
	        	total = top + middle + bottom;
	        	if(max<total){
	        		max=total;
	        	}
//	        	System.out.println("top: " + top + " middle: " + middle + " bottom:" + bottom + " total:" + total);
        	}
        }
        System.out.println(max);
        
        
		System.out.println("***** Heap utilization statistics [MB] *****\n");
		 
		// available memory
		System.out.println("Total Memory: " + instance.totalMemory() / mb);
 
		// free memory
		System.out.println("Free Memory: " + instance.freeMemory() / mb);
 
		// used memory
		System.out.println("Used Memory: "
				+ (instance.totalMemory() - instance.freeMemory()) / mb);
 
		// Maximum available memory
		System.out.println("Max Memory: " + instance.maxMemory() / mb);
		
	}

}
