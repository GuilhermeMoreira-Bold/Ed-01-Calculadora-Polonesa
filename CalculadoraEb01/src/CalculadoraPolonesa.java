public class CalculadoraPolonesa {
    ExpressaoBinaria expre = new ExpressaoBinaria();
    PilhaDeOperandos pilha = new PilhaDeOperandos();
    
    public  double resolucao (String expressao){
        String expressaoSplit[] = expressao.trim().split(" ");
        String regex = "[0-9]*";
        for(int i = 0; i < expressaoSplit.length; i++) {
            if(expressaoSplit[i].matches(regex)){ 
                pilha.push(Double.parseDouble(expressaoSplit[i]));
            }else{
                double valor2 = pilha.pop();
                double valor1 = pilha.pop();
                pilha.push(expre.Calcular(valor2, valor1, expressaoSplit[i]));
            }
        }
        return pilha.pop();
    }
}