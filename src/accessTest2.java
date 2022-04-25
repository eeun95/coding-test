public class accessTest2 {

    public static void main(String[] args) {
        accessClass ac = new accessClass();
        //ac.print();
    }
}
class accessClass2 {
    public static void main(String[] args) {
        accessClass ac = new accessClass();
        ac.print();
    }
    private void print() {
        System.out.println("HI");
    }
}
