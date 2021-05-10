package b07a4;

public class test {
    public static void main(String[] args) {
        Uhrzeit u1 = new Uhrzeit(new Uhrzeit(18,15));
        u1.equals(new Uhrzeit(18,12));
    }
}
