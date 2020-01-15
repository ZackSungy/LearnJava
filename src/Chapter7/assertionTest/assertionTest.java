package Chapter7.assertionTest;

import java.util.Scanner;

public class assertionTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        assert n >= 0;
        if(n % 3 == 0){
            System.out.println("zero");
        }
        else if(n % 3 == 1){
            System.out.println("first");
        }
        else{
            assert n % 3 ==2;
            System.out.println("second");
        }
    }
}
