public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(int value) {
        super("Podałeś zbyt mały wiek. Musi być większa od " + value);
    }
}
