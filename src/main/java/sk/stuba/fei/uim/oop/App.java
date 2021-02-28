package sk.stuba.fei.uim.oop;

import java.util.Arrays;
import java.util.Objects;
//Pointre funguju vo funkcii cize ked zmenim nieco v poli tak sa to prenesie do mainu
public class App {
    public static void main(String[] args) {
    int a =7;
    int b =7;
    int x;
    x = porovnaj(a,b);
    System.out.println(x);


}
static int porovnaj(int a, int b)
{
    if (a>b)
        return 1;
    else if (a<b)
        return -1;
    else
        return 0;

}
}