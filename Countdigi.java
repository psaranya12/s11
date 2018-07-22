package program;
import java.io.*;
import java.util.Scanner;
public class Countdigi {

	public static void main(String[] args) {
		int n,a=0,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Integer");
		n=in.nextInt();
		while(n!=0){
			//n=n%10;
			n=n/10;
            a=a+1;
		}
		System.out.println(a);

	}

}
