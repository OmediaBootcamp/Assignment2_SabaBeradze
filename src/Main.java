import java.util.Objects;
import java.util.Random;

public class Main {

    public static long task1(int n) {
        if (n == 0) return 0;
        long ans = 1;
        long a = 1;
        for (int i = 2; i < n; i++) {
            ans += a;
            a = ans - a;
        }
        return ans;

    }

    public static void task2(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) System.out.println(Double.NaN);
        else if (discriminant == 0) System.out.println("Equation has only one root: " + (-b / (2 * a)));
        else {
            System.out.println("Equation has 2 roots:" + ((-b + Math.sqrt(discriminant)) / (2 * a)) + ","
                    + ((-b - Math.sqrt(discriminant)) / (2 * a)));

        }
    }

    public static void task3(int a) {
        if (a < 0) {
            System.err.println("Negative numbers are not allowed!!");
            return;
        }
        int ans = 1;
        while (a > 0) {
            ans *= a--;
        }
        System.out.println("The answer is:" + ans);
    }

    public static double task4(double a, double b) {
        if (a <= 0 || b <= 0) return Double.NaN;
        return Math.sqrt(a * a + b * b);
    }

    public static double task5(double a, double c) {
        if (c <= a || c <= 0 || a <= 0) return Double.NaN;
        return Math.sqrt(c * c - a * a);
    }

    public static double task6(int a) {
        return 0.5 * Math.pow(a, 2) * Math.sqrt(3) / 2;
    }

    public static void task7(int number) {
        switch (number) {
            case 2: {
                System.out.println('A');
                break;
            }
            case 22: {
                System.out.println('B');
                break;
            }
            case 222: {
                System.out.println('C');
                break;
            }
            case 3: {
                System.out.println('D');
                break;
            }
            case 33: {
                System.out.println('E');
                break;
            }
            case 333: {
                System.out.println('F');
                break;
            }
            case 4: {
                System.out.println('G');
                break;
            }
            case 44: {
                System.out.println('H');
                break;
            }
            case 444: {
                System.out.println('I');
                break;
            }
            case 5: {
                System.out.println('J');
                break;
            }
            case 55: {
                System.out.println('K');
                break;
            }
            case 555: {
                System.out.println('L');
                break;
            }
            case 6: {
                System.out.println('M');
                break;
            }
            case 66: {
                System.out.println('N');
                break;
            }
            case 666: {
                System.out.println('O');
                break;
            }
            case 7: {
                System.out.println('P');
                break;
            }
            case 77: {
                System.out.println('Q');
                break;
            }
            case 777: {
                System.out.println('R');
                break;
            }
            case 7777: {
                System.out.println('S');
                break;
            }
            case 8: {
                System.out.println('T');
                break;
            }
            case 88: {
                System.out.println('U');
                break;
            }
            case 888: {
                System.out.println('V');
                break;
            }
            case 9: {
                System.out.println('W');
                break;
            }
            case 99: {
                System.out.println('X');
                break;
            }
            case 999: {
                System.out.println('Y');
                break;
            }
            case 9999: {
                System.out.println('Z');
                break;
            }


        }

    }

    public static void task8() {
        System.out.println("Dice : " + new Random().nextInt(1, 7));
    }

    public static int task9() {
        return new Random().nextInt(1, 7) * 10 + new Random().nextInt(1, 7);
    }

    public static void task10(String first, String second) {
        int firstScore = 0;
        int secondScore = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == '1') firstScore++;
            if (second.charAt(i) == '1') secondScore++;
        }
        if (firstScore == secondScore) System.out.println("Draw!!!");
        if (firstScore > secondScore) System.out.println("First wins");
        else System.out.println("Second wins");
    }

    public static String task11(int number) {

        switch (number) {
            case 0: {
                return "იანვარი";
            }
            case 1: {
                return "თებერვალი";
            }
            case 2: {
                return "მარტი";
            }
            case 3: {
                return "აპრილი";
            }
            case 4: {
                return "მაისი";
            }
            case 5: {
                return "ივნისი";
            }
            case 6: {
                return "ივლისი";
            }
            case 7: {
                return "აგვისტო";
            }
            case 8: {
                return "სექტემბერი";
            }
            case 9: {
                return "ოქტომბერი";
            }
            case 10: {
                return "ნოემბერი";
            }
            case 11: {
                return "დეკემბერი";
            }
            default:
                return "ERROR";

        }

    }

    public static int task12(int a, int b, int c) {
        return a + b + c - Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
    }

    public static int task13(int a, int b, int c, int d) {
        int first = task12(a, b, c);
        int second = task12(b, c, d);
        int third = task12(a, c, d);
        int fourth = task12(a, b, d);
        return Math.min(Math.min(first, second), Math.min(third, fourth));

    }

    public static String task14(int year) {
        if (year < 1896) {
            return ("არ არსებობდა!!!");
        }
        if (year > 2022) {
            return "ჯერ არ ჩატარებულა!!!";
        }
        if (year % 4 == 0 && year <= 1920) return "ზაფხულის";
        if (year % 4 == 0 && year <= 1992) return "ზამთარიც და ზაფხულიც";
        if (year % 4 == 0) return "ზაფხულის";
        if (year % 2 == 0) return "ზამთრის";
        return "არ ჩატარებულა";
    }

    public static double task15(int a, int b) {
        double ans = 1;
        while (b-- > 0) {
            ans *= a;

        }
        return ans;

    }

    public static int task16(int number) {
        int cnt = 0;
        while (number != 1) {
            if (number % 2 == 1) number = number * 3 + 1;
            else number /= 2;
            cnt++;

        }
        return cnt;
    }


    public static void task17(int money) {
        if (money % 5 != 0) {
            System.err.println("თანხა არასწორია!!!");
            return;
        }
        String ans = money + "=";
        int numberOf200 = money / 200;
        money %= 200;
        if (numberOf200 != 0) {
            ans += 200 + "X" + numberOf200 + ",";
        }
        int numberOf100 = money / 100;
        money %= 100;
        if (numberOf100 != 0) {
            ans += 100 + "X" + numberOf100 + ",";
        }
        int numberOf50 = money / 50;
        money %= 50;
        if (numberOf50 != 0) {
            ans += 50 + "X" + numberOf50 + ",";
        }

        int numberOf20 = money / 20;
        money %= 20;
        if (numberOf20 != 0) {
            ans += 20 + "X" + numberOf20 + ",";
        }

        int numberOf10 = money / 10;
        money %= 10;
        if (numberOf10 != 0) {
            ans += 10 + "X" + numberOf10 + ",";
        }

        int numberOf5 = money / 5;

        if (numberOf5 != 0) {
            ans += 5 + "X" + numberOf5 + ",";
        }

        System.out.println(ans);


    }

    public static void main(String[] args) {
    }

}