public class Hamster extends Rodent{
    Hamster()
    {
        System.out.println("Form Hamster Class");
    }

    @Override
    public void status() {
        System.out.println("Sleeping");
    }

    @Override
    public void print() {
        System.out.print("This is Hamster: ");
    }
}
