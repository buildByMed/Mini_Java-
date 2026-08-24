class pokki
{
  int count1=0;
  static int count2 = 0;
  void count()
  {
    count1++;
    count2++;
  }
  void display()
  {
    System.out.println(count1);
    System.out.println(count2);
  }

  public static void main(String args[]){
    pokki c1 = new pokki();
    pokki c2 = new pokki();
    pokki c3 = new pokki();

    c1.count();
    c2.count();
    c2.count();

    c1.display();
  }
}