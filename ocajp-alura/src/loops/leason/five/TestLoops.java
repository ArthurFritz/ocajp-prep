package loops.leason.five;

public class TestLoops {
    public static void main(String []args){
        int i =0;
        while (i < 10){
            i++;
            if(i == 5) break;
            System.out.println("i = " + i);
        }
        System.out.println("fora do while");

        i =0;
        while (i < 10){
            i++;
            if(i == 5) continue;//jump number five e return the loop
            System.out.println("i = " + i);
        }
        System.out.println("fora do while");


        i =0;
        while (true){
            i++;
            if(i == 5) break;//allow the while true
            System.out.println("i = " + i);
        }
        System.out.println("fora do while");

        for (int j = 1; j< 10; j++){
            if (j == 8)break;
            if (j == 5)continue;
            System.out.println("for " + j);
        }

        System.out.println("----------------------");
        extern : for (i = 1; i < 10; i++){ // labels only all (loops, switch, all statments), repeat name when not use internal
            for (int j =1; j < 10; j ++){
                if(i * j == 25) break;
                System.out.println(i + " * " + j +"=" + (i*j) );
            }
        }

        System.out.println("----------------------");
        int extern = 4;//not conflict label
        extern : for (i = 1; i < 10; i++){//label for loop
            for (int j =1; j < 10; j ++){
                if(i * j == 25) break extern;
                System.out.println(i + " * " + j +"=" + (i*j) );
            }
        }

        for(i = 0; i< 4; i ++ ){
            System.out.println("Estou antes switch");
            fritz:
            arthur: switch (i){
                case 0:
                case 1:
                    System.out.println("Caso " + i);
                    for(int j =0 ; j<3; j++){
                        System.out.println(j);
                        if(j==1) break fritz;//or break arthur
                    }
                case 2:
                    System.out.println("Legal, " + i);
                    continue;//return for, search in while or for
                case 3:
                    System.out.println("Cheguei no 3");
                    break;
                default:
                    System.out.println("Estranho....");
                    break;
            }
        }
        System.out.println("Estou após switch");
    }
}
