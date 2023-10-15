package Assignment;

import java.util.Scanner;

public class Pangram {
	public static void main(String args[]){
		//to provide input
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Your String:");

		String str=sc.nextLine();

		// to convert all characters to lower case
		str=str.replaceAll("","").toLowerCase();

		String s="";

		// checking characters (a-z or A-Z)
		for(char i='a';i<='z';i++){

		 //if substring not found returns -1
			if(str.indexOf(i)!=-1){

				s=s+i;
			}
		}
		//  returns number or character of a string
		if(s.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
	}
}
