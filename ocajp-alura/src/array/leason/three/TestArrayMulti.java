package array.leason.three;

public class TestArrayMulti {
    public static void main(String[] args) {

        int[][] table ;
        int[][] cube[];
        int [][] hiperCube [][];

        table = new int[10][5];
        cube = new int[10][][];

        int[][] test = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        int[][] stranger = new int[2][];
        stranger[0] = new int[20];
        stranger[1] = new int[5];

        for (int i=0; i < stranger.length; i ++){
            System.out.println(stranger[i].length);
            for(int j = 0; j < stranger[i].length; j++){
                System.out.println(stranger[i][j]);
            }
        }

    }
}
