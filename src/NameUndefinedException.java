public class NameUndefinedException extends Exception {
    public NameUndefinedException(String value) {
        super(value + ", które podałeś jest puste lub krótsze niż 2 litery.");
    }
}
