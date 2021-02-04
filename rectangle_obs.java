package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;


public class rectangle_obs extends obstacle{
   private Circle ball1;

    public rectangle_obs(Circle ball1){
        super();
        this.ball1 = ball1;
        pinkLine = new Line();
        pinkLine.setStroke(Color.PINK);
        pinkLine.setLayoutY(81);
        pinkLine.setLayoutX(147);
        pinkLine.setRotate(-45);
        set(pinkLine);

        blueLine = new Line();
        blueLine.setStroke(Color.BLUE);
        blueLine.setLayoutY(190);
        blueLine.setLayoutX(256);
        blueLine.setRotate(-45);
        set(blueLine);

        purpleLine = new Line();
        purpleLine.setStroke(Color.PURPLE);
        purpleLine.setLayoutY(190);
        purpleLine.setLayoutX(147);
        purpleLine.setRotate(45);
        set(purpleLine);

        yellowLine = new Line();
        yellowLine.setStroke(Color.YELLOW);
        yellowLine.setLayoutY(81);
        yellowLine.setLayoutX(255);
        yellowLine.setRotate(45);
        set(yellowLine);
    }

    public void set(Line l) {
        l.setStrokeWidth(10);
        l.setStrokeType(StrokeType.CENTERED);
        l.setStrokeLineCap(StrokeLineCap.ROUND);
        l.setStrokeLineJoin(StrokeLineJoin.MITER);
        l.setStartY(0);
        l.setStartX(-100);
        l.setEndY(0);
        l.setEndX(50);
    }

    public void move() {
        Rotate rotation1 = new Rotate();
        Rotate rotation2 = new Rotate();
        Rotate rotation3 = new Rotate();
        Rotate rotation4 = new Rotate();

        rotation1.setPivotX(pinkLine.getStartX() + 53.0330-6.066);
        rotation1.setPivotY(pinkLine.getEndY() + 53.0330);
        rotation2.setPivotX(blueLine.getEndX() - 106.0660);
        rotation2.setPivotY(blueLine.getStartY() - 106.0660);
        rotation3.setPivotX(yellowLine.getEndX() - 106.0660);
        rotation3.setPivotY(yellowLine.getStartY() + 106.0660);
        rotation4.setPivotX(purpleLine.getStartX() + 53.0330-6.066);
        rotation4.setPivotY(purpleLine.getEndY() - 53.0330);

        System.out.println(rotation1.getPivotX() + " " + rotation1.getPivotY());
        System.out.println(rotation2.getPivotX() + " " + rotation2.getPivotY());
        System.out.println(rotation3.getPivotX() + " " + rotation3.getPivotY());
        System.out.println(rotation4.getPivotX() + " " + rotation4.getPivotY());

        pinkLine.getTransforms().add(rotation1);
        blueLine.getTransforms().add(rotation2);
        purpleLine.getTransforms().add(rotation3);
        yellowLine.getTransforms().add(rotation4);


        Timeline timeline1 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation1.angleProperty(), 0)),
                new KeyFrame(Duration.seconds(12), new KeyValue(rotation1.angleProperty(), 360))
        );

        Timeline timeline2 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation2.angleProperty(), 0)),
                new KeyFrame(Duration.seconds(12), new KeyValue(rotation2.angleProperty(), 360))
        );
        Timeline timeline3 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation3.angleProperty(), 0)),
                new KeyFrame(Duration.seconds(12), new KeyValue(rotation3.angleProperty(), 360))
        );

        Timeline timeline4 = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(rotation4.angleProperty(), 0)),
                new KeyFrame(Duration.seconds(12), new KeyValue(rotation4.angleProperty(), 360))
        );

        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline2.setCycleCount(Timeline.INDEFINITE);
        timeline3.setCycleCount(Timeline.INDEFINITE);
        timeline4.setCycleCount(Timeline.INDEFINITE);
        timeline1.play();
        timeline2.play();
        timeline3.play();
        timeline4.play();
    }

    public void checkrect() {
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