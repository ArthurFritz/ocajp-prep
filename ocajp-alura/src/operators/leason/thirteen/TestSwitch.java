package operators.leason.thirteen;

public class TestSwitch {
    public static void main(String[] args) {
        //not exist switch point float

        int opcao = 4;

        switch (opcao) {
            case 1:
                System.out.println("First Option");
            case 2:
                System.out.println("Second Option");
            case 3:
                System.out.println("Third Option");
        }

        final int variavel = 3;//valid only final variable
        switch (opcao) {
            case (5-4):
                System.out.println("First Option");
                break;
            case (2):
                System.out.println("Second Option");
            case variavel:
                System.out.println("Third Option");
            default:
                System.out.println("Default");
        }

        switch (opcao) {
            case (5-4):
                System.out.println("First Option");
                break;
            default:
                System.out.println("Default");
            case (2):
                System.out.println("Second Option");
            case variavel:
                System.out.println("Third Option");
        }

        int opcao2 = 3;
        switch (opcao2) {
            case (5-4):
                System.out.println("First Option");
                break;
            default:
                System.out.println("Default");
            case (2):
                System.out.println("Second Option");
            case variavel:
                System.out.println("Third Option");
        }
    }
}

