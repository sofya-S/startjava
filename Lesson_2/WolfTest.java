public class WolfTest extends Wolf {
        
    public static void main(String[] args) {
        Wolf Ike = new Wolf();
        Ike.name = "Ike";
        Ike.sex = "Male";
        Ike.age = 3;
        Ike.weight = 25;
        Ike.colour = "black";
        System.out.println(Ike.name + ", " + Ike.sex + ", " + Ike.age + ", " + Ike.weight + ", " + Ike.colour);
        Ike.sit();
        Ike.walk();
        Ike.run();
        Ike.howl();
        Ike.hunt();

    }
}