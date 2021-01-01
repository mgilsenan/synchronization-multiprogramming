public class EmptyStackException extends Exception{
    public EmptyStackException(String message){
        super(message);
        System.out.println("Empty Stack!!!");
    }
}
