package beyond.leason.two;

public class AutoBoxing {
    public static void main(String[] args) {
        //Java 1.4
        Integer intWrapper = Integer.valueOf("123");
        int intPrimtivo = intWrapper.intValue();
        intPrimtivo++;
        intWrapper = Integer.valueOf(intPrimtivo);

        // Java 5
        // AutoBoxing
        Integer intWrapperJ5 = Integer.valueOf("123");
        intWrapperJ5++;

    }

}


