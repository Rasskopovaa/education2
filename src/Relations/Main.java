package Relations;

public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
    }

    public static class Man {
        public Woman wife;
        private int age;
        private String name;
    }

    public static class Woman {
        public Man husband;
        private int age;
        private String name;
    }
}
