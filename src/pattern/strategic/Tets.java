package pattern.strategic;

import java.util.Scanner;

public class Tets {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String next = in.next();
        System.out.println(next);
        Starategic s = new Starategic(next);
        ParamObject param = new ParamObject();
        param.setTotal(1000);
        param.setParamA(500);
        param.setParamB(100);
        s.getRes(param);

    }
}
