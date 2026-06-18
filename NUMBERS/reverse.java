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
