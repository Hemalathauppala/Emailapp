import Emailapp.Email;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Hema","Uppala");
        email.setAlternateEmail("hu@company.com");
        email.showInfo();
        System.out.println("Alternate email is:" + email.getAlternateEmail());
    }
}
