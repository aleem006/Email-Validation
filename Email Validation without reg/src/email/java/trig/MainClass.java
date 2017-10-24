package email.java.trig;

import java.util.Scanner;

public class MainClass {

	/**
	 *Email Validation without regular expression 
	 *just with the help of string 
	 */
	public static void main(String[] args) {
		int count=0;
		System.out.println("enter the valid email like aleem.mohsan@gmail.com:");
		Scanner s= new Scanner(System.in);
		String e=s.nextLine();
		
		
		for(int i=0; i<e.length();i++){
			if(e.charAt(i)=='@' || e.charAt(i)=='.'){
				++count;
			}
		}
		if(count<2){
			System.out.println("invalid");
		}
		
		
		

	}

}
