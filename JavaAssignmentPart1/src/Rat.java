public class Rat extends Rodent{
    public Rat()
    {
        System.out.println("From Rat Class");
    }

    @Override
    public void status() {
        System.out.println("Running.");
    }

    @Override
    public void print() {
        System.out.print("This is Rat: ");
    }
}
