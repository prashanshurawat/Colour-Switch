package sample;

import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;

abstract public class obstacle {
    protected Line yellowLine;
    protected Line blueLine;
    protected Line pinkLine;
    protected Line purpleLine;
    protected Arc pinkArc;
    protected Arc blueArc;
    protected Arc yellowArc;
    protected Arc purpleArc;
    public obstacle(){
        yellowLine = new Line();
        blueLine = new Line();
        pinkLine = new Line();
        purpleLine = new Line();
        pinkArc = new Arc();
        blueArc = new Arc();
        yellowArc = new Arc();
        purpleArc = new Arc();
    }
    abstract public void move();

    public Line getBlueLine() {
        return blueLine;
    }

    public Line getPinkLine() {
        return pinkLine;
    }

    public Line getPurpleLine() {
        return purpleLine;
    }

    public Line getYellowLine() {
        return yellowLine;
    }

    public Arc getBlueArc() {
        return blueArc;
    }

    public Arc getPinkArc() {
        return pinkArc;
    }

    public Arc getPurpleArc() {
        return purpleArc;
    }

    public Arc getYellowArc() {
        return yellowArc;
    }

    protected void exitGame(){
        System.exit(0);
    }
    
}
