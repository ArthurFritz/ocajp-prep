package exception.leason.four;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

class AcessFile{
    InputStream inputStream = new FileInputStream("a");
    AcessFile() throws FileNotFoundException { //its necessary because possible exception variable

    }
}

class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException(String s) {
        super(s);
    }
}

class GoodAccount {
    double balance = 200;
    void withdraw(double quantity) throws BalanceInsufficientException {
        if(this.balance < quantity) {
            //throw new IllegalArgumentException("Not found enough balance, to balance is " + this.balance + " is less your withdraw for " + quantity);
            throw new BalanceInsufficientException("Not found enough balance, to balance is " + this.balance + " is less your withdraw for " + quantity);
        }
        balance -= quantity;
    }
}

class TestTryException2 {
    static void method1(){
        try {
            new GoodAccount().withdraw(500);
        }catch (NullPointerException ex) {
            System.out.println("trait npe");
        }catch (RuntimeException ex){ //order exceptions
            System.out.println("trait npe");
        }catch (BalanceInsufficientException ex){
            System.out.println("trait Balance");
        }
    }
    public static void main(String[] args) {
        method1();
    }
}

class TestTryException {

    public static void method1(){
        System.out.println("first before");
        try {
            method2();
            System.out.println("first after");
        }catch(NullPointerException ex){
            System.out.println("trait");
        }
        System.out.println("end method one");
    }

    public static void method2(){
        String s = null;
        System.out.println("second before");
        s.length();
        System.out.println("second after");
    }

    public static void main(String[] args) {
        method1();
    }
}
