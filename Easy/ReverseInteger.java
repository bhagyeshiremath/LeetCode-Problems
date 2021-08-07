import java.util.Scanner;
public class ReverseInteger
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no :- ");
        long n = scn.nextLong();
        System.out.print("Reversed integer is " + reverse((int)n));
        scn.close();
    }

    public static int reverse(int x) {
        long rev = 0 ; 
       /* boolean flag = false;
        * This section is just to convert negative integer into positive
        if(x < 0)
        {
            flag = true ;
            x = x * -1;
        }*/
        while(x != 0)
        {
            rev = rev * 10;
            rev = rev + (x % 10);
            x = x /10;
            
        }
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            {
                return 0;
            }
        return (int)rev;
    }
}