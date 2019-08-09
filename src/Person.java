public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String Pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public void toShortNames(){
        if(getLastName()==null || getFirstName() == null || getLastName().length()<3 || getFirstName().length()<3){
            throw new NameUndefinedException();
        }
    }
    public void tooYoung(){
        if(age<1){
            throw new IncorrectAgeException();
        }
    }

}
