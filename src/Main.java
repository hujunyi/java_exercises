import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter command [9 to end input]:");
        String command = in.nextLine();
        TurtleGraphics game = new TurtleGraphics();
        while(!command.equals("9")){
            if(command.length() == 1){
                int value = Integer.parseInt(command);
                if(value != 5){
                    game.executeCommand(value);
                } else {
                    System.out.print("Enter forward spaces:");
                    int spaces = Integer.parseInt(in.nextLine());
                    game.moveForward(spaces);
                }
            }
            System.out.print("Enter command [9 to end input]:");
            command = in.nextLine();
        }
    }
}