public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    public String getPesel() {
        return pesel;
    }

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        if(firstName==null || lastName==null || firstName.length()<3 || lastName.length()<3)
            throw new NameUndefinedException();
        if (age<1)
            throw new IncorrectAgeException();
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.pesel=pesel;
    }

}
