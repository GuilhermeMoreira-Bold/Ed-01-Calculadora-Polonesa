import javax.swing.JOptionPane;

public class PilhaDeOperandos {
  int topopilha = 0;
  double operandos [] = new double [1000];

  public void push(double number){
    if(this.topopilha > 999){
        JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
    }else{
        this.operandos[this.topopilha] = number;
        this.topopilha++;
    }
    
  }
  double pop(){
    if(this.topopilha < 0){
        JOptionPane.showMessageDialog(null,"Estouro de pilha no pop, Erro: -999");
    }
        return this.operandos[--this.topopilha];
  }

}
