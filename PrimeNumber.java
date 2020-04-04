package javaApp;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primesum(20));
    }

    static long primesum(int maxNum) {
        int sum = 0, num;
        //insert your code here
        if(maxNum<=0)
        {
          return 0;
        }
        for(int i=1;maxNum>0;i++){
          if(i/2==1 || i/2==0)
          {
        	  sum=sum+i;
        	  System.out.println(sum);
          }
          maxNum--;
        }

        return sum;
    }
}