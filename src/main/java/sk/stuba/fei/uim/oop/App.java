package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Objects;
//Pointre funguju vo funkcii cize ked zmenim nieco v poli tak sa to prenesie do mainu
public class App {
    public static void main(String[] args) {
        int x = KeyboardInput.readInt("den narodenia");
        int y = KeyboardInput.readInt("mesiac narodenia");
        switch (y) {
            case 1:
                if (x < 21)
                    System.out.println("Kozorozec");
                else
                    System.out.println("Vodnar");
                break;
            case 2:
                if (x < 20)
                    System.out.println("VODNAR");
                else
                    System.out.println("RYBY");
                break;
            case 3:
                if (x < 21)
                    System.out.println("RYBY");
                else
                    System.out.println("BARAN");
                break;
            case 4:
                if (x < 20)
                    System.out.println("BARAN");
                else
                    System.out.println("BYK");
                break;
            case 5:
                if (x < 21)
                    System.out.println("BYK");
                else
                    System.out.println("BLIZENCI");
                break;
            case 6:
                if (x < 20)
                    System.out.println("BLIZENCI");
                else
                    System.out.println("RAK");
                break;
            case 7:
                if (x < 21)
                    System.out.println("ad");
                else
                    System.out.println("tgr");
                break;
            case 8:
                if (x < 20)
                    System.out.println("asdsad");
                else
                    System.out.println("RAdasdasK");
                break;
            default:
                break;
        }


    }
}