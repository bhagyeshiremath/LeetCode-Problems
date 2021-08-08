import java.util.Scanner;
public class PalindromNumber
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = scn.nextInt();
        System.out.println(isPalindrome(n));
        scn.close();
    }
    public static boolean isPalindrome(int x)
    { 
        if(x < 0)
        {
            return false;
        }
        else
        {
            int result = 0;
            int temp = x;
            while(temp > 0)
            {
                result = result * 10;
                result = result + (temp % 10);
                temp = temp / 10;
            }
            if(result == x)
            {
                return true;
            }
            else
            {
                return false;
            }
        }  
    }
}