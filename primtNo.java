package guviprogram;

import java.util.Scanner;

public class primtNo {
public static void main(String[] args){
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	int rem = 0,count = 0;
	rem=num/10;
	int sum=num;
		while(num!=0){
			rem=num%10;
			count=count*10+rem;
			num=num/10;
		}
		if(count==sum){
		System.out.println(" prime");
		}
		else{
			System.out.println("prime not");
		}
	}
}

