package guviprogram;

import java.util.Scanner;

public class StringArbitary {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	//Scanner s=new Scanner(System.in);
	String str="";
	String s="";
	int sto;
	str=sc.nextLine();
	s=sc.nextLine();
	
	int i=(str.length());
	int j=s.length();
	sto=i*j;
	System.out.println(sto);

}
}
