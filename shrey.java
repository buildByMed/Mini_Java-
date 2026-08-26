import java.util.*;
class shrey{
  int operator(int a, int b){
    return (a + b);
  }
  int operator(int a, double b){
    return (a - (int)b);
  }
  int operator(double a, int b){
    return ((int)a * b);
  }
  int operator(double a, double b){
    return ((int)a / (int)b);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st variable");
    int x = sc.nextInt();
    System.out.println("Enter 2nd variable");
    int y = sc.nextInt();
    
    
    shrey s1 = new shrey();
    shrey s2 = new shrey();
    shrey s3 = new shrey();
    shrey s4 = new shrey();

    int t = s1.operator(x,y);
    int r = s2.operator(x,(double)y);
    int e = s3.operator((double)x,y);
    int w = s4.operator((double)x,(double)y);
    System.out.println("Sum is " + t);
    System.out.println("difference is " + r);
    System.out.println("product is " + e);
    System.out.println("division is " + w);

    
    
  }
}