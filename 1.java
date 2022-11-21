//function to convert a number into base 3 number
static void convert_Ternary(int n)
    {

        if (n == 0)
            return;
        int x = n % 3;
        n /= 3;
        if (x < 0)
            n += 1;
        convert_Ternary(n);
        if (x < 0)
            System.out.print( x + (3 * -1));
        else
            System.out.print( x);
    }
 static void convert(int decimal)
    {
        System.out.print("Ternary number of " +decimal +" is: ");


        if (decimal != 0) {
            convert_Ternary(decimal);
        }
        else
            System.out.println("0" );
    }
