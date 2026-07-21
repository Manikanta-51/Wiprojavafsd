class Calculator{
    static int PowerInt(int num1, int num2){
        return (int)Math.pow(num1,num2);
    }
    static double PowerDouble(double num1, double num2){
        return Math.pow(num1, num2);
    }
}
public class TestCalculator{
    public static void main(String[] args){
        System.out.println(Calculator.PowerInt(2, 3));
        System.out.println(Calculator.PowerDouble(2.5, 3.0));
    }
}