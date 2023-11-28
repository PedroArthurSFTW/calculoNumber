
public class Newton1 {
    static double x0 = 1;
    static double prec = 0.001;

    public static double fuction(double x)
    {
        return (Math.pow(x, 4) - x- 2);
    }

    public static double derivate(double x) {
        return (4 * Math.pow(x, 3)) - 1;
    }

    public static void main(String[] args) {
        double err = 0, initial = x0, next = 0;
        int i = 0;
        do {
            System.out.println("Interação:" + i);
            double y = fuction(initial);
            double yd = derivate(initial);
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