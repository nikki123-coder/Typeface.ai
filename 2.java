import java.io.*;
import java.util.*;
class str {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = s2.length();
        int m = s1.length();
        int count=0;
        char ch = s2.charAt(n-1);
        for(int i=0;i<m;i++){
            if(s1.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}