
//parent class

class Bank {
    double getInterestRate() {
      return 0;  // default interest rate  
    }
}

//child classes 
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.5; //SBI's interest rate
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 6.2;  //HDFC's interest rate
    }
}
public class Main2 {
    public static void main(String args[]) {
        Bank myBank1 = new SBI();  //Upcasting
        System.out.println("SBI Interest Rate: " + myBank1.getInterestRate());

        Bank myBank2 = new HDFC(); //Upcasting
        System.out.println("HDFC Interest Rate: " + myBank2.getInterestRate());
    }
}