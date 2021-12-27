import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean run = true;

        // use for date java.time.LocalDate.now()

    }

    //Things below will likely be scrapped to make project OOP

    public static void addExpense(int cat){

        String output = "";


        switch(cat){
            case 1:
                output += "Rent,";
                break;
            case 2:
                output += "Tuition,";
                break;
            case 3:
                output += "Utilities,";
                break;
            case 4:
                output += "Groceries,";
                break;
            case 5:
                output += "Restaurant,";
                break;
            case 6:
                output += "Entertainment,";
                break;
            case 7:
                output += "Clothing,";
                break;
            case 8:
                output += "Travel,";
                break;
            case 9:
                output += "Other,";
                break;
            default:
                System.out.println("Invalid selection, going back to main selection...\n");
                menu();
        }
    }

    private static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add new expense" + "\n" +
                "2. Remove expense" + "\n" +
                "3. View expenses" + "\n" +
                "Type \"Q\" to quit");

        String strMenuSel = sc.next();
        strMenuSel.toLowerCase(Locale.ROOT);

        if (strMenuSel.equals("1")){
            System.out.println("What type of expense?" + "\n" +
                    "1. Rent" + "\n" +
                    "2. Tuition" + "\n" +
                    "3. Utilities" + "\n" +
                    "4. Groceries" + "\n" +
                    "5. Restaurants" + "\n" +
                    "6. Entertainment" + "\n" +
                    "7. Clothing" + "\n" +
                    "8. Travel" + "\n" +
                    "9. Other" + "\n");

            int intMenuSel = sc.nextInt();

            addExpense(intMenuSel);

        }else if (strMenuSel.equals("2")){

        }else if (strMenuSel.equals("3")){

        }else if (strMenuSel.equals("q")){
            System.out.println("Thank you! Have a nice day. Now exiting.");
            System.exit(0);
        }else{
            System.out.println("Selection is invalid, please enter one of the following options: ");
            menu();
        }

    }

//    private static boolean emptyFile(){
//
//
//        return false;
//    }


}
