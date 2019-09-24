public class Main {

    public static void main(String[] args) {
        System.out.println("Running Static Demo");

        StaticDemo anotherDemo = new StaticDemo(10);
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.showMyNumber();

        StaticDemo newDemo = new StaticDemo(1);
        newDemo.showMyNumber();
        staticDemo.showMyNumber();
        
    }

}
