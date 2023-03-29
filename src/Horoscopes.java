import java.util.Scanner;
public class Horoscopes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, d; //m=month,d=day

        System.out.print("What month were you born? :");
        m = input.nextInt();
        System.out.print("Enter your birthday :");
        d = input.nextInt();

        if (m == 1) {
            if (d >= 1 && d <= 31) {
                if (d < 22) {
                    System.out.println("Your horoscope is capricorn");
                } else {
                    System.out.println("Your horoscope is aquarius ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 2) {
            if (d >= 1 && d <= 28) {
                if (d < 19) {
                    System.out.println("Your horoscope is aquarius");
                } else {
                    System.out.println("Your horoscope is pisces ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 3) {
            if (d >= 1 && d <= 31) {
                if (d < 21) {
                    System.out.println("Your horoscope is pisces");
                } else {
                    System.out.println("Your horoscope is aries ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 4) {
            if (d >= 1 && d <= 30) {
                if (d < 21) {
                    System.out.println("Your horoscope is aries");
                } else {
                    System.out.println("Your horoscope is taurus ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 5) {
            if (d >= 1 && d <= 31) {
                if (d < 22) {
                    System.out.println("Your horoscope is taurus");
                } else {
                    System.out.println("Your horoscope is gemini ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 6) {
            if (d >= 1 && d <= 30) {
                if (d < 23) {
                    System.out.println("Your horoscope is gemini");
                } else {
                    System.out.println("Your horoscope is cancer ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 7) {
            if (d >= 1 && d <= 31) {
                if (d < 23) {
                    System.out.println("Your horoscope is cancer");
                } else {
                    System.out.println("Your horoscope is leo ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 8) {
            if (d >= 1 && d <= 31) {
                if (d < 23) {
                    System.out.println("Your horoscope is leo");
                } else {
                    System.out.println("Your horoscope is virgo ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 9) {
            if (d >= 1 && d <= 30) {
                if (d < 23) {
                    System.out.println("Your horoscope is virgo");
                } else {
                    System.out.println("Your horoscope is libra ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 10) {
            if (d >= 1 && d <= 31) {
                if (d < 23) {
                    System.out.println("Your horoscope is libra");
                } else {
                    System.out.println("Your horoscope is scorpio ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 11) {
            if (d >= 1 && d <= 30) {
                if (d < 22) {
                    System.out.println("Your horoscope is scorpio");
                } else {
                    System.out.println("Your horoscope is sagittarius ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        } else if (m == 12) {
            if (d >= 1 && d <= 31) {
                if (d < 22) {
                    System.out.println("Your horoscope is sagittarius");
                } else {
                    System.out.println("Your horoscope is capricorn ");
                }
            } else {
                System.out.println("You entered incorrectly!");
            }
        }
        else {
            System.out.println("You entered incorrectly!");
        }
    }
}