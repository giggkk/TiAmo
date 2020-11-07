package finish;

import java.util.Scanner;

public class Compute {
    public static void useCom(Calculate com){

        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        String operate=in.nextLine();
        double y=in.nextDouble();
        System.out.println( "调用的类为："+com.getClass().getName()+" 得到的结果为: "+com.calculate(x,operate,y));

    }
}

