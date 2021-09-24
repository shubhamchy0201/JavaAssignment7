public class MainClass {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].print();
        rodent[0].status();
        rodent[1] = new Rat();
        rodent[1].print();
        rodent[1].status();
        rodent[2] = new Hamster();
        rodent[2].print();
        rodent[2].status();
    }
}
