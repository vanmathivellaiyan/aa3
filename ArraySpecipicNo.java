package guviprogram;

import java.util.Scanner;

public class ArraySpecipicNo {
public static void main(String args[]){
	int aa[]=new int[5];
	int bb[]=new int[5];
	Scanner sc=new Scanner(System.in);
	int num = 0;
	for(int i=0;i<5;i++){
		bb[i]=sc.nextInt();
	}
	num=sc.nextInt();
	for(int m=0;m<5;m++){
		for(int n=0;n<5;n++){
			if(m!=n){
				if(num==aa[m]+bb[n]){
			System.out.println(aa[m]+""+bb[n]);
			}
		}
	
	}
	
	}
}
}
