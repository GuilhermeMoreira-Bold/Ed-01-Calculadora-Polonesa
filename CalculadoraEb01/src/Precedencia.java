public class Precedencia {
public int verificar(String operador){
    if(operador.equals("(")||operador.equals(")")){
        return 3;
    }else if(operador.equals("*") || operador.equals("/")){
        return 2;
    }else if(operador.equals("+") || operador.equals("-")){
        return 1;
    }
    return 0;
}
}
