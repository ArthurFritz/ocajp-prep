package beyond.leason.two;

public class Wrapper {
    public static void main(String[] args) {
       Double d1 = new Double(22.5);
       Double d2 = new Double("12.12");
       //Double d2 = new Double("12,12");//NumberFormatException
       //Double d3 = new Double("NumberFormatException");

        Character c = new Character('a');// do not have constructor string

        Boolean b1 = new Boolean(true);//true
        Boolean b2 = new Boolean("true");//true
        Boolean b3 = new Boolean("TrUe");//true
        Boolean b4 = new Boolean("verdadeiro");//false
        Boolean b5 = new Boolean("true ");//false
        Boolean b6 = new Boolean("false");//false

        //wrapper -> primitivos

        Long l = new Long(123);
        //xxxValue;
        l.longValue();
        long l1 = l.longValue();
        int i = l.intValue();
        double d = l.doubleValue();

        boolean bool = new Boolean("T").booleanValue();
        char c1 = new Character('C').charValue();

        //String => primivo
        //parseXXX

        double d20 = Double.parseDouble("12.12");
        int i20 = Integer.parseInt("123123");
        int i21 = Integer.parseInt("10",10);
        int i22 = Integer.parseInt("11",16);
        int i23 = Integer.parseInt("11",8);
        int i24 = Integer.parseInt("A",16);
        long l24 = Long.parseLong("010101",2);//binary

        //String => wrapper
        //constructor or valueOf
        Double d21 = new Double(23.7);
        Double d22 = Double.valueOf(23.7);
        int i30 = Integer.valueOf("23");
        int i31 = Integer.valueOf("23AF", 16);

        //primitivo => String
        //toString

        String d40 = Double.toString(23.2);
        String i40 = Integer.toString(123,10);

        //wrapper -> String
        //toString
        d21.toString();


        /*
            boolean = Boolean
            byte = Byte
            short = Short
            int = Integer
            char = Character
            long = Long
            double = Double
            float = Float
        */
    }
}

