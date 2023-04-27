public class ExpressaoBinaria {
    double operacao1, operacao2;
    String operators;

    public double Calcular(double operacao2, double operacao1, String operators) {
        switch (operators) {
            case "+": return operacao1 + operacao2;
            case "-": return operacao1 - operacao2;
            case "*": return operacao1 * operacao2;
            case "/": return operacao1 / operacao2;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }
}
