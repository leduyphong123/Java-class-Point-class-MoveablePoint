public class Main{
    public static void main(String[] args){
        MoveablePoint moveablePoint =new MoveablePoint(3.4f,4.5f,5.3f,6.4f);
        System.out.println(moveablePoint.toString());

        for (float i: moveablePoint.move()){

            System.out.println(i);
        }
    }
}