package minggu2;

public class Snake {
    int x, y, width, height;
    
    void moveLeft() {
        if (x > 0 && x < width) {
            x -= 1;
        } else {
            detectCollision();
        }
    }
    void  moveRight() {
        if (x > 0 && x < width) {
            x += 1;
        } else {
            detectCollision();
        }
    }
    void moveUp() {
         if (y > 0 && y < height) {
            y -= 1;
        } else {
            detectCollision();
        }
    }
    void moveDown() {
         if (y > 0 && y < height) {
            y += 1;
        } else {
            detectCollision();
        }
    }
    void printPosition() {
        System.out.println("Posisi akhir: ");
        System.out.println("x: " + x + "    y: " + y);
    }
    void detectCollision() {
        System.out.println("GAME OVER");
    }
}
