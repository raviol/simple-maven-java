package org.simplejava.hackerrank.introduction;

import java.util.Scanner;

public class JLoops {
	
	//recursion
	static int getValue(int a, int b, int n){
		if(n==1){
			return(a+(int)Math.pow(2, n-1)*b);
		}else{
			return(getValue(a,b,n-1) + (int)Math.pow(2, n-1)*b);
		}
	}
	
	static void printAnswer(int a, int b, int n){
		for(int i=1; i<=n; i++){
			System.out.print(getValue(a, b, i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {		
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a, b, n = 0;
        for(int i=0; i<t; i++){
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            printAnswer(a,b,n);
        }
	}
}
