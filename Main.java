import java.util.Scanner;
    public class Main {
        static int minimumInArray(int n, int[] nums){
            if(n==1)
                return nums[0];
            else
                return Math.min(nums[n-1], minimumInArray(n-1, nums));
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int nums[]=new int[n];
            for (int i = 0; i < n; i++) {
                nums[i]=sc.nextInt();
            }
            System.out.println(minimumInArray(n,nums));
        }
    }
