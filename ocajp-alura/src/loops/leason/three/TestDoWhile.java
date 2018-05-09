package loops.leason.three;

public class TestDoWhile {
    public static void main(String args[]){
        int i = 20;
        while (i<10){
            System.out.println(i);
            i++;
        }

        int j = 20;
        do{
            System.out.println(j);
            j++;
        }while (j < 10);

        do
            System.out.println(j++);
        while (j < 10);

        int x = 0;
        do; while(x++<10);
    }
}
