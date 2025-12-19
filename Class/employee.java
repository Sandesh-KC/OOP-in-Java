//2. Creating a class with employee with instance variables name, age, salary. then creating parameterized method setInfo() and showInfo(). creating test class and object of employee class then, setting and printing employee details. 
class Employee {
  private String name;
  private int age;
  private double salary;

  public void setInfo(String name, int age, double salary) {
    this.name=name;
    this.age=age;
    this.salary=salary;
  }
  public void showInfo() {
    System.out.println("Employee details are: ");
    System.out.println("Name= "+name+" "+"Age= "+age+" "+"Salary= "+salary);
  }
}

class Test {
  public static void main (String[] args) {
    Employee e = new Employee();
    e.setInfo("Hari", 25, 35000);
    e.showInfo();
  }
}