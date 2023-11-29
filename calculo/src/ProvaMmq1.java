public class ProvaMmq1 {

        public static double resolveA(double n, double somaXY, double somaX, double somaY, double somElevX){
            return (n*somaXY - somaX * somaY) / (n * somElevX - somaX * somaX);
        }
        public static double resolveB(double n, double somaX, double somaY, double a){
            return (somaY - a * somaX) / n;
        }

        public static double func(double a, double b, double x)
        {
            return (a*x)+b;
        }

        public static void main(String[] args) {
            double xi[] = {-2,-1, 1, 3};
            double yi[] = {-3, 0, 2, 6};
            double somaX = 0;
            double somaY = 0;
            double elevX[]= new double[4];
            double elevY[]= new double[4];
            double multXY[] = new double[4];
            double somaXY = 0;
            double somElevX = 0;
            double somElevY = 0;
            double n =0, a, b;
            for(int i=0; i < xi.length; i++)
            {
                somaX = somaX + xi[i];
                elevX[i] = Math.pow(xi[i], 2);
                somElevX = somElevX + elevX[i];
                n++;
            }

            for(int i=0; i < yi.length; i++) {
                somaY = somaY + yi[i];
                elevY[i] = Math.pow(yi[i], 2);
                somElevY = somElevY + elevY[i];
            }

            for(int i=0; i < yi.length; i++) {
                multXY[i] = xi[i] * yi[i];
                somaXY = somaXY + multXY[i];
            }

            a = resolveA(n, somaXY, somaX, somaY, somElevX);
            b = resolveB(n, somaX, somaY, a);

            double result = func(a, b, 1);
            System.out.println("valor de a:" + a);
            System.out.println("valor de b:" + b);
            System.out.println(result);

        }
    }
