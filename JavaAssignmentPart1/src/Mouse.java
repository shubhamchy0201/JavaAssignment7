public class Mouse extends Rodent{
    public Mouse()
    {
        System.out.println("From Mouse class: ");
    }

    @Override
    public void status() {
        System.out.println("Playing.");
    }

    @Override
    public void print() {
        System.out.print("This is Mouse: ");
    }
}
