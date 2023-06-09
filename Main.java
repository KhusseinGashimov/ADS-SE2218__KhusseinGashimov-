import java.util.Scanner;
    public class Main {
        static int minimumInArray(int n, int[] nums){
            if(n==1)
                return nums[0];
            else
                return Math.min(nums[n-1], minimumInArray(n-1, nums));
        }
        static double average(int n, int[] nums){
            if (n == 0) {
                return 0;
            } else {
                return (nums[n-1] + (n-1)*average(n-1, nums))/n;
            }
        }
        static boolean isPrimeRecursive(int n) {
            if (n <= 1) {
                return false;
            }
            return isPrimeRecursiveHelper(n, 2);
        }

        static boolean isPrimeRecursiveHelper(int n, int i) {
            if (i > Math.sqrt(n))
                return true;
            else if (n % i == 0)
                return false;
            else
                return isPrimeRecursiveHelper(n, i+1);

        }
        static int factorial(int n){
            if (n==1)
                return 1;
            else
                return n*factorial(n-1);
        }
        static int fib(int n){
            if(n<=1)
                return n;
            return fib(n-1)+fib(n-2);
        }
        static int twice(int a,int b){
            int answer = 1;
            if (b==0)
                return answer;
            else
                return answer=a*twice(2,b-1);
        }
        static String reverse(int n, int[] nums){
            String ans = "";
            if(n==0)
                return ans;
            else
                return ans+=nums[n-1]+" "+ reverse(n-1,nums);
        }
        static boolean isStr(String s){
            if(s.isEmpty())
                return true;
            else
                return !Character.isDigit(s.charAt(0))?false:isStr(s.substring(1));
        }
        static int bin(int n, int k){
            if(k==0 || k==n)
                return 1;
            else
                return bin(n-1,k-1)+bin(n-1,k);
        }
        static int gcd(int a, int b) {
            return b==0 ? a : gcd(b,a%b);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(gcd(a,b));
        }
    }
