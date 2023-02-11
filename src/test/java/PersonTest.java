import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
Casos de prueba
1.Nombre bien
2.Edad no negativa
3.Genero Hombre o Mujer
8.Average : resultado correcto
 */

public class PersonTest {
    Person p1,p2;

    @BeforeEach
    void setUp(){
        p1=new Person("Juan",14,"Male");
        p2=new Person("Juan",14,"Female");
    }

    @AfterEach
    void shutDown(){
    }

    @Test
    void nombreCorrecto(){
        assertEquals("Juan",p1.getName());
    }

    @Test
    void edadCorrecta(){
        assertEquals(14,p1.getAge());
    }
    @Test
    void generoMaleCorrecto(){
        assertEquals("Male",p1.getGender());
    }
    @Test
    void generoFemaleCorrecto(){
        assertEquals("Female",p2.getGender());
    }

    @Test
    void averageAgeOneManOneWoman(){
        List<Person> persons=new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        double[] valorEsperado={14,14};
        assertArrayEquals(valorEsperado,p1.averageAgePerGender(persons));
    }
    @Test
    void averageAgeOneManNoWoman(){
        List<Person> persons=new ArrayList<Person>();
        persons.add(p1);
        double[] valorEsperado={14,0};
        assertArrayEquals(valorEsperado,p1.averageAgePerGender(persons));
    }
    @Test
    void averageAgeNoManOneWoman(){
        List<Person> persons=new ArrayList<Person>();
        persons.add(p2);
        double[] valorEsperado={0,14};
        assertArrayEquals(valorEsperado,p1.averageAgePerGender(persons));
    }
    @Test
    void averageAgeNoManNoWoman(){
        List<Person> persons=new ArrayList<Person>();
        double[] valorEsperado={0,0};
        assertArrayEquals(valorEsperado,p1.averageAgePerGender(persons));
    }
    @Test
    void averageAgeSomeNullPerson(){
        List<Person> persons=new ArrayList<Person>();
        persons.add(p1) ;
        persons.add(p2) ;
        persons.add(null) ;
        double[] valorEsperado={14,14};
        assertArrayEquals(valorEsperado,p1.averageAgePerGender(persons));
    }
    @Test
    void IllegalArgumentExceptionEnNombre(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,()->{
            throw new IllegalArgumentException("Nombre vacio");
        });
        assertEquals("Nombre vacio",exception.getMessage());
    }
    @Test
    void IllegalArgumentExceptionEnEdadNegativa(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,()->{
            throw new IllegalArgumentException("Edad incorrecta");
        });
        assertEquals("Edad incorrecta",exception.getMessage());
    }
    @Test
    void IllegalArgumentExceptionEnEdadElevada(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,()->{
            throw new IllegalArgumentException("Edad incorrecta");
        });
        assertEquals("Edad incorrecta",exception.getMessage());
    }
    @Test
    void IllegalArgumentExceptionEnGenero(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,()->{
            throw new IllegalArgumentException("Genero incorrecta");
        });
        assertEquals("Genero incorrecta",exception.getMessage());
    }
}
