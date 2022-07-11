package Com;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its factor");
        Scanner s=new Scanner(System.in);
        int factorNumber=s.nextInt();
        for(int i=2; i<=factorNumber; i++){
            if(factorNumber % i == 0);
            System.out.print(i +"\t");
        }

    }
}
