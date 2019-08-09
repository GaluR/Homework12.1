public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Podałeś zbyt mały wiek. Musi być >=1");
    }
}
