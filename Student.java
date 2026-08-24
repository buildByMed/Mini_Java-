class Student{
  static int count;
  Student(){
    count++;
    System.out.println(count);
  }
  public static void main(String args[]){
    Student c1 = new Student();
    Student c2 = new Student();
    Student c3 = new Student();

  }

}