public class Outer2 extends Outer1{
    public Outer2()
    {
        super();
        System.out.println("This is Outer2 Class");
    }
    class InnerOuter2 extends InnerOuter1
    {
        public InnerOuter2(int var)
        {
            super("Shubham");
            System.out.println("value of variable is: "+var);
        }
    }
}
