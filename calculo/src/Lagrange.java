
public class Lagrange {

    public static double fuction(double l0, double l1, double l2, double fx0, double fx1, double fx2)
    {
        return ( l0 * fx0 ) + ( l1 * fx1 ) + ( l2 * fx2 );
    }

    public static double lfunc(double x, double xPrin, double xSec1, double xSec2)
    {
        return ( (x-xSec1) * (x-xSec2) ) / ( (xPrin-xSec1) * (xPrin-xSec2) );
    }

    public static void main(String[] args) {

        double l0, l1, l2, fx0, fx1, fx2, x, x0, x1, x2, test;

        x = 2;
        x0 = -1;
        x1 = 0;
        x2 = 2;
        fx0 = 4;
        fx1 = 1;
        fx2 = -1;

        l0 = lfunc(x, x0, x1, x2);
        l1 = lfunc(x, x1, x0, x2);
        l2 = lfunc(x, x2, x0, x1);

        test = fuction(l0, l1, l2, fx0, fx1, fx2);
        System.out.println(test);

    }

}
