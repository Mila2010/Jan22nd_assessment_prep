package nyc.c4q;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[][] myfinal= addPairs(new int[]{0, 2, 4, 6, 8, 10}, 10) ;
        for (int i = 0; i < myfinal.length; i++) {
            for (int j = 0; j < 2; j++) {

//                System.out.print("i ="+i);
//                System.out.println("j ="+j);
                System.out.print(myfinal[i][j]+"  ");
            }
            //System.out.print("\n"); // write your code here
        }

    }

    public static String[][] twoDemArr(int x, int y){

        String [][] outPut=new String[x][y];
        Random random = new Random();
        String[] colors= {"░","▒","▓"};



        for(int i=0; i <x; i++){
            for (int j=0;j<y;j++){

                outPut[i][j]= colors[random.nextInt(3)];
            }
        }
      return outPut;
    }


    public static Character [][] chessBoard( int x, int y){

        Character [][]  chessBoard=new Character[x][y];

        Boolean space=true;

        for(int i=0; i <x; i++){
            for (int j=0;j<y;j++){

                if(space){

                chessBoard[i][j]= ' ';
                space=!space;
                }else {
                    chessBoard[i][j]= '#';
                    space=!space;
                }

            }
            space=!space;
        }

    return chessBoard;
    }

    public static int[][] addPairs(int[] array, int k){

        int outPut[] [] =new int[array.length/2][];
        int inter = 0;

        for(int i=0; i <array.length; i++){

            for (int j=i+1;j<array.length;j++){

                if(array[i]+array[j]==k){


                    outPut[inter]= new int[]{array[i],array[j]};
                    inter++;
                }

            }

        }

        return outPut;
    }

}
