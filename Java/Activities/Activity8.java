package activities;

public class Activity8 {
    public static void exceptionTest(String msg) throws CustomException {
        if (msg == null) throw new CustomException("String value is null");
        else {
            System.out.println(msg);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            Activity8.exceptionTest("Hello its not a null value");
            Activity8.exceptionTest(null);

        } catch (CustomException e) {
            System.out.println("The customised message is: "+e.getMessage());
        }
    }
}
