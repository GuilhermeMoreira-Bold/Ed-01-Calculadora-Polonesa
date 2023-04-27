import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String escolha = JOptionPane.showInputDialog("Escolha uma das expressões para determinar a entrada: \n 1- Notação infixa \n 2- Notação pósfixa \n 3- Notação préfixa");
        PosFixada posFixada = new PosFixada();
        PreFixa preFixada = new PreFixa();
        Infixa infixa = new Infixa();
        CalculadoraPolonesa calculadora = new CalculadoraPolonesa();

        String expressao  = "";
        String expPosfixada = "";
        String expPrefixada = "";
        String expInfixa = "";
        double resultado = 0.0;

        if (escolha.equals("1")) { //infixa
            expressao = JOptionPane.showInputDialog("Digite a expressão : ");
            expPosfixada = posFixada.converter(expressao);
            expPrefixada = preFixada.converter(expPosfixada);
            expInfixa = expressao;
            resultado = calculadora.resolucao(expPosfixada);
        }else if (escolha.equals("2")){ //posfixa
            expressao = JOptionPane.showInputDialog("Digite a expressão : ");
            expPrefixada = preFixada.converter(expressao);
            expInfixa = infixa.converter(expPrefixada);
            expPosfixada = expressao;
            resultado = calculadora.resolucao(expPosfixada);
        }else if (escolha.equals("3")){ //prefixa
            expressao = JOptionPane.showInputDialog("Digite a expressão : ");
            expInfixa = infixa.converter(expressao);
            expPosfixada = posFixada.converter(expInfixa);
            expPrefixada = expressao;
            resultado =  calculadora.resolucao(expPosfixada);
        }
        System.out.println("Expressão infixada: " + expInfixa);
        System.out.println("Expressão pósfixada: "+ expPosfixada);
        System.out.println("Expressão préfixada: "+ expPrefixada);
        System.out.println("O resultado é: " + resultado);

        // String expInfixa = infixa.converter(expressao);
        // // System.out.println("Expressão pós fixada: "+ posFixada.converter(expressao));
        //((3 + 4) / 2) * ((6 - 2) + (8 / 4))
        //((5 * 2) + (8 / 4)) - (3 * (6 - 2)) + (10 / (2 + 3))
    }
}
