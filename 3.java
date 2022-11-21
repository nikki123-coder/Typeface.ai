import java.util.Scanner;

public class lcd {
   public static boolean isValid(int n){
        if(n== 0 || n== 1 || n== 2 || n== 5 || n== 8 || n== 6 || n== 9)
            return true;
        return false;
    }
    public static boolean validate(int n)
    {
        int digit = n % 10;
        while (n != 0)
        {
            int curr_digit = n% 10;
            n= n / 10;

            if (!isValid(curr_digit))
            {
                return false;
            }
        }
        return true;
    }
     public static int findnth_number(int n)
    {
        int number=1,bounds=1;

        while(number<10){
            if(isValid(number)){
                if(bounds == n)
                    return number;
                number++;
                bounds++;
            }
            else number++;
        }

        while(bounds!= n){
            if(validate(number)){
                bounds++;
                number++;
            }
            else number++;
        }

        return number;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int result = findnth_number(n);
        System.out.println(result);


    }
}
