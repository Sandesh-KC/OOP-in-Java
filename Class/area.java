//1. Find area using parameterized class
import java.util.*;
class Input {
  private double length;
  private double breadth;

  public Input(double l, double b) {
    length=l;
    breadth=b;
  }
  public double returnArea() {
    double Area = length*breadth;
    return Area;
  }
}

class area {
  public static void main (String[] args) {
    try (Scanner sc = new Scanner (System.in)) {
      System.out.println("Enter length and breadth: ");
      double l = sc.nextDouble();
      double b = sc.nextDouble();
      Input ob = new Input(l,b);
      System.out.println(ob.returnArea());
    }
  }
}