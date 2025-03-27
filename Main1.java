
class Calculator {
    //Method to addd two numbers 
    int add(int a , int b) {
        return a + b;
    }
    //overloading method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    //overlaod method using different parameters
    double add(double a, double b){
        return a + b;

    }
}

public class Main1 {
    public static void main (String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));  // calls add)int, int)
        System.out.println(calc.add(5, 10, 15));  //Calls add(int, int, int)
        System.out.println(calc.add(5.5, 2.5));  //Calls add(double, double)
    }
}