public class Temperatura {
    public static void main(String[] args) {
        //(F - 32) x 5/9  = C
        double fahrenheit = 86;
        final double SUBTRA = 32.0;
        final double DIVISAO = 5.0/9.0;
        double celsios = (fahrenheit - SUBTRA) * DIVISAO;
        System.out.println(celsios);
    }
}
