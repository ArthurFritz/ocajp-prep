package loops.leason.one;

public class TestWhile {
    public static void main(String[] args) {

        int i = 1;
        while( i < 10 ){
            System.out.println(i);
            i++;//loop infinite
        }

        i = 1;
        while( i < 10 )
            System.out.println(i++);

        // not compile, because never execute i++
        //while(true)
        //    System.out.println(i);
        //    i++;

        // not compile, because never execute i++
        // final truee = true;
        //while(truee)
        //    System.out.println(i);
        //    i++;

        //Also does not compile when it is false explicitly
    }
}
