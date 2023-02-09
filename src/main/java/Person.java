import java.util.List;

/**
 * Class representing a person with a name,age and gender
 *
 * @author Jose Manuel Sanchez Navarro
 */
public class Person {
    private final String name;
    private final int age;
    private  final String gender;

    /**
     * Constructor de una persona con nombre,edad y genero
     * @param name es el nombre
     * @param age es la edad
     * @param gender es el generogit
     */

    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String getName(){return  this.name;}
    public int getAge(){return this.age;}

    public String getGender() {
        return gender;
    }

    /**
     * Calcula la edad media de hombres y mujeres en una lista y
     * devuelve en un arary de dos elementos (el primero es la media en
     * hombres y el segundo en mujeres)
     * @param persons es la lista de personas
     * @return array de dos elementos con la media de edad de hombres y mujeres
     */
    public double[] averageAgePerGender(List<Person> persons){
        int contadorH=0;
        int contadorM=0;
        double[] mediaEdad= {0,0};
        for(Person p : persons){
            if(p.gender.equals("Male")){
                mediaEdad[0]=mediaEdad[0]+p.age;
                contadorH++;
            }else{
                mediaEdad[1]=mediaEdad[1]+p.age;
                contadorM++;
            }
        }
        mediaEdad[0]=mediaEdad[0]/contadorH;
        mediaEdad[1]=mediaEdad[1]/contadorM;
        return mediaEdad;
    }
}
