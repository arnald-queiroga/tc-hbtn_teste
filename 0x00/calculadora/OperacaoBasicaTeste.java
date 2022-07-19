public class OperacaoBasicaTeste {
    static OperacaoBasica operacaoBasica = new OperacaoBasica();

    public static boolean testar_soma() {
        if (operacaoBasica.somar(5,3) == 8){
            return true;
        }
        return false;
    }
    public static boolean testar_subtracao() {
        if (operacaoBasica.subtrair(5,3) == 2){
            return true;
        }
        return false;
    }
    public static boolean testar_multiplicacao() {
        if (operacaoBasica.multiplicar(5,3) == 15){
            return true;
        }
        return false;
    }
    public static boolean testar_divisao() {
        if (operacaoBasica.dividir(9,3) == 3){
            return true;
        }
        return false;
    }
} 
