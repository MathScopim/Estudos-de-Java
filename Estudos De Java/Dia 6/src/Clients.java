public class Clients {

    String firstName;
    int age;
    int balance;
// Constructor
    Clients() {
        balance = 10;
    }
//
    void newAccount() {
        System.out.println(firstName + "Account created!");
        System.out.println("The new balance is $" + balance);
    }
}
