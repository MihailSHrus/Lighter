
public class Lighter {
    public static void main(String[] args) {
        int lamps = 0b10010001000110001100110000111100; // 32,29,25,21,20,16,15,12,11,6,5,4,3 - ON
        blink(lamps, 5);
        run(lamps);
        mask1st(lamps);
        state(lamps);
    }
    public static int blink(int x, int k) {
        System.out.println("-Blinking-");
        System.out.println("0 - " +String.format("%32s",Integer.toBinaryString(x)).replaceAll(" ", "0"));
        for (int i = 1 ; i <= k ; i++ ) {
            x = ~x;
            System.out.println(i + " - " +String.format("%32s",Integer.toBinaryString(x)).replaceAll(" ", "0"));
        }
        return 1;
    }
    public static int run(int x) {
        System.out.println("-Running-");
        System.out.println(String.format("%32s",Integer.toBinaryString(x)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s",Integer.toBinaryString(x>>>1)).replaceAll(" ", "0"));
        return 1;
    }
    public static boolean mask1st(int x) {
        System.out.println("-First position (Mask)-");
        int mask = 1<<31;
        if ((x & mask) != 0) {
            System.out.println("Лампочка в первой позиции включена");
        } else {
            System.out.println("Лампочка в первой позиции выключена");
        }
        return true;
    }
    public static int state(int x) {
        System.out.println("-Actual state-");
        System.out.println(String.format("%32s",Integer.toBinaryString(x)).replaceAll(" ", "0"));
        return 1;
    }
}