package sk.stuba.fei.uim.oop;

import java.util.Objects;

public class App {
    public static void main(String[] args) {

     String a = "a";
     String c = KeyboardInput.readString("zadaj text");
     System.out.println("Compare strings "+ a.equals(c));
     System.out.println("Compare strings better way "+ Objects.equals(a,c));
    }
}
