// Abstract parent class
abstract class Bank {
    abstract public void intrestRate();
}

// Concrete child classes
class HDFC extends Bank {
    @Override
    public void intrestRate() {
        System.out.println("HDFC Interest Rate: 7.5%");
    }
}

class SBI extends Bank {
    @Override
    public void intrestRate() {
        System.out.println("SBI Interest Rate: 6.8%");
    }
}

class ICICI extends Bank {
    @Override
    public void intrestRate() {
        System.out.println("ICICI Interest Rate: 7.2%");
    }
}

// Main abstract class
public abstract class Abstract {
    public static void main(String[] args) {
        Bank hdfc = new HDFC();
        Bank sbi = new SBI();
        Bank icici = new ICICI();

        hdfc.intrestRate();
        sbi.intrestRate();
        icici.intrestRate();
    }
}