import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Wprowadz imię osoby: ");
            person.setFirstName(input.nextLine());
            System.out.println("Wprowadz nazwisko osoby: ");
            person.setLastName(input.nextLine());
            if(person.getLastName()==null || person.getFirstName() == null ||
                    person.getLastName().length()<3 || person.getFirstName().length()<3) {
                throw new NameUndefinedException();
            }
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Wprowadz wiek osoby: ");
            person.setAge(input.nextInt());
            input.nextLine();
            if(person.getAge()<1){
                throw new IncorrectAgeException(person.AGE_LIMIT);
            }
        } catch (IncorrectAgeException e) {
            System.out.println(e.getMessage());
        }
            System.out.println("Wprowadz pesel osoby: ");
            person.setPesel(input.nextLine());
            System.out.println(person.toString());
        }
    }
