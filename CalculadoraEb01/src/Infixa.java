public class Infixa {
    PilhaDeOperadores pilha = new PilhaDeOperadores();
    public String converter(String expressao){
        String expressaoSplit[] = expressao.split(" ");
        String regex = "[0-9]*";
       for(int i = expressaoSplit.length -1; i >= 0 ; i--){
            if(expressaoSplit[i].matches(regex)){
                pilha.push(expressaoSplit[i]);
            }else if(expressaoSplit.length == 0){
                String valor2 = pilha.pop();
                String valor1 = pilha.pop();
                pilha.push(valor1 + " " + expressaoSplit[i] + " " + valor2);
            }else{
                String valor2 = pilha.pop();
                String valor1 = pilha.pop();  
                pilha.push("(" + valor2 + " " + expressaoSplit[i] + " " + valor1 + ")");
            }
       }

       String resultado = pilha.pop();

        return resultado.substring(1, resultado.length()-1);
    }

}
//Expressão: ((2 * 3) + 4) * (5 - (6 / 7))
// Notação Pósfixa: 2 3 * 4 + 5 6 7 / - *
// Notação Préfixa: * + * 2 3 4 - 5 / 6 7