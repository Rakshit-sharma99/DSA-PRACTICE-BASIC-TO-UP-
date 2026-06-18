package NUMBERS;

public class reverse {
    public int reverseNumber(int n){
        int rev = 0;
        while(n>0){
            
            int last = n %10;
            rev = rev *10 + last;
            n = n/10;
        }
            return rev;
    }
    public static void main(String[] args) {
          reverse obj = new reverse();
        int num = 12345;
        System.out.println(obj.reverseNumber(num));
    }    
}
//leetcode. quesetion 7 class Solution {
//     public int reverse(int x) {
//          int rev = 0;
       
//          while(x!=0){
//             int l = x %10;
//              if (rev > Integer.MAX_VALUE / 10 ||
//                (rev == Integer.MAX_VALUE / 10 && l > 7))
//                 return 0;

//             if (rev < Integer.MIN_VALUE / 10 ||
//                (rev == Integer.MIN_VALUE / 10 && l < -8))
//                 return 0;

//             rev = rev*10+l;
//             x = x/10;

//          }
//          return rev;

//     }
// }
