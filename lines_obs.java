package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;



public class lines_obs extends obstacle{
    private Circle ball1;
    public lines_obs(Circle ball1){
        super();
        this.ball1 = ball1;
        yellowLine = new Line();
        yellowLine.setEndX(136);
        yellowLine.setEndY(94);
        yellowLine.setLayoutX(-49.0);
        yellowLine.setLayoutY(-92.0);
        yellowLine.setStartX(58.00001);
        yellowLine.setStartY(95.0);
        yellowLine.setStroke(Color.YELLOW);
        yellowLine.setStrokeWidth(10.0);

        blueLine = new Line();
        blueLine.setEndX(175.19998);
        blueLine.setEndY(94.999984741);
        blueLine.setLayoutX(25.0);
        blueLine.setLayoutY(-92.0);
        blueLine.setStartX(75.5);
        blueLine.setStartY(95.0);
        blueLine.setStroke(Color.BLUE);
        blueLine.setStrokeWidth(10.0);

        pinkLine = new Line();
        pinkLine.setEndX(-143);
        pinkLine.setEndY(95);
        pinkLine.setLayoutX(436.0);
        pinkLine.setLayoutY(-145.0);
        pinkLine.setStartX(-46.89999);
        pinkLine.setStartY(95.0);
        pinkLine.setStroke(Color.PINK);
        pinkLine.setStrokeWidth(10.0);

        purpleLine = new Line();
        purpleLine.setEndX(228.3934);
        purpleLine.setEndY(95.0);
        purpleLine.setLayoutX(-35.0);
        purpleLine.setLayoutY(-145.0);
        purpleLine.setStartX(319.900001);
        purpleLine.setStartY(95.0);
        purpleLine.setStroke(Color.PURPLE);
        purpleLine.setStrokeWidth(10.0);
    }

    public void move()
    {
        TranslateTransition tt1 = new TranslateTransition(Duration.millis(1400), yellowLine);
        tt1.setByX(400);
        tt1.setAutoReverse(true);
        tt1.setCycleCount(500);
        tt1.play();

        TranslateTransition tt2 = new TranslateTransition(Duration.millis(1400), blueLine);
        tt2.setByX(400);
        tt2.setAutoReverse(true);
        tt2.setCycleCount(500);
        tt2.play();

        TranslateTransition tt3 = new TranslateTransition(Duration.millis(1400), pinkLine);
        tt3.setByX(-200);
        tt3.setAutoReverse(true);
        tt3.setCycleCount(500);
        tt3.play();

        TranslateTransition tt4 = new TranslateTransition(Duration.millis(1400), purpleLine);
        tt4.setByX(-200);
        tt4.setAutoReverse(true);
        tt4.setCycleCount(500);
        tt4.play();
    }
    
    public void isHit(){
        if(getBlueLine().getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("getBlueLine()");
            System.out.println(getBlueLine().getBoundsInParent());

            if(getBlueLine().getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");

            }
            else
                exitGame();
        }
        else if(getPinkLine().getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("getPinkLine()");
            System.out.println(getPinkLine().getBoundsInParent());

            if(getPinkLine().getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");

            }
            else
                exitGame();
        }
        else if(getPurpleLine().getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("getPurpleLine()");
            System.out.println(getPurpleLine().getBoundsInParent());

            if(getPurpleLine().getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");

            }
            else
                exitGame();
        }
        else if(getYellowLine().getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("getYellowLine()   ");
            System.out.println(getYellowLine().getBoundsInParent());

            if(getYellowLine().getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");
                exitGame();
            }
            else
                exitGame();
        }
    }
}