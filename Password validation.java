public class Passwordvalidation
{
    public static void main(String[] args)
    {
        String password="Shinchan@45";
        String passwordvalidation="^((?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%&])).{8,}$";
        if(password.matches(passwordvalidation))
        {
            System.out.println("Password is valid");
        }
        else
        {
            System.out.println("Password is invalid");
        }
    }
}
