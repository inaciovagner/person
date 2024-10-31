
/**
 * Write a description of class Person here.
 * Add a field called name of type String and a field called age of type int.
 * Add a constructor to the class Person that takes two parameters. The first is of type String and is called myName. The second is of type int and is called myAge. Use the first parameter to set the name field, and the second parameter to set the age field.
 * Write a getter method called getName that returns the value of the field called name. 
 * Write a setter method called setAge that takes an int parameter and uses it to set the value of the field age.
 * Write a getter method called getAge that returns the value of the field called age.
 * Write a method called printDetails that does not return a value, and prints out a string of the following form: 
 * A person called <name> aged <age>.
 * Of course, the <name> and <age> should be replaced by the actual name and age of the person
 * @author Vagner de Souza
 * @version one 30/10/24
 */
public class Person
{
    // Fields
    private String name;   // the name of the person
    private int age;       // the age of the person
    
    /**
     * Constructor for objects of class Person.
     * Initializes the name and age fields.
     */
    public Person(String myName, int myAge)
    {
        name = myName;
        age = myAge;
    }
    
    /**
     * Getter method for the name field.
     * @return the name of the person.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Setter method for the age field.
     * @param newAge the new age to set.
     */
    public void setAge(int newAge)
    {
        age = newAge;
    }
    
    /**
     * Getter method for the age field.
     * @return the age of the person.
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * Method to print details of the person.
     * Prints: "A person called <name> aged <age>."
     */
    public void printDetails()
    {
        System.out.println("A person called " + name + " aged " + age + ".");
    }
}