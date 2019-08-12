import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Wprowadz imię osoby: ");
            person.setFirstName(input.nextLine());
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Wprowadz nazwisko osoby: ");
            person.setLastName(input.nextLine());
        }catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
            System.out.println("Wprowadz pesel osoby: ");
            person.setPesel(input.nextLine());
        try {
            System.out.println("Wprowadz wiek osoby: ");
            person.setAge(input.nextInt());
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(person);
    }
}