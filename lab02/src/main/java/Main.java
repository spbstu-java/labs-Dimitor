public class Main {
    public static void main(String[] args) {
        AnnotatedClass obj = new AnnotatedClass();
        MethodCaller caller = new MethodCaller();

        System.out.println("Вызов публичных методов:");
        obj.publicMethod();
        obj.publicMethod2(2);
        obj.publicMethod3("param1", 1.0);
        System.out.println();

        System.out.println("Вызов защищённых и приватных методов:");
        caller.callAnnotatedMethods(obj);
    }
}