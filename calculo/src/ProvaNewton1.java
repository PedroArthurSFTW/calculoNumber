public class ProvaNewton1 {
        static double x0 = 1;
        static double prec = 0.001;

        public static double fuction(double x)
        {
            return (Math.pow(x, 4) -(3*(Math.pow(x, 2))) + 5);
        }

        public static double derivate(double x)
        {
            double resul = (4 * Math.pow(x, 3)) - (6*x);
            if (resul == 0){
                System.out.println("Não tem raiz");
            }
            return resul;

        }

        public static void main(String[] args) {
            double err = 0, initial = x0, next = 0;
            int i = 0;
            do {
                System.out.println("Interação:" + i);
                double y = fuction(initial);
                double yd = derivate(initial);
                if(i > 100){
                    System.out.println("não possui raiz");
                    break;
                }
                next = initial - (y / yd);
                err = Math.abs((next - initial) / next);
                System.out.println("X" + i + ":" + initial);
                System.out.println("X" + i + 1 + ":" + next);
                System.out.println("Err:" + err);
                initial = next;
                i++;
            }while (err > prec);

        }

    }
