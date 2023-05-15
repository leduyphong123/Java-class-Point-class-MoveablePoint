public class MoveablePoint extends Point{
    float xSpeed,ySpeed;
    MoveablePoint(){
        xSpeed=1.0f;
        ySpeed=1.0f;
    }
    MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MoveablePoint(float x,float y, float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public float getxSpeed(){
        return xSpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public float getySpeed(){
        return ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] result = {xSpeed,ySpeed};
        return result;
    }
    @Override
    public String toString(){
        return super.toString()+" xSpeed = " + xSpeed +" ySpeed = "+ySpeed;
    }
    public float[] move(){
        x+=xSpeed;
        y+=ySpeed;
        float[] result ={x,y};
        return result;
    }
}
