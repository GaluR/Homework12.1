public class IncorrectAgeException extends Exception {
    public IncorrectAgeException(int value) {
        super("Podałeś zbyt mały wiek. Musi być większa od " + value);
    }
}
