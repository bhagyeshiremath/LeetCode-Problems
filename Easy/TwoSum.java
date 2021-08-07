import java.util.Scanner;
import java.util.Arrays;
//import java.util.HashMap;
public class TwoSum
{
    public static void main(String[] args) 
    {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the size of array :- ");
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n ; i++)
        {
            System.out.print("a " + i +" :- ");
            a[i] = scn.nextInt();
        } 
    System.out.print("Enter the target :- ");
    int tar = scn.nextInt();
    System.out.println(Arrays.toString(twosum(a , tar)));
    scn.close();     
    }
    public static int[] twosum(int[] nums, int target)
    {
        int[] index = new int[2];
       // HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < nums.length -1; i++)
        {
            for(int j = i +1 ; j < nums.length  ; j++)
            {
                //if(Arrays.binarySearch(nums , target - nums[i]) >= 0)
                if(nums[i] +nums[j] == target)
                {
                    index[1] = j;
                    // index[1] = map.get(target - nums[i]);
                    //index[0] = Arrays.binarySearch(nums, target - nums[i]);
                    index[0] = i;
                    //return index;
                }
            }
            //mp.put(i, nums[i]);
        }
        return index ;
    }
}
