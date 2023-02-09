import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
Casos de prueba
1.Nombre bien
2.Edad no negativa
3.Genero Hombre o Mujer
8.Average : resultado correcto
 */

public class PersonTest {


    @BeforeEach
    void setUp(){
    }

    @AfterEach
    void shutDown(){
    }

    @Test
    void nombreCorrecto(){
        Person p1=new Person("Juan",14,"Male");//todo correcto MALE
        assertEquals("Juan",p1.getName());
    }
}
