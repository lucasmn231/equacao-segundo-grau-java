public class Equacao {
    double a, b, c;

    public Equacao(double ca, double cb, double cc) {
        this.a = ca;
        this.b = cb;
        this.c = cc;
    }

    double[] resolver() {
        double delta;
        double raizes[] = new double[2];

        if (a == 0) {
            throw new IllegalArgumentException("Coeficiente A nao pode ser 0");
        }

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            throw new IllegalArgumentException("Raizes nao reais");
        }

        raizes[0] = (-b + Math.sqrt(delta)) / (2 * a);
        raizes[1] = (-b - Math.sqrt(delta)) / (2 * a);
        return raizes;
    }
}
