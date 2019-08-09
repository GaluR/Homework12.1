public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException() {
        super("Nie podałeś żadnego imienie lub nazwiska lub jest są one krótsze niż 2 litery");
    }
}
