package b08a1;

public class Mathe {
    public static int addLoop(int a, int b){
        while(b > 0){
            ++a;
            --b;
        }
        return a;
    }

    public static int subLoop(int a, int b){
        while(b > 0){
            --a;
            --b;
        }
        return a;
    }
    public static int mulLoop(int a, int b){
        int sum=0;
        for (; b > 0; --b) {
            sum = addLoop(a, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addLoop(1,2));
        System.out.println(subLoop(4,2));
        System.out.println(mulLoop(3,5));
    }
}
