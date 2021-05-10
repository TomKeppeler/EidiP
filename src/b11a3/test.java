package b11a3;

public class test {
    public static void main(String[] args) {
        Mensch[] m = {new Frau("abc", 2, 2, 2), new Frau("abc", 2, 2, 2)};
        for (int i = 0; i < m.length; i++) {
            Mensch m1 = m[i];
            m1.alter();
        }
        for (Mensch mensch : m) {
            mensch.alter();
        }
        

    }
}
