package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Objects;
//Pointre funguju vo funkcii cize ked zmenim nieco v poli tak sa to prenesie do mainu
public class App {
    public static void main(String[] args) {
        vypis(1,5,0,39,57,5);
    }

    public static void vypis(int... pole){
        System.out.println(Arrays.toString(pole));
    }
}
