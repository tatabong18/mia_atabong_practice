package class_practice;


class A {

    void ETL() {
        String E = "i";
        String T = "love";
        String L = "java";
        System.out.println(E + T + L);
    }

    ;

    void ETL(String ETL) {
        System.out.println(ETL.toUpperCase());
    }

    void ETL(String E, String T, String L) {
        System.out.println(E + T + L);
    }
}


public class Main6 {
    public static void main(String args[]) {
        String E = "abc10";
        String T = "def20";
        String L = "pqr30";

        A obj = new A();
        obj.ETL(E,T,L);
    }
}

