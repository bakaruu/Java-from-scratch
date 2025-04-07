import java.util.Scanner;

public class Exercise2P_SWITCH_CASE {
    public static void main(String[] args) {

//        EXERCISE 2P
//        Given a province (‘Granada’, ‘Badajoz’, etc.), indicate to
//        which autonomous community it belongs (‘Andalucía’, ‘Extremadura’,
//        etc.). It is sufficient to do this for only two
//        multi-provincial autonomous communities (but all their provinces
//        must be included).


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a city: ");
        String city = scanner.next().toLowerCase();


        switch (city) {
            case "granada":
            case "sevilla":
            case "cordoba":
            case "jaen":
            case "huelva":
            case "cadiz":
            case "almeria":
            case "malaga":
                System.out.println("Autonomous Community: Andalucía");
                break;

            case "badajoz":
            case "caceres":
                System.out.println("Autonomous Community: Extremadura");
                break;

            default:
                System.out.println("Unknown province.");
        }
    }
}
