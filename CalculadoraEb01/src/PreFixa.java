public class PreFixa {
    PilhaDeOperadores operadores = new PilhaDeOperadores();
    PilhaDeOperadores pilhaAux = new PilhaDeOperadores();
    ExpressaoRegular exp = new ExpressaoRegular();
    String destino = "";
    public String converter(String expressao){
        String expressaoSplit[] = expressao.split(" ");
        String regex = "[0-9]*";

        for(int i = 0; i < expressaoSplit.length; i++){
            if(expressaoSplit[i].matches(regex)){
                operadores.push(expressaoSplit[i]);
            }else{
                String valor2 = operadores.pop();
                String valor1 = operadores.pop();
                operadores.push(expressaoSplit[i] + " " + valor1 + " " + valor2);
            }
        }
        while(operadores.topoPilha != 0){
            destino += operadores.pop() + " ";
        }
        return destino;
    }
}
        //((7 - 3) * (8 + 2)) / 4
        // resultado: / * - 7 3 + 8 2 4
        

        // for(int i = 0; i < expressaoSplit.length; i++){
        //     if(expressaoSplit[i].matches(regex)){
        //         operadores.push(expressaoSplit[i]);
        //     }
        // }

        // for(int i = 0; i < expressaoSplit.length; i++){
        //     if(!expressaoSplit[i].matches(regex)){
        //         if(operadores.topoPilha == 1){
        //             String valor1 = operadores.pop();
        //             pilhaAux.push(expressaoSplit[i] + " " +  valor1);
        //         }else if(operadores.topoPilha == 0){
        //             pilhaAux.push(expressaoSplit[i]);
        //         }else{
        //             String valor2 = operadores.pop();
        //             String valor1 = operadores.pop();
        //             pilhaAux.push(expressaoSplit[i] +" "+ valor1 + " " + valor2);
        //         }
        //     }
        // }