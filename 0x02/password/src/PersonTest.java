import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    Person person = new Person();

    @BeforeAll
    void setup(){
        Person person = new Person();
    }

    @ParameterizedTest(name= "Teste valida o método checkUser ")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    void check_user_valid(String entrada){
        Assertions.assertTrue(person.checkUser(entrada));
    }

    @ParameterizedTest(name= "Teste não valida o método checkUser")
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    void check_user_not_valid(String entrada){
        Assertions.assertTrue(person.checkUser(entrada));
    }

    @ParameterizedTest(name= "Teste não valida o método checkPassword()")
    @ValueSource(strings = {"123456789", "#$%1234"})
    void does_not_have_letters(String entrada){
        Assertions.assertFalse(person.checkPassword(entrada));
    }

    @ParameterizedTest(name= "Teste não valida o método checkPassword()")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    void does_not_have_numbers(String entrada){
        Assertions.assertFalse(person.checkPassword(entrada));
    }

    @ParameterizedTest(name= "Teste não valida o método checkPassword()")
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    void does_not_have_eight_chars(String entrada){
        Assertions.assertFalse(person.checkPassword(entrada));
    }

    @ParameterizedTest(name= "Teste não valida o método checkPassword()")
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    void check_password_valid(String entrada){
        Assertions.assertFalse(person.checkPassword(entrada));
    }
} 
