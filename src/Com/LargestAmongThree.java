package Com;

 public class LargestAmongThree {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=40;

        if(a>=b && a>=c){
            System.out.println("a is largest");
        }
        else if(b>=a && b>=c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");

        }

    }
 }
