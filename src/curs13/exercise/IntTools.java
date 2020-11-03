package curs13.exercise;

/*- digitSum : returns the sum of its digits
        - lastDigit: returns the last digit
        - digitAt(int) : returns the digit at position x - if position is invalid, throw exception*/
public class IntTools {
    private final int number;

    public IntTools(int number) {
        this.number = number;
    }

    public int digitSum() {
        int n = number;
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public int lastDigit() {
        int last = 0;
        int n = number;
        while (n != 0) {
            last = n % 10;
            n = last / 10;

        }
        return last;
    }

    public int digitAt(int pos) {
        if (pos > length() || pos < 0) {
            throw new InToolsException("Invalid pozition!");
        } else {
            int calcPos = pos;
            int n = number;
            while (calcPos > 0) {
                n = n / 10;
                calcPos--;
            }
            return n % 10;
        }
    }

    private int length() {
        int n = number;
        int counter = 0;
        do {
            n = n / 10;
            counter++;
        }
        while (n != 0);

        return counter;
    }

    public static void main(String[] args) {
        IntTools tools = new IntTools(474747016);
        System.out.println(tools.digitAt(3));
        System.out.println(tools.digitAt(2));
        System.out.println(tools.digitAt(4));
        System.out.println(tools.digitAt(6));
        System.out.println(tools.digitSum());
        System.out.println(tools.length());
        System.out.println(tools.lastDigit());
    }
}

