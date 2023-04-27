import javax.swing.JOptionPane;

public class PilhaDeOperadores {
    int topoPilha = 0;
    String Operadores[] = new String[1000];

    void push(String operador){
        if(topoPilha > 999){
            JOptionPane.showMessageDialog(null, "Error, pilha cheia");
        }
        Operadores[topoPilha] = operador;
        topoPilha++;
    }
    String pop(){
        if(topoPilha < 0){
            JOptionPane.showMessageDialog(null, "Error, pilha vazia");
        }
        return Operadores[--topoPilha];
    }
    int peek(){return topoPilha;}
    public String elementoDoTopo(){
        if(topoPilha != 0){
            return Operadores[topoPilha -1];
        }else return Operadores[topoPilha];} 

    boolean peekIsEmpty(){
        if (Operadores[topoPilha] != null){return false;}
        else{return true;}}      
}
