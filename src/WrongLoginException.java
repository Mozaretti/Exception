public class WrongLoginException extends RuntimeException {
    public WrongLoginException(){
    }

    public WrongLoginException(String mesage) {
        super(mesage);
    }

}
