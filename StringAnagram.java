package guviprogram;

import java.util.Scanner;

public class StringAnagram {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num;
	num=sc.nextInt();
	String sum[]=new String[num];
	Scanner scc=new Scanner(System.in);
	for(int i=0;i<num;i++){
		sum[i]=scc.nextLine();
	}
	for(int i=0;i<num;i++){
		if(sum[i].equals(sum[i].toLowerCase())){
			System.out.println(sum[i]);
		}
	}
}
}
