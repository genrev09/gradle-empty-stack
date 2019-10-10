public class iPhone extends Mobile{
    private final int messageLimit = 25;
    @Override
    public void call(String message) {
        if(checkMessageExceedLength(message,messageLimit))
            System.out.println("<iPhone> Message cannot be sent");
        else
            System.out.println("<iPhone>Message : "+message);
    }
}