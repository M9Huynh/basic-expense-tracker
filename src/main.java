import java.io.FileWriter;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean run = true;

        // use for date java.time.LocalDate.now()

        while(run){
            menu();
            run=false;
        }
    }

    public static void addExpense(int cat){


        switch(cat){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
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
