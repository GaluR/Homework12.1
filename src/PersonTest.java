import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws IncorrectAgeException, NameUndefinedException {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        try {
            System.out.println("Wprowadz imię osoby: ");
            person.setFirstName(input.nextLine());
            System.out.println("Wprowadz nazwisko osoby: ");
            person.setLastName(input.nextLine());
            System.out.println("Wprowadz pesel osoby: ");
            person.setPesel(input.nextLine());
        }catch(NameUndefinedException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Wprowadz wiek osoby: ");
            person.setAge(input.nextInt());
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(person);
    }
}