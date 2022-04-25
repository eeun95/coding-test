public class accessTest {

    public static void main(String[] args) {
        accessClass ac = new accessClass();
        ac.print();
    }
}
class accessClass {
    public static void main(String[] args) {
        accessClass ac = new accessClass();
        ac.print();
    }
    void print() {
        System.out.println("HI");
    }
}
