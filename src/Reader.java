import java.util.Scanner;

/**
 * Created by Роман on 18.11.2016.
 */
public class Reader {
    int a;
    int b;
    int c;
    public void Scan(){

       Scanner scm = new Scanner(System.in);
       System.out.println("введите a");
       a=scm.nextInt();//считать следующее число типа Int
       System.out.println("введите b");
       b=scm.nextInt();
       System.out.println("введите c");
       c=scm.nextInt();

    }
}
