public class Point {
    private  int x, y;

    public Point(int x, int y) {
        this.x=x; this.y=y;
    }

    public String toString() {  // Object 클래스의 toString 오버라이딩
        return "점(" + x + ", " + y + ")";
    }

    public boolean equals(Object o) {
        Point p2;
        if(o instanceof Point) {
            p2 = (Point)o;  // 다운캐스xld
        }
        else {
            return false;
        }

        if(x==p2.x && y==p2.y) {
            return true;
        }
        else {
            return false;
        }
    }
}
