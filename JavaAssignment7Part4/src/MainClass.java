public class MainClass {
    public Cycle callMethod(String noOfWheel)
    {
        if(noOfWheel==null)
            return null;
        else if(noOfWheel.equals("1"))
            return new Unicycle();
        else if(noOfWheel.equals("2"))
            return new Bicycle();
        else
            return new Tricycle();
    }
    public static void main(String[] args) {
        MainClass mainClass=new MainClass();
        Cycle unicycle=mainClass.callMethod("1");
        unicycle.wheel();
        Cycle bicycle=mainClass.callMethod("2");
        bicycle.wheel();
        Cycle tricycle=mainClass.callMethod("3");
        tricycle.wheel();

    }
}
