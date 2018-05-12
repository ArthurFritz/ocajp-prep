package exception.leason.five;

import java.util.ArrayList;
import java.util.Date;

class StaticBlock{
    static {
        String o = null;
        o.length();
    }
}

class NewAccount{
    double balance = 100;
    public void withdraw(double quantity){
        if(balance < quantity){
            throw new IllegalArgumentException();
        }
        balance -= quantity;
    }
}

class Task{
    boolean running = false;
    void start(){
        if(running){
            throw new IllegalStateException();
        }
        running = true;
    }

    void stop(){
        running = false;
    }
}

public class TestExceptions {
    public static void main(String[] args) {

        boolean forever = true;
        ArrayList<String> a = new ArrayList<>();
        String starter  = "arthur";
        //while(forever){
        //    starter += " arthur ";
        //    a.add(starter); OutOfMemoryError
        //}

        //new TestExceptions().method(); StackOverflowError

        //new StaticBlock();//IllegalStateException first time call this class running method static.

        Task t = new Task();
        t.start();
        //t.start(); IllegalStateException

        //new NewAccount().withdraw(200); IllegalArgumentException

        String numberOne = "1a";
        //int one = Integer.parseInt(numberOne); NumberFormatException

        Object o = "arthur";
        //Date dt = (Date) o;ClassCastException

        int[] x = new int[56];
        //x[56] = 13; //ArrayIndexOutOfBoundsException

        ArrayList<String> list = new ArrayList<>();
        list.add("arthur");
        list.add("stephanie");
        //list.get(2); IndexOutOfBoundsException

        String s = null;
        //s.length();//NPE

    }

    private void method() {
        method();
    }
}
