
public class problem2 {
    public static void main(String[] args) {
        BurgerBuilder bb = new BurgerBuilder();
        bb = bb.withCheese().withLetucci().withPeperone().withTomato().setSize("BIG");
        bb.makeBurger().eatBurger();
    }
}
class BurgerBuilder{
    Burger burger;

    public BurgerBuilder withCheese() {
        this.burger.cheese = true;
        return this;
    }

    public BurgerBuilder withPeperone() {
        this.burger.peperone = true;
        return this;
    }

    public BurgerBuilder withLetucci() {
        this.burger.letucci = true;
        return this;
    }

    public BurgerBuilder withTomato() {
        this.burger.tomato = true;
        return this;
    }

    public BurgerBuilder setSize(String Size) {
        switch (Size) {
            case "MINI" -> this.burger.size = SIZE.MINI;
            case "MEDIUM" -> this.burger.size = SIZE.MEDIUM;
            case "BIG" -> this.burger.size = SIZE.BIG;
        }
        return this;
    }

    Burger makeBurger(){
        return this.burger;
    }
    class Burger{
        boolean cheese, peperone, letucci, tomato;
        SIZE size;
        public void eatBurger(){
            System.out.println("You are eating burger with " + (cheese? "cheese, ":"") + (peperone? "peperone, ":"") +
                    (letucci? "letucci, ":"")+ (tomato? "tomato, ":"")+ "its size is "+ size );
        }
    }
}
enum SIZE{
    MINI, MEDIUM, BIG;
}
