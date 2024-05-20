package minggu2;

public class SnakeMain {
    public static void main(String[] args) {
        Snake snake1 = new Snake();
        
        snake1.x = 5;
        snake1.y = 10;
        snake1.height = 25;
        snake1.width = 30;
        
        System.out.println("Posisi awal: ");
        System.out.println("x: " + snake1.x + "    y: " + snake1.y);
        
        System.out.println("=============");
        
        snake1.moveDown();
        snake1.moveLeft();
        snake1.moveDown();
        snake1.moveLeft();
        snake1.moveLeft();
        
        snake1.printPosition();
    }
}
