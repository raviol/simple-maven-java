/**
 * 
 */
package org.simplejava.hackerrank.datastructures;

import java.util.Scanner;
/**
 * @author Brandon
 *
 */
public class ArraysQ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder strOutput = new StringBuilder();
        
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i=n-1; i>=0; i--){
        	strOutput.append(arr[i]).append(" ");
        }
        System.out.println(strOutput);
	}

}
