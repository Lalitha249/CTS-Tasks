import java.util.*;

public class FinancialForecasting {

    static double forecast(double v, double[] g, int n) {
        if (n == 0)
            return v;
        return forecast(v * (1 + g[g.length - n]), g, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Initial Value : ");
        double value = sc.nextDouble();

        System.out.print("Years : ");
        int years = sc.nextInt();

        double[] growth = new double[years];

        for (int i = 0; i < years; i++) {
            System.out.print("Growth Rate " + (i + 1) + "(%) : ");
            growth[i] = sc.nextDouble() / 100;
        }

        double ans = forecast(value, growth, years);

        System.out.printf("Future Value : %.2f", ans);

        sc.close();
    }
}
