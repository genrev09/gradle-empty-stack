public class Android extends Mobile{
    private final int messageLimit = 15;
    @Override
    public void call(String message) {
        if(checkMessageExceedLength(message,messageLimit))
            System.out.println("<Android> Message cannot be sent");
        else
            System.out.println("<Android>Message : "+message);

    }
}