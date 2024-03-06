package seventhdayassignment;

public class Question1a {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {

            try {
                int denominator=Integer.parseInt(args[i]);
                System.out.println(24/denominator);
            }
            catch (ArithmeticException arithmeticException ){
                System.out.println(arithmeticException.getMessage());
            }
            catch (NumberFormatException numberFormatException){
                System.out.println(numberFormatException.getMessage());
            }
            catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }
        System.out.println("End of Program");
    }
}
