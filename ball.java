package sample;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ball {
    private Circle ball1;
    private Circle colordisk;
    private String color;
    public ball(Circle ball1, Circle colorChange){
        this.ball1 = ball1;
        ball1.setStroke(Color.BLUE);
        ball1.setFill(Color.BLUE);
        this.color = ball1.getStroke().toString();
        this.colordisk = colorChange;
    }
    void colourchange(){
        if(colordisk.getBoundsInParent().intersects(ball1.getBoundsInParent())){
            ball1.setStroke(colordisk.getStroke());
            ball1.setFill(colordisk.getFill());
            colordisk.setVisible(false);
            int c = (int)(Math.random()*4+1);
            if(c==1){
                colordisk.setStroke(Color.PINK);
                colordisk.setFill(Color.PINK);
            }
            else if(c==2){
                colordisk.setStroke(Color.BLUE);
                colordisk.setFill(Color.BLUE);
            }
            else if(c==3){
                colordisk.setFill(Color.YELLOW);
                colordisk.setStroke(Color.YELLOW);
            }
            else if(c==4){
                colordisk.setStroke(Color.PURPLE);
                colordisk.setFill(Color.PURPLE);
            }
            colordisk.setLayoutX(452);
            colordisk.setLayoutY(-50);
        }
    }
    public Circle getColordisk(){ return colordisk;}
}
