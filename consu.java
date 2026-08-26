import java.util.*;
class consu{
  int a,b;
  consu(int a ,int b){
    
    int x = (a + b);
    System.out.println("Addition is = " + x);
  }
  consu(int a, double b){
    
    int y = a - (int)b;
    System.out.println("Difference is = " + y);
  }
  consu(double a, int b){
    
    int p = (int)a - b;
    System.out.println("Product is = " + p);
  }
  consu(double a, double b){
    
    int q = ((int)a - (int)b);
    System.out.println("Division is = " + q);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st element:");
    int a = sc.nextInt();
    System.out.println("Enter 2st element:");
    int b = sc.nextInt();

  }

}