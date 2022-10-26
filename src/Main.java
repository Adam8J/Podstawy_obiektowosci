public class Main {
    public static void main(String[] args) {

        Rabbit name1 = new Rabbit(15, "Hony", true );
        name1.changeName("Zenek");
        name1.viewName();
        System.out.println(name1.viewName());
        name1.changeSoftness(false);
        name1.viewSoftness();
        System.out.println(name1.viewSoftness());
    }
}