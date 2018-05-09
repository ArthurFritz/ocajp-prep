package loops.leason.four;

public class TestLoops {
    public static void main(String args[]){

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for(int i =1; i< 10; i ++){
            System.out.println(i);
            array1[i] = i;
        }
        for (int i : array1){

        }
        for (int i: array2){

        }

        int j = 9;

        while (j<10){
            System.out.println("while " + j);
            j++;
        }

        for(; j<10;){
            System.out.println("for" + j);
            j++;
        }
        j=9;
        for(; j<10;j++){
            System.out.println("for" + j);
        }

        for(j=9; j<10;j++){
            System.out.println("for" + j);
        }

        do{
            System.out.println("do...while " + j);
            j++;
        }while(j < 10);


    }
}
