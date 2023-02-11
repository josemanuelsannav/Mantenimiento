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
     * @param name es el nombre, no puede ser vacio
     * @param age es la edad,no puede ser negativo ni superior a una cantidad
     * @param gender es el generogit no puede ser distinto de male o female
     */

    public Person(String name,int age,String gender){
        /*
        assert (!name.isEmpty());
        assert (age>=0 && age<=115);
        assert (gender.equals("Male") || gender.equals("Female"));
        */
        if(name.isEmpty()){
            throw new IllegalArgumentException("Nombre vacio");
        }
        if(age<0 || age>115){
            throw new IllegalArgumentException("Edad incorrecta");
        }
        if(!gender.equals("Male") && !gender.equals("Female")){
            throw new IllegalArgumentException("Genero incorrecto");
        }
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
     * @param persons es la lista de personas no vacia
     * @return array de dos elementos con la media de edad de hombres y mujeres
     */
    public double[] averageAgePerGender(List<Person> persons){

        int contadorMale=0;
        int contadorFemale=0;
        double[] mediaEdad= {0,0};

        for(Person p : persons){
            if(p!=null) {
                if (p.gender.equals("Male")) {
                    mediaEdad[0] = mediaEdad[0] + p.age;
                    contadorMale++;
                } else {
                    mediaEdad[1] = mediaEdad[1] + p.age;
                    contadorFemale++;
                }
            }
        }
        if(contadorMale!=0){
            mediaEdad[0]=mediaEdad[0]/contadorMale;
        }
        if(contadorFemale!=0){
            mediaEdad[1]=mediaEdad[1]/contadorFemale;
        }


        return mediaEdad;
    }
}
