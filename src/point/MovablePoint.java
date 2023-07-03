package point;

public class MovablePoint implements Movable {

    private int x = 0;
    private int y = 0;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int xSpeed, int ySpeed) {

    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    @Override
    public String toString() {
        return String.format("This point is at (%s,%s), it speed is x = %s, y = %s",x,y,xSpeed,ySpeed);
    }
}
