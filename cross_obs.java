package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class cross_obs extends obstacle{
    private Circle ball1;
    public cross_obs(Circle ball1){
        super();
        this.ball1 = ball1;
        blueLine = new Line();
        blueLine.setStroke(Color.BLUE);
        blueLine.setStrokeWidth(15);
        blueLine.setLayoutY(201);
        blueLine.setLayoutX(85);
        blueLine.setRotate(45);
        set(blueLine);

        yellowLine = new Line();
        yellowLine.setStroke(Color.YELLOW);
        yellowLine.setStrokeWidth(15);
        yellowLine.setLayoutY(201);
        yellowLine.setLayoutX(85);
        yellowLine.setRotate(-45);
        set(yellowLine);

        purpleLine = new Line();
        purpleLine.setStroke(Color.PURPLE);
        purpleLine.setStrokeWidth(15);
        purpleLine.setLayoutY(201);
        purpleLine.setLayoutX(85);
        purpleLine.setRotate(45);
        set(purpleLine);

        pinkLine = new Line();
        pinkLine.setStroke(Color.PINK);
        pinkLine.setStrokeWidth(15);
        pinkLine.setLayoutY(201);
        pinkLine.setLayoutX(85);
        pinkLine.setRotate(-45);
        set(pinkLine);
    }

    public void set(Line line) {
        line.setStartX(-100);
        line.setEndX(-24);
        line.setStartY(0);
        line.setEndY(0);
    }

    public void move() {
        Rotate rotation1 = new Rotate();
        Rotate rotation2 = new Rotate();

        rotation1.pivotXProperty().bind(pinkLine.startXProperty());
        rotation1.pivotYProperty().bind(pinkLine.startYProperty());
        rotation2.pivotXProperty().bind(yellowLine.endXProperty());
        rotation2.pivotYProperty().bind(yellowLine.endYProperty());


        pinkLine.getTransforms().add(rotation2);
        blueLine.getTransforms().add(rotation1);
        yellowLine.getTransforms().add(rotation1);
        purpleLine.getTransforms().add(rotation2);


        Timeline timeline1 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation1.angleProperty(), 0)),
                new KeyFrame(Duration.seconds(6), new KeyValue(rotation1.angleProperty(), 360)));

        Timeline timeline2 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation2.angleProperty(), 0)),
                new KeyFrame(Duration.seconds(6), new KeyValue(rotation2.angleProperty(), 360)));

        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline2.setCycleCount(Timeline.INDEFINITE);

        timeline1.play();
        timeline2.play();
    }
    public void checkcross() {
        if(blueLine.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("line1");
            System.out.println(blueLine.getBoundsInParent());

            if(blueLine.getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");

            }
            else
                exitGame();
        }
        else if(pinkLine.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("line2");
            System.out.println(pinkLine.getBoundsInParent());

            if(pinkLine.getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");
            }
            else
                exitGame();
        }
        else if(purpleLine.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("line3");
            System.out.println(purpleLine.getBoundsInParent());

            if(purpleLine.getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");

            }
            else
                exitGame();
        }
        else if(yellowLine.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("line4   ");
            System.out.println(yellowLine.getBoundsInParent());

            if(yellowLine.getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");
            }
            else
                exitGame();
        }
    }

}
