import java.util.*;
public class Func{
    public static void main(String args[]){
        int n;
        Scanner snr= new Scanner(System.in);
        n=snr.nextInt();
        snr.close();

        System.out.println(" fib number is: "+fib(n)); 

    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        // Base cases return itself 0 and 1
        else if(n==1){
            return 1;
        }
        else{
        	
            return fib(n-1)+fib(n-2);
            
           
            // Recursive calls
       
        }

    }
    

}
