public class TesteEmail {

    static Pessoa pessoa = new Pessoa();



    public static boolean testar_email_com_arroba() {
        if (pessoa.emailValid("email_teste@dominio.com.br")){
            return true;
        } return false;

    }
    public static boolean testar_email_sem_arroba() {
        if (pessoa.emailValid("email_testedominio.com.br")){
            return false;
        } return true;
    }

    public static boolean testar_email_mais_50_caracteres() {
        if (pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br")){
            return false;
        } return true;
    }
} 
