public class Point {

    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int x){
        this.x = x;
        y = x;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public String coordinate(){
        return "(" + x +", " + y + ")";
    }

    public String quadrant(){
        String quadrant = "";
        if (x >0 && y >0){
            quadrant = "I";
        }
        if (x<0 && y >0){
            quadrant =  "II";
        }
        if (x<0 && y<0){
            quadrant =  "III";
        }
        if (x>0 && y<0){
            quadrant =  "IV";
        }
        if (x==0 && y==0){
            quadrant = "Origin";
        }
        else {
            if (x == 0) {
                quadrant = "On the y-axis";
            }
            if (y == 0) {
                quadrant = "On the x-axis";
            }
        }
        return quadrant;

    }
}
