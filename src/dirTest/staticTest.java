package dirTest;

public class staticTest {
    public static void main(String[] args) {
        print.printStatic();
        //dirTest.print();
        print st = new print();
        st.print();
    }
}

class print {
    static void printStatic() {
        System.out.println("STATIC");
    }

    void print() {
        System.out.println("NON-STATIC");
    }
}
