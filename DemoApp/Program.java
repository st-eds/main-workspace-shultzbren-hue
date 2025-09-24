import java.util.Scanner
public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("---- Task 1: Increment, Decrement, and coumpound Assignmnet ---);
        int score = 10;
        System.out.println("Initial score: " + score);

        // Coumpound Assighnment 
        score += 5;
        System.out.println("Score after += 5: " + score);
        //Increment Operator
        score++;
        System.out.println("Score after --: " + score);
        System.out.print("/nPress enter to continue...");
        input.nextLine();
        //---------------------------------
        System.out.println("----- Task 2: Type Casting ----");

        double price = 29.99;
        System.out.println("Original price (double)" + price);

        // Narrowing conversiton (double or int)
        int intprice = (int) price;
        System.out.println("Price after casting to int: " + intPrice);

        int items = 3;
        //Explicit casting for accurate dicision
        souble average = (double) intPrice / items;
        System.out.println("Average price with explicit casting: " + intPrice);

        int items = 3;
        // Explicit casting for accurate division
        double acerage = (souble) intPrice / items;
        System.out.println("Average prie with ecplicit casting: " + acerage);

        System.out.print(\nPress enter to continue...");
        input.nextLine();
        //------------------

        System.out.println("----Task 4: Escape Characters ---");

        //Using tab (\t) for formatting 
        string table = "Item\t\tPrice\nKeyboard\t&75\nMouse\t\t$25";
        System.out.println(table);

        // Using newline (\n) and quotes (\")
        String message = "He said, \"Hello, world!\"\n And the program responded,'Hi.'";
        System.out.println(message);

        System.out.print("\nPress enter to continue...");
        input.nectLine();

        //---------------------------------
        
        System.out.println("---- Task 5: challeng Task (combining concepts) --");

        int totalStudents = 15;
        final double GRADE_INCREASE = 1.05;
        double newGrade = 80;

        //Compound assignment with a constant
        newGrade*= GRADE INCREASE;

        //Round the grade using Math.round()
        long roundedGrade = Math.round(newGrade);

        // Print a final, formatted message that includes all variables
        String finalMessage = "Out of " + totalStudents + " students, the new rounded grade is: " + roundedGrade + ".\n\t This is a " + (GRADE_INCREASE - 1) *100 + "% increase.";
        System.out.println(finalMessage);
    }
}
