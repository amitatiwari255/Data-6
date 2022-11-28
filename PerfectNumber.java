import java.util.Scanner;
public class PerfectNumber {
	 static boolean isPerfect(int n)
	    {
	        if (n == 1)
	            return false;

	        int sum = 1;

	        for (int i = 2; i * i <= n ; i++) {

	            if (n % i == 0) {
	                if (i * i == n)
	                    sum += i;
	                else
	                    sum += i + (n / i);
	            }
	        }

	        if (sum == n)

	            return true;

	        return false;
	    }


	    public static void main(String[] args)
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the number to check whether its a perfect number or not");
	        int n = s.nextInt();

	        if (isPerfect(n))
	            System.out.println(n + " is a perfect number");
	        else
	            System.out.println(
	                    n + " is not a perfect number");
	    }
}
