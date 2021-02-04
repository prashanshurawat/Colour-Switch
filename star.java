package sample;

import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

public class star{

    private ImageView star1;

    private ImageView star2;

    private ImageView star3;

    private ImageView star4;

    private TextArea scoreBoard;

    private Circle ball1;
    public star(ImageView star1,ImageView star2,ImageView star3,ImageView star4, Circle ball1, TextArea scoreBoard){
        this.star1 = star1;
        this.star2 = star2;
        this.star3 = star3;
        this.star4 = star4;
        this.ball1  = ball1;
        this.scoreBoard = scoreBoard;

    }
    int score = 0;
    void checkscore(){
        if(star1.getBoundsInParent().intersects(ball1.getBoundsInParent())){
            score++;
            return;
        }
        if(star2.getBoundsInParent().intersects(ball1.getBoundsInParent())){
            score++;
            return;
        }
        if(star3.getBoundsInParent().intersects(ball1.getBoundsInParent())){
            score++;
            return;
        }
        if(star4.getBoundsInParent().intersects(ball1.getBoundsInParent())){
            score++;
            return;
        }
        scoreBoard.setText(score+"  stars");
        scoreBoard.setWrapText(true);

    }
    public double getstar1Y(){
        return star1.getLayoutY();
    }

    public double getstar2Y(){
        return star2.getLayoutY();
    }

    public double getstar3Y(){
        return star3.getLayoutY();
    }

    public double getstar4Y(){
        return star4.getLayoutY();
    }
    public ImageView getStar1() {
        return star1;
    }
    public ImageView getStar2() { return star2; }
    public ImageView getStar3() { return star3; }
    public ImageView getStar4() { return star4; }
}