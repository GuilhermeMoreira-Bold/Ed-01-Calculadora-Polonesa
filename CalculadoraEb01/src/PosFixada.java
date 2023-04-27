public class PosFixada{
    PilhaDeOperadores pilhaOp = new PilhaDeOperadores();
    Precedencia precedencia = new Precedencia();
    ExpressaoRegular exp = new ExpressaoRegular();
    String destino="";
   
    String converter(String original){
        String expressaoSplit[] = exp.resolver(original);
        String regex = "[0-9]*";

        
        for(int i = 0; i < expressaoSplit.length; i++){
            if(expressaoSplit[i].matches(regex)){
                destino += expressaoSplit[i] + " ";
            }else{
              if(pilhaOp.topoPilha != 0 && !expressaoSplit[i].equals("(") && !expressaoSplit[i].equals(")")
                && precedencia.verificar(expressaoSplit[i]) <= precedencia.verificar(pilhaOp.elementoDoTopo())){
                        if(!pilhaOp.elementoDoTopo().equals("(")){
                            destino += pilhaOp.pop() + " ";
                        }
                        pilhaOp.push(expressaoSplit[i]);
              }else if(!expressaoSplit[i].equals(")")){
                pilhaOp.push(expressaoSplit[i]);
              }else if(expressaoSplit[i].equals(")")){
                while(!pilhaOp.elementoDoTopo().equals("(")){
                        destino += pilhaOp.pop() + " ";
                }
                pilhaOp.pop();
              }
            }
        }
        while(pilhaOp.topoPilha != 0){
            if(!pilhaOp.elementoDoTopo().equals("(") && !pilhaOp.elementoDoTopo().equals(")")) {
                destino += pilhaOp.pop() + " ";
            }}
        return destino;
    }
}
//1+2*3*2-2
//1*(2+3)*(4-2)*5
//(5+9)*2+6*5
// ((8 - 4) * (7 + 1)) / (5 - 2)

//TESTE ANTIGO, PRIMEIRO PROTOTIPO:

//for(int i=0; i<expressaoSplit.length; i++){
    //     if(expressaoSplit[i].matches(regex)){
    //         destino += expressaoSplit[i] + " ";
    //     }else{
    //         if(pilhaOp.topoPilha != 0 && pre.verificar(expressaoSplit[i], pilhaOp.elementoDoTopo()) == true){
    //             System.out.println("Entrei no if da precedencia");
    //             if(expressaoSplit[i] == ")"){
    //                 pilhaOp.pop();
    //                 while(pilhaOp.elementoDoTopo() != "("){
    //                     destino += pilhaOp.pop() + " ";
    //                 }
    //             }else{ destino += expressaoSplit[i] + " ";}           
    //         }else{ 
    //             System.out.println("Adicionei "+ expressaoSplit[i] + " a pilha");
    //             pilhaOp.push(expressaoSplit[i]);}
    //     }
    // }

//Segundo Prototipo:

    //for(int i=0; i<expressaoSplit.length; i++){
        //     if(expressaoSplit[i].matches(regex)){
        //         destino += expressaoSplit[i] + " ";


        //     }else if(expressaoSplit[i] == "(" ){
        //         pilhaOp.push(expressaoSplit[i]);
        //     }else if(pilhaOp.topoPilha != 0 && pre.verificar(pilhaOp.elementoDoTopo()) <= pre.verificar(expressaoSplit[i])){
        //         destino += expressaoSplit[i] + " ";
        //     }else{  
        //         pilhaOp.push(expressaoSplit[i]);
        //     }
        //     if(pilhaOp.topoPilha != 0 && pilhaOp.elementoDoTopo().equals(")")){
        //         pilhaOp.pop();
        //         while(!pilhaOp.elementoDoTopo().equals("(")){
        //             destino += pilhaOp.pop() + " ";
        //         }
        //         if(pilhaOp.elementoDoTopo().equals("(")){
        //             pilhaOp.pop();
        //         }
        //     }        
        // }