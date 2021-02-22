package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Objects;
//Pointre funguju vo funkcii cize ked zmenim nieco v poli tak sa to prenesie do mainu
public class App {
    public static void main(String[] args) {
        int[][] x = new int[10][9];
        for(int i =0; i< x.length;i++) {
            for(int j =0; j < x[i].length;j++)
                x[i][j] = j+1;
        }

        for(int i =0; i< x.length;i++) {
            for(int j =0; j < x[i].length;j++)
                System.out.print(x[i][j]+" ");
            System.out.println();
        }

    }
}
