//basix static variable
class Calcu
{
  static void cube(int x)
  {
  int y = x*x*x;
  System.out.println(y);
  }


public static void main(String args[])
{
  Calcu.cube(2);
}
}
