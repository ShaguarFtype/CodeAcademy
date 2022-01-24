/**
This program is a simple calculator that can add, subtract, multiply, and divide
*/
public class Calculator
{
  public static void main(String[] args)
  {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
  }

   public Calculator()
  {

  }

  public int add(int numA, int numB)
  {
    int sum = 0;
    sum = numA + numB;
    return sum;
  }

  public int subtract(int num1, int num2)
  {
    int sum = 0;
    sum = num1 - num2;
    return sum;
  }

  public int multiply(int numX, int numY)
  {
    int product = 0;
    product = numX * numY;
    return product;
  }

  public double divide(double numA, double numB)
  {
    double answer = 0.0;
    answer = numA / numB;
    return answer;
  }

  public int modulo(int numX, int numY)
  {
    int mod = 0;
    mod = numX % numY;
    return mod;
  }

}