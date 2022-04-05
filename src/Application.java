public class Application {
    public static void main(String...args) {
        Person Biba = new Person();
        Biba.name = "Bim";
        Person Boba = new Person();
        Boba.name = "Bom";
        System.out.println("First person's name " + Biba.name);
        System.out.println("Second person's name " + Boba.name);
    }
}