public class TurtleGraphics {

    private static final int SIZE = 20;
    private int[][] floor = new int[SIZE][SIZE];
    private boolean isPenUp = true;
    private int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int directionIndex = 0;

    private int posX = 0, posY = 0;

    private void setPenUp(){
        this.isPenUp = true;
    }

    private void setPenDown(){
        this.isPenUp = false;
    }

    private void turnRight(){
        this.directionIndex = (this.directionIndex + 1) % this.directions.length;
    }

    private void turnLeft(){
        this.directionIndex = (this.directionIndex + this.directions.length - 1) % this.directions.length;
    }

    public boolean moveForward(int spaces){
        int[] direction = this.directions[this.directionIndex];
        int targetX = posX + direction[0] * spaces;
        int targetY = posY + direction[1] * spaces;
        if(targetX < 0 || targetX >= SIZE){
            return false;
        }
        if(targetY < 0 || targetY >= SIZE) {
            return false;
        }
        if(!this.isPenUp){
            for(int i = 0; i < spaces; i++){
                posX += direction[0];
                posY += direction[1];
                floor[posX][posY] = 1;
            }
        }
        return true;
    }
    private void display(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(floor[i][j] == 1){
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }


    public boolean executeCommand(int command){
        switch (command){
            case 1:
                this.setPenUp();
                break;
            case 2:
                this.setPenDown();
                break;
            case 3:
                this.turnLeft();
                break;
            case 4:
                this.turnRight();
                break;
            case 6:
                this.display();
                break;
            default:
                return false;
        }
        return true;
    }
}
