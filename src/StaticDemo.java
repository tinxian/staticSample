public class StaticDemo {
    public  int number;

    public StaticDemo() {
        number = 0;
    }

    public StaticDemo(int number) {
        this.number = number;
    }

    public void showMyNumber() {
        System.out.println("My number is: " + number);
    }

}
