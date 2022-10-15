import java.util.Scanner;

class Restaurant {
    public static void main(String[] args) {
        char food_type;
        int km, sum = 0, qty, vegPrice = 12, nVegPrice = 15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Food Type??\n* 'V' for Veg\n* 'N' for NonVeg\n");
        food_type = sc.next().charAt(0);
        System.out.println("Quantity??\n");
        qty = sc.nextInt();
        System.out.println("Distance??\n");
        km = sc.nextInt();

        if (km - 6 > 0) {
            sum = 3;
            sum += 2 * (km - 6);
        } else if (km - 3 > 0) {
            sum = km - 3;
        } else if (km >= 0) {
            sum = 0;
        } else {
            sum = -1;
        }
        switch (food_type) {
            case 'V':
                sum += vegPrice * qty;
                break;
            case 'N':
                sum += nVegPrice * qty;
                break;
            default:
                sum = -1;
        }
        System.out.println("$ "+sum);
        sc.close();
    }
}
