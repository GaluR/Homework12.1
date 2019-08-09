import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Wprowadz imię osoby: ");
            person.setFirstName(input.nextLine());
            System.out.println("Wprowadz imię osoby: ");
            person.setLastName(input.nextLine());
            System.out.println("Wprowadz imię osoby: ");
            person.setAge(input.nextInt());
            input.nextLine();
            System.out.println("Wprowadz imię osoby: ");
            person.setPesel(input.nextLine());
            System.out.println(person.toString());
        }catch(IncorrectAgeException | NameUndefinedException e){
            System.out.println(e.getMessage());
        }
    }
}
