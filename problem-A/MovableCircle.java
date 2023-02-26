public class MovableCircle implements Movable {
 private int radius;
private MovablePoint center;
public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed){
    this.radius = radius;
    center = new MovablePoint(x, y, xSpeed, ySpeed);
}

    @Override
    public void moveUp() {
        center.y-= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y+= center.ySpeed;;
    }

    @Override
    public void moveLeft() {
     center.x-= center.xSpeed;
    }

    @Override
    public void moveRight() {
     center.x += center.xSpeed;
    }
    @Override
    public String toString(){
    return center.toString()+", radius="+this.radius;
    }

    public static void main(String[] args) {
       MovableCircle movableCircle = new MovableCircle(2,2,4,4,6);
        System.out.println(movableCircle.toString());
       movableCircle.moveDown();
       movableCircle.moveLeft();
        System.out.println(movableCircle.toString());
    }
}
