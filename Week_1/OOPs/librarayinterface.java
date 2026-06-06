package hello;
import java.util.Scanner;

public interface LibraryUser{
    void registerAccount();
    void requestBook();
}
public class AdultUser implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if(this.age>12) System.out.println("You have successfully registered under an Adult Account");
        else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }

    @Override
    public void requestBook() {
         if("Fiction".equals(this.bookType)) System.out.println("Book Issued successfully, please return the book within 7 days");
         else System.out.println("“Oops, you are allowed to take only adult Fiction books");
    }
}
public class KidUser implements LibraryUser{
    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if(this.age<=12) System.out.println("Successfully registered under kid's account");
        else System.out.println("Sorry, the age must be less than 12 to register as a kid");
    }

    @Override
    public void requestBook() {
     if("Kids".equals(this.bookType)) System.out.println("Book Issued successfully, please return the book within 10 days");
     else System.out.println("“Oops, you are allowed to take only kids books");
    }
}

public class LibraryInterfaceDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        KidUser k=new KidUser();
        AdultUser a=new AdultUser();
        k.age=10;
        k.bookType="Kids";
        k.registerAccount();
        k.requestBook();

        k.age=18;
        k.bookType="Fiction";
        k.registerAccount();
        k.requestBook();

      
        a.age=5;
        a.bookType="Kids";
        a.registerAccount();
        a.requestBook();

        a.age=23;
        a.bookType="Fiction";
        a.registerAccount();
        a.requestBook();

    }
}
