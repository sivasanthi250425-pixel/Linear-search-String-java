

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		 String target=sc.nextLine();
		 boolean isfound=false;
		 String[] cartoon = {"doraemon","shinchan","bheem","dora"};
		 for(int i=0;i<cartoon.length;i++) {
			 if(target.equals(cartoon[i])) {
		        System.out.println("index:"+i);
		        isfound=true;
		        break;
		 }
		 }
			 if(!isfound) {
				 System.out.println("not found");
			 }
		 
		 sc.close();
	 }

}
