//To find even number and its addtion

package javaApp;

import java.util.Scanner;

public class EvenNum {

    public static void main(String[] args) {
        //int num = Integer.parseInt();
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter a number- ");
    	int num= sc.nextInt();
        int even[] = new int[num];
        int sum = 0,j = 0;
        int temp=num;
        String evennums = "";
        //Insert your code here
        
        	for(int i=1;num>0;i++){
          if(i%2==0)
          {
        	  even[j]=i;
        	  if(temp!=i) {
        	  evennums=evennums+even[j]+",";
        	  }
        	  else {
        		  evennums=evennums+even[j];  
        	  }
        	  sum=sum+i;   
        	  j++;
          }
          num--;
        }
        System.out.println(evennums);
        System.out.println(sum);
    }
}