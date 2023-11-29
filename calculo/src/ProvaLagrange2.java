public class ProvaLagrange2 {
        public static double fuction(double l0, double l1, double l2, double l3, double l4, double fx0, double fx1, double fx2, double fx3, double fx4)
        {
            return ( l0 * fx0 ) + ( l1 * fx1 ) + ( l2 * fx2 ) + (l3 * fx3) + (l4 * fx4);
        }

        public static double lfunc(double x, double xPrin, double xSec1, double xSec2, double xSec3, double xSec4)
        {
            return ( (x-xSec1) * (x-xSec2) * (x-xSec3) * (x-xSec4)) / ( (xPrin-xSec1) * (xPrin-xSec2) * (xPrin-xSec3) * (xPrin-xSec4) );
        }

        public static void main(String[] args) {

            double l0, l1, l2, l3, l4, fx0, fx1, fx2, fx3, fx4, x, x0, x1, x2, x3, x4, test;

            x = 2;
            x0 = -2;
            x1 = 0;
            x2 = 2;
            x3 = 3;
            x4 = 4;
            fx0 = 5;
            fx1 = -2;
            fx2 = -3;
            fx3 = -6;
            fx4 = 4;

            l0 = lfunc(x, x0, x1, x2, x3, x4);
            l1 = lfunc(x, x1, x0, x2, x3, x4);
            l2 = lfunc(x, x2, x0, x1, x3, x4);
            l3 = lfunc(x, x3, x0, x1, x2, x4);
            l4 = lfunc(x, x4, x0, x1, x2, x3);

            test = fuction(l0, l1, l2, l3, l4, fx0, fx1, fx2, fx3, fx4);
            System.out.println(test);

        }

    }

