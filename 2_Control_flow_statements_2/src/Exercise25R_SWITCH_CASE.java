import java.util.Scanner;

public class Exercise25R_SWITCH_CASE {
    public static void main(String[] args) {
//        EXERCISE 25R
//        Make a program that reads a character or a colour written in
//        English and returns its encoding in hexadecimal. The list of
//        colours is limited.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color (in English): ");
        String color = scanner.nextLine().toLowerCase();

        String hexCode;

        switch (color) {
            case "red":
                hexCode = "#FF0000";
                break;
            case "green":
                hexCode = "#00FF00";
                break;
            case "blue":
                hexCode = "#0000FF";
                break;
            case "yellow":
                hexCode = "#FFFF00";
                break;
            case "cyan":
                hexCode = "#00FFFF";
                break;
            case "magenta":
                hexCode = "#FF00FF";
                break;
            case "black":
                hexCode = "#000000";
                break;
            case "white":
                hexCode = "#FFFFFF";
                break;
            case "gray":
            case "grey":
                hexCode = "#808080";
                break;
            case "orange":
                hexCode = "#FFA500";
                break;
            case "purple":
                hexCode = "#800080";
                break;
            default:
                hexCode = null;
                break;
        }

        if (hexCode != null) {
            System.out.println("The hex code for " + color + " is: " + hexCode);
        } else {
            System.out.println("Error: Color not recognized or not available.");
        }
    }
}
