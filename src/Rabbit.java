public class Rabbit {
   private int lenght;
    private String name;
    private boolean softness;

    Rabbit (int length, String name,boolean softness){
        this.lenght = length;
        this.name = name;
        this.softness = softness;
    }
    public void changeName(String name){
        this.name=name;
    }
}
