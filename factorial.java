import java.util.Scanner;
//factorial of numbers
public class factorial{
    public static void factorial(int n) {

        if (n<0){
            System.out.print("Invalid Number");
            return;
        }
        int factorial = 1;
        
        for (int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.print(factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        factorial(n);
    }
}