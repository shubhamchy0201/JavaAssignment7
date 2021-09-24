public class MainClass {
    public static void main(String[] args) {
        Cycle cycle[]=new Cycle[4];
        cycle[0]=new Cycle();
        cycle[1]=new Unicycle();
        cycle[2]=new Bicycle();
        cycle[3]=new Tricycle();
        for (Cycle c:cycle)
        {
            //We cann't call as we have to declare balance method in Cycle class first.
            c.balance();
            //Exception in thread "main" java.lang.ClassCastException: class Cycle cannot be cast to class Unicycle (Cycle and Unicycle are in unnamed module of loader 'app')
            //	at MainClass.main(MainClass.java:11)
          //  ((Unicycle)c).balance();
        }
    }
}
