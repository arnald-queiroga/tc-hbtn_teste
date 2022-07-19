import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TesteEmail {


    @Test
    public static boolean testar_email_com_arroba() {
        Pessoa pessoa = new Pessoa();
        Assertions.assertTrue(pessoa.emailValid("email_teste@dominio.com.br"));
        return false;
    }

    @Test
    public static boolean testar_email_sem_arroba() {
        Pessoa pessoa = new Pessoa();
        Assertions.assertFalse(pessoa.emailValid("email_testedominio.com.br"));
        return false;
    }

    @Test
    public static boolean testar_email_mais_50_caracteres() {
        Pessoa pessoa = new Pessoa();
        Assertions.assertEquals(pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"), pessoa.emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
        return false;
    }
} 
