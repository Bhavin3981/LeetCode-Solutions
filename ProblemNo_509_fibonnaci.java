import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int a = 0;
        int b = 1;
        for(int i=0;i<n;i++){
            int c = a + b;
            a =  b;
            b =  c;            
        }
        System.out.println(a);
    }
}
