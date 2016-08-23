package logicbuild;

import java.util.Scanner;

public class Camelcase {
public static void main(String args[]){
	String str="";
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	String rem=""; 
			if(Character.isLowerCase(str.charAt(0))){
			rem=rem+Character.toUpperCase(str.charAt(0));
			}
			rem=rem+str.substring(1);
	System.out.println(rem);
}
}
