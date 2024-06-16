public class ConceptOfClass {
    public static void main(String[] args) {

        Clients c001 = new Clients();
        c001.firstName = "Matheus";
        c001.age = 13;

        Clients c002 = new Clients();
        c002.firstName = "Tiago";
        c002.age = 32;

        c001.newAccount();
        System.out.println( "  ");
        c002.newAccount();
    }
}
