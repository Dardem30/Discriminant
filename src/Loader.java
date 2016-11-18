/**
 * Created by Роман on 18.11.2016.
 */
public class Loader {
    public static void main(String[] args) {
        Reader read = new Reader();
        read.Scan();

        int discriminant = discriminant(read.a,read.b,read.c);
        System.out.println(discriminant);
    }
    int d = 0;
    public static int discriminant (int a,int b,int c){

        int d = b*b -4*a*c;
//        if (d<0)
//            return Math.abs(d);
//        else
        return d;
    }
}
