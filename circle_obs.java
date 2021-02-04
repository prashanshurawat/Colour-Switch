package sample;

import javafx.animation.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;

public class circle_obs extends obstacle{
    private Circle ball1;
    public circle_obs(Circle ball1){
        super();
        this.ball1 = ball1;
        pinkArc = new Arc();
        pinkArc.setStroke(Color.PINK);
        pinkArc.setStartAngle(90);
        set(pinkArc);

        blueArc = new Arc();
        blueArc.setStroke(Color.BLUE);
        blueArc.setStartAngle(0);
        set(blueArc);

        yellowArc = new Arc();
        yellowArc.setStroke(Color.YELLOW);
        yellowArc.setFill(Color.YELLOW);
        yellowArc.setStartAngle(270);
        set(yellowArc);

        purpleArc = new Arc();
        purpleArc.setStroke(Color.PURPLE);
        purpleArc.setStartAngle(180);
        set(purpleArc);
    }

    public void set(Arc arc) {
        arc.setFill(javafx.scene.paint.Color.valueOf("#ff21d605"));
        arc.setType(ArcType.OPEN);
        arc.setStrokeWidth(10);
        arc.setStrokeType(StrokeType.CENTERED);
        arc.setStrokeLineCap(StrokeLineCap.BUTT);
        arc.setStrokeLineJoin(StrokeLineJoin.MITER);
        arc.setRadiusX(80);
        arc.setRadiusY(80);
        arc.setLength(90);
        arc.setLayoutX(221);
        arc.setLayoutY(201);
    }

    public void move() {

        Timeline animation = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(yellowArc.startAngleProperty(), yellowArc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(6), new KeyValue(yellowArc.startAngleProperty(), yellowArc.getStartAngle() - 360, Interpolator.LINEAR)),
                new KeyFrame(Duration.ZERO, new KeyValue(blueArc.startAngleProperty(), blueArc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(6), new KeyValue(blueArc.startAngleProperty(), blueArc.getStartAngle() - 360, Interpolator.LINEAR)),
                new KeyFrame(Duration.ZERO, new KeyValue(purpleArc.startAngleProperty(), purpleArc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(6), new KeyValue(purpleArc.startAngleProperty(), purpleArc.getStartAngle() - 360, Interpolator.LINEAR)),
                new KeyFrame(Duration.ZERO, new KeyValue(pinkArc.startAngleProperty(), pinkArc.getStartAngle(), Interpolator.LINEAR)),
                new KeyFrame(Duration.seconds(6), new KeyValue(pinkArc.startAngleProperty(), pinkArc.getStartAngle() - 360, Interpolator.LINEAR))
        );

        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

        System.out.println(pinkArc.getBoundsInParent());
        System.out.println(blueArc.getBoundsInParent());
        System.out.println(purpleArc.getBoundsInParent());
        System.out.println(yellowArc.getBoundsInParent());

    }


    public void checkarcs() {
        if(pinkArc.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("arc1");
            System.out.println(pinkArc.getStroke().toString()+" "+
                    ball1.getStroke());

            if(pinkArc.getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");

            }
            else
                exitGame();
        }
        else if(blueArc.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("arc2");
            System.out.println(blueArc.getBoundsInParent());

            if(blueArc.getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");
            }
            else
                exitGame();
        }
        else if(yellowArc.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("arc3");
            System.out.println(yellowArc.getBoundsInParent());

            if(getYellowLine().getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");
            }
            else
                exitGame();
        }
        else if(purpleArc.getBoundsInParent().intersects(ball1.getBoundsInParent()))
        {
            System.out.println("arc4   ");
            System.out.println(purpleArc.getBoundsInParent());

            if(purpleArc.getStroke().toString().equals(ball1.getStroke().toString()))
            {
                System.out.println("aa chalti kya");
            }
            else
                exitGame();
        }
    }
}
