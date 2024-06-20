import java.util.*;
public class LeetCode_Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum=0;
        for(int i=0;i<seats.length;i++)
        {
            sum=sum+Math.abs(seats[i]-students[i]);
        }
        return sum;

    }
    public static void main(String args[])
    {
        int seats[]={3,1,5};
        int students[]={2,7,4};
        LeetCode_Solution solution=new LeetCode_Solution();
        System.out.println(solution.minMovesToSeat(seats,students));
    }
}
