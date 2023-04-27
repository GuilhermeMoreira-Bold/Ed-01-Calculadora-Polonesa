public class ExpressaoRegular {
    public String[] resolver(String expressao){
        expressao = expressao.replaceAll("\\s+", "").replaceAll("([+\\-*/()])", " $1 ");
        String[] elementos = expressao.trim().split("\\s+");
        return elementos;
    }
    
}
