class StaticExample {
    static int staticVar = 10;

    static {
        System.out.println("Static block executed!");
        staticVar = 20; 
    }

    static void staticMethod() {
        System.out.println("This is a static method. Static variable value: " + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Static Variable value: " + staticVar);
        staticMethod();
    }
}
