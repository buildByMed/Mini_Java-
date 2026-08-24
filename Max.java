 class Maximum {
  void max(int a,int b){
    if(a>b){
      System.out.println("larger element is:" + a);
    }
    else{
      System.out.println("Larger elements is" + b);
    }
    }
  
   void max(double a,double b){
    if(a>b){
      System.out.println("larger element is:" + a);
    }
    else{
      System.out.println("Larger elements is" + b);
    }
    }
  }
  void max(int a, int b, int c){
    System.out.println(Math.max(a,Math.max(b,c)));
  }

  public class compare{
    public static void main(String[] args){
        Maximum m = new Maximum();
        m.max(45,32);
        m.max(3.234347,3.234872);
        m.max(5,3,7);
    }
  }
  

