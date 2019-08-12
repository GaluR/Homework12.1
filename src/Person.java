public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String Pesel;
    public static final int AGE_LIMIT = 1;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName.length()<=2){
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName.length()<=2){
            throw new NameUndefinedException();
        }
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<1) {
            throw new IncorrectAgeException(AGE_LIMIT);
        }
        this.age = age;
    }
    public String getPesel() {
        return Pesel;
    }
    public void setPesel(String pesel) {
        Pesel = pesel;
    }
    public Person() {
    }

    @Override
    public String toString() {
        return "Dane osoby to " +
                "Imię: " + firstName +
                ", nazwisko: " + lastName  +
                ", wiek: " + age +
                ", Pesel: " + Pesel;
    }
}
