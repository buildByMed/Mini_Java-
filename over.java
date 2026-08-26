class over{
  String name;
  int marks;
  int roll_no;

  over(String name){
    this.name = name;
  }

  over(String name, int marks){
    this.name = name;
    this.marks = marks;
  }
    over(String name, int marks, int roll_no){
    this.name = name;
    this.marks = marks;
    this.roll_no = roll_no;
  }

  void display(){
    System.out.println("Name: " + name);
    System.out.println("Marks: " + marks);
    System.out.println("Roll No: " + roll_no);
  }
  
  public static void main(String[] args) {
    over obj1 = new over("medhansh");
    over obj2 = new over("yash",95);
    over obj3 = new over("mannat",100,1294);

  obj1.display();
  obj2.display();
  obj3.display();


  }
}