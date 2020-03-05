import java.util.Arrays;
import java.util.Random;

class Sudoku {
    public static int rngnumber0to2and6to8(){
        int ntse = (int)(Math.random()*((6-1)+1)+3);
        if(ntse == 3){
            ntse = 6;
        }
        else if(ntse == 4){
            ntse = 7;
        }
        else if(ntse == 5){
            ntse = 8;
        }
        return ntse;
    }
    public static int rngchoiceable(int a, int b, int c, int d){
        int[] array = {a,b,c,d};
        int rngnumber = (int)(Math.random()*(4-0));
        return array[rngnumber];
    }

    public static int rngnumber124578(){
        int ntse = (int)(Math.random()*((6-1)+1)+3);
        if(ntse == 0){
            ntse = 1;
        }
        else if(ntse == 1){
            ntse = 2;
        }
        else if(ntse == 2){
            ntse = 4;
        }
        else if(ntse == 3){
            ntse = 5;
        }
        else if(ntse == 4){
            ntse = 7;
        }
        else if(ntse == 5){
            ntse = 8;
        }
        return ntse;
    }
    public static int rngnumber023568(){
        int ntse = (int)(Math.random()*((6-1)+1)+3);
        if(ntse == 0){
            ntse = 0;
        }
        else if(ntse == 1){
            ntse = 2;
        }
        else if(ntse == 2){
            ntse = 3;
        }
        else if(ntse == 3){
            ntse = 5;
        }
        else if(ntse == 4){
            ntse = 6;
        }
        else if(ntse == 5){
            ntse = 8;
        }
        return ntse;
    }
    public static int rngnumber013467(){
        int ntse = (int)(Math.random()*((6-1)+1)+3);
        if(ntse == 0){
            ntse = 0;
        }
        else if(ntse == 1){
            ntse = 1;
        }
        else if(ntse == 2){
            ntse = 3;
        }
        else if(ntse == 3){
            ntse = 4;
        }
        else if(ntse == 4){
            ntse = 6;
        }
        else if(ntse == 5){
            ntse = 7;
        }
        return ntse;
    }


    public static int rngnum(int high,int low){
        //return (int)(Math.random()*((high-low)+10));
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(high-low) + low;

    }


    public static void main(String[] args){
        int[][] board = new int[9][9];

        int rng =(int)(Math.random()*((9-1)+1));
        int rng2 =(int)(Math.random()*((9-1)+1));
        int rng3 =(int)(Math.random()*((9-1)+1));

        //first array 0
        board[0][rng] = 1;


        //secound array 1
        if(board[0][0] == 1 || board[0][1] == 1 || board[0][2] == 1){
            board[1][rngnum(9,3)] = 1;
        }
        else if(board[0][3] == 1 || board[0][4] == 1 || board[0][5] == 1){
            board[1][rngnumber0to2and6to8()] = 1;
        }
        else{
            board[1][rngnum(6,0)] =1;
        }

        //third array 2
        // if first 0-2 and secound 3-5 than third write 1 to 6-7
        if((board[0][0] == 1 || board[0][1] == 1 || board[0][2] == 1)&& (board[1][3] == 1 || board[1][4] == 1 || board[1][5] == 1)){
            board[2][rngnum(9,6)] = 1;
        }
        // if first 0-2 and secound 6-8 than third write 1 to 3-5
        else if((board[0][0] == 1 || board[0][1] == 1 || board[0][2] == 1)&& (board[1][6] == 1 || board[1][7] == 1 || board[1][8] == 1)){
            board[2][rngnum(6,3)] = 1;
        }
        // if first 3-5 and secound 0-2 than third write 1 to 6-7
        else if((board[0][3] == 1 || board[0][4] == 1 || board[0][5] == 1)&& (board[1][0] == 1 || board[1][1] == 1 || board[1][2] == 1)){
            board[2][rngnum(9,6)] = 1;
        }
        // if first 3-5 and secound 6-8 than third write 1 to 0-2
        else if((board[0][3] == 1 || board[0][4] == 1 || board[0][5] == 1)&& (board[1][6] == 1 || board[1][7] == 1 || board[1][8] == 1)){
            board[2][rngnum(3,0)] = 1;
        }
        // if first 6-8 and secound 0-2 than third write 1 to 3-5
        else if((board[0][6] == 1 || board[0][7] == 1 || board[0][8] == 1)&& (board[1][0] == 1 || board[1][1] == 1 || board[1][2] == 1)){
            board[2][rngnum(6,3)] = 1;
        }
        // if first 6-8 and secound 3-5 than third write 1 to 0-2
        else if((board[0][6] == 1 || board[0][7] == 1 || board[0][8] == 1)&& (board[1][3] == 1 || board[1][4] == 1 || board[1][5] == 1)){
            board[2][rngnum(3,0)] = 1;
        }
        //fourth array 3
        if(board[0][0] == 1 || board[0][3] == 1 || board[0][6] == 1){
            board[3][rngnumber124578()] = 1;

        }
        else if(board[0][1] == 1 || board[0][4] == 1 || board[0][7] == 1){
            board[3][rngnumber023568()] = 1;
        }
        else if(board[0][2] == 1 || board[0][5] == 1 || board[0][8] == 1){
            board[3][rngnumber013467()] = 1;
        }

        //fifth array 4
        if(board[1][0] == 1 || board[1][3] == 1 || board[1][6] == 1){
            if(board[3][0] == 1 || board[3][1] == 1 || board[3][2] == 1){
                board[4][rngchoiceable(4,5,7,8)] = 1;
            }
            else if(board[3][3] == 1 || board[3][4] == 1 || board[3][5] == 1){
                board[4][rngchoiceable(1,2,7,8)] = 1;
            }
            else if(board[3][6] == 1 || board[3][7] == 1 || board[3][8] == 1){
                board[4][rngchoiceable(1,2,4,5)] = 1;
            }
            board[4][rngnumber124578()] = 1;
        }
        else if(board[1][1] == 1 || board[1][4] == 1 || board[1][7] == 1){
            if(board[3][0] == 1 || board[3][1] == 1 || board[3][2] == 1){
                board[4][rngchoiceable(3,5,6,8)] = 1;
            }
            else if(board[3][3] == 1 || board[3][4] == 1 || board[3][5] == 1){
                board[4][rngchoiceable(0,2,6,8)] = 1;
            }
            else if(board[3][6] == 1 || board[3][7] == 1 || board[3][8] == 1){
                board[4][rngchoiceable(0,2,3,5)] = 1;
            }

        }
        else if(board[1][2] == 1 || board[1][5] == 1 || board[1][8] == 1){
            if(board[3][0] == 1 || board[3][1] == 1 || board[3][2] == 1){
                board[4][rngchoiceable(3,4,6,7)] = 1;
            }
            else if(board[3][3] == 1 || board[3][4] == 1 || board[3][5] == 1){
                board[4][rngchoiceable(0,1,6,7)] = 1;
            }
            else if(board[3][6] == 1 || board[3][7] == 1 || board[3][8] == 1){
                board[4][rngchoiceable(0,1,3,4)] = 1;
            }
        }


        System.out.println(Arrays.deepToString(board));









    }
}