import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String firstName = "";
        System.out.println("First name?");
        firstName = in.nextLine();

        String lastName = "";
        System.out.println("Last name?");
        lastName = in.nextLine();

        String businessName = "";
        System.out.println("Business domain name?");
        businessName = in.nextLine();

        //Checking if the user provided first and last names. If not, exiting the program.
        if(firstName.equals("") || lastName.equals(""))
        {
            System.out.println("Error! First and/or last name is missing");
        }

//Calling both methods and printing its results.
String generatedEmail = GenerateEmail(firstName, lastName, businessName);
System.out.println(generatedEmail);

String generatedUsername = GenerateUsername(firstName, lastName);
System.out.println(generatedUsername.toLowerCase());

        in.close();

    }
        
//Creating a method that generates an email for the user.
public static String GenerateEmail(String firstName, String lastName, String businessName)
    {
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + businessName.toLowerCase(); 
        return email;
    }

//Creating a method that generates a username for the user.
public static String GenerateUsername(String firstName, String lastName)
    {
        String username = firstName.substring(0, 4) + lastName.substring(lastName.length() - 4);
        return username;
    }

        
}

