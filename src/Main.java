import shape_hierarchy.*;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void startTurtleGraphics(){
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
    public static void main(String[] args) {
        // 10.12 & 10.14
        Employee[] employees = new Employee[10];
        employees[0] = new SalariedEmployee("Joey", "Hu", "123", 50.0, new Date(4, 30, 1990));
        employees[1] = new HourlyEmployee("Joey", "Hu", "123", 50.0, 10, new Date(10, 25, 1989));
        employees[2] = new PieceWorker("Leo", "Hu", "123", new Date(10, 25, 1989), 10, 30);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);


        for(Employee curEmployee: employees){
            if(curEmployee == null) continue;
            double payroll = curEmployee.earnings() * 4; // earning is weekly salary
            if(curEmployee.getBirthDate().getMonth() - 1 == currentMonth){
                payroll += 100;
            }

            System.out.println(curEmployee.toString() + " payroll is " + payroll);

        }


        // 10.13
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(4);
        shapes[1] = new Sphere(4);
        for(Shape shape: shapes){
            if(shape.getShapeType() == 2){
                System.out.println("This is a two-dimensional shape. It's area is " +((TwoDimensionalShape)shape).getArea());
            } else if(shape.getShapeType() == 3){
                System.out.println("This is a three-dimensional shape. Its area is " +((ThreeDimensionalShape)shape).getArea() + " Its volume is " + ((ThreeDimensionalShape)shape).getVolume() );
            }
        }


    }
}