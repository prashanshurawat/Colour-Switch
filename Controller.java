package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public void startMenu(ActionEvent event) throws IOException{
        try{
            //System.out.println("hello1");
            FXMLLoader startMenu  = new FXMLLoader(getClass().getResource("startMenu.fxml"));
            Parent root1 = (Parent) startMenu.load();
            Stage stage = new Stage();
            stage.setTitle("COLOUR SWITCH START MENU");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException e) {
            System.out.println("CANNOT OPEN START MENU");
        }
    }
    public void GameScreen(ActionEvent event) throws IOException{
        try{
            System.out.println("hello1");
            FXMLLoader startMenu  = new FXMLLoader(getClass().getResource("Game.fxml"));
            Parent root1 = (Parent) startMenu.load();
            Stage stage = new Stage();
            stage.setTitle("COLOUR SWITCH GAME");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException e) {
            System.out.println("CANNOT START GAME");
        }
    }
    public void pauseMenu(ActionEvent event) throws IOException{
        try{
            System.out.println("hello1");
            FXMLLoader startMenu  = new FXMLLoader(getClass().getResource("PauseMenu.fxml"));
            Parent root1 = (Parent) startMenu.load();
            Stage stage = new Stage();
            stage.setTitle("COLOUR SWITCH PAUSE MENU");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException e) {
            System.out.println("CANNOT OPEN PAUSE MENU");
        }
    }
    public void instMenu(ActionEvent event) throws IOException{
        try{
            System.out.println("hello1");
            FXMLLoader startMenu  = new FXMLLoader(getClass().getResource("instructions.fxml"));
            Parent root1 = (Parent) startMenu.load();
            Stage stage = new Stage();
            stage.setTitle("COLOUR SWITCH INSTRUCTIONS");
            stage.setScene(new Scene(root1));
            stage.show();

        } catch (IOException e) {
            System.out.println("CANNOT OPEN INSTRUCTIONS MENU");
        }
    }
    private Line line1, line2, line3, line4, l1, l2, l3, l4, r1, r2, r3, r4;
    private Arc pink, blue, yellow, purple;
    int starcount = 0;

    @FXML
    private Circle colordisk;

    @FXML
    private Circle ball1;


    @FXML
    private Button BALLbutton;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private ImageView star4;

    @FXML
    private ImageView star3;

    @FXML
    private ImageView star2;

    @FXML
    private ImageView star1;

    @FXML
    private TextArea scoreBoard;

    @FXML
    void moveball(ActionEvent event) throws IOException{
        System.out.println("circle : "+pink.getLayoutY());
        System.out.println("line : "+ line3.getLayoutY());
        System.out.println("cross : "+ l1.getLayoutY());
        System.out.println("rectangle : "+ r1.getLayoutY());
        System.out.println("ball :"+ball1.getLayoutY());

        while(pink.getLayoutY() >= 900 || l1.getLayoutY()>=1800 || r1.getLayoutY()>= 1800){
            System.out.println("entering while loop " + line1.getLayoutY() + " "+ l1.getLayoutY());
            System.out.println("in loop circle : "+pink.getLayoutY());
            System.out.println("in loop line : "+ line3.getLayoutY());
            System.out.println("in loop cross : "+ l1.getLayoutY());
            System.out.println("in loop rectangle : "+ r1.getLayoutY());
            System.out.println("in loop ball :"+ball1.getLayoutY());
            if(pink.getLayoutY() >= 450 || ball1.getLayoutY()<=pink.getLayoutY()){
                pink.setLayoutY(-500);
                blue.setLayoutY(-500);
                yellow.setLayoutY(-500);
                purple.setLayoutY(-500);
                star1.setLayoutY(-530);
            }

            if(line3.getLayoutY() >= 450 || ball1.getLayoutY()<=line3.getLayoutY()) {
                line1.setLayoutY(-400);
                line2.setLayoutY(-400);
                line3.setLayoutY(-400);
                line4.setLayoutY(-400);
                star2.setLayoutY(-430);
            }
            if(l1.getLayoutY() >= 450 || ball1.getLayoutY()<=l1.getLayoutY()) {
                l1.setLayoutY(-150);
                l2.setLayoutY(-300);
                l3.setLayoutY(-150);
                l4.setLayoutY(-300);
                star3.setLayoutY(-470);
            }
            if(r1.getLayoutY() >= 450 || ball1.getLayoutY()<r1.getLayoutY()) {
                r1.setLayoutY(-104);
                r2.setLayoutY(-214);
                r3.setLayoutY(-104);
                r4.setLayoutY(-214);
                star4.setLayoutY(-390);
            }

            if(ball1.getLayoutY()<=750 || pink.getLayoutY()>=50){//&& (l1.getLayoutY()>=300 || l1.getLayoutY()<=0)) {
                pink.setLayoutY(pink.getLayoutY()+20);
                yellow.setLayoutY(yellow.getLayoutY()+20);
                purple.setLayoutY(purple.getLayoutY()+20);
                blue.setLayoutY(blue.getLayoutY()+20);
                s.getStar1().setLayoutY(star1.getLayoutY()+20);
                o.checkarcs();
            }

            if(pink.getLayoutY()>=300 ||(line3.isVisible() && line3.getLayoutY()>=-150)) {
                line1.setLayoutY(line1.getLayoutY() + 20);
                line2.setLayoutY(line2.getLayoutY() + 20);
                line3.setLayoutY(line3.getLayoutY() + 20);
                line4.setLayoutY(line4.getLayoutY() + 20);
                //System.out.println("Before" + star2.getLayoutY());
                s.getStar2().setLayoutY(star2.getLayoutY() + 20);
                //System.out.println("After" + star2.getLayoutY());
                v.isHit();
            }

            if( line3.getLayoutY()>=200 || (l1.getLayoutY()>=-250 && line3.getLayoutY()>=200)) {
                l1.setLayoutY(l1.getLayoutY() + 20);
                l2.setLayoutY(l2.getLayoutY() + 20);
                l3.setLayoutY(l3.getLayoutY() + 20);
                l4.setLayoutY(l4.getLayoutY() + 20);
                s.getStar3().setLayoutY(star3.getLayoutY() + 20);
                f.checkcross();
            }

            if( l1.getLayoutY()>=200 || (r1.getLayoutY()>=-150 && l1.getLayoutY()>=200)) {
                r1.setLayoutY(r1.getLayoutY() + 20);
                r2.setLayoutY(r2.getLayoutY() + 20);
                r3.setLayoutY(r3.getLayoutY() + 20);
                r4.setLayoutY(r4.getLayoutY() + 20);
                s.getStar4().setLayoutY(star4.getLayoutY() + 20);
                r.checkrect();
            }
            if(!colordisk.isVisible())
                colordisk.setVisible(true);
            if(ball1.getLayoutY()>=80 && ball1.getLayoutY()<=224) {
                ball1.setLayoutY(ball1.getLayoutY());
                Timeline t1 = new Timeline(new KeyFrame(Duration.millis(4000), new KeyValue(ball1.layoutYProperty(),600)));
                t1.setCycleCount(1);
                t1.play();
            }
            else {
                ball1.setLayoutY(ball1.getLayoutY()-30);
                Timeline t1 = new Timeline(new KeyFrame(Duration.millis(4000), new KeyValue(ball1.layoutYProperty(),600)));
                t1.setCycleCount(1);
                t1.play();
            }
            s.checkscore();
            b.getColordisk().setLayoutY(colordisk.getLayoutY()+20);
            b.colourchange();
        }

        if(ball1.getLayoutY()<=550){// && l1.getLayoutY()<=-30 ) {
            pink.setLayoutY(pink.getLayoutY()+20);
            yellow.setLayoutY(yellow.getLayoutY()+20);
            purple.setLayoutY(purple.getLayoutY()+20);
            blue.setLayoutY(blue.getLayoutY()+20);
            s.getStar1().setLayoutY(star1.getLayoutY()+20);
            o.checkarcs();
        }

        if(pink.getLayoutY()>=220 ||(line3.isVisible() && line3.getLayoutY()>=-452)) {
            line1.setLayoutY(line1.getLayoutY() + 20);
            line2.setLayoutY(line2.getLayoutY() + 20);
            line3.setLayoutY(line3.getLayoutY() + 20);
            line4.setLayoutY(line4.getLayoutY() + 20);
            //System.out.println("Before" + star2.getLayoutY());
            //star2.setLayoutY(star2.getLayoutY() + 20);
            //System.out.println("After" + star2.getLayoutY());
            s.getStar2().setLayoutY(star2.getLayoutY()+20);
            v.isHit();
        }

        if( line3.getLayoutY()>=200 || (l1.getLayoutY()>-150)) {
            l1.setLayoutY(l1.getLayoutY() + 20);
            l2.setLayoutY(l2.getLayoutY() + 20);
            l3.setLayoutY(l3.getLayoutY() + 20);
            l4.setLayoutY(l4.getLayoutY() + 20);
            s.getStar3().setLayoutY(star3.getLayoutY() + 20);
            f.checkcross();
        }
        if( l1.getLayoutY()>=400 || (r1.getLayoutY()>=-150)) {
            r1.setLayoutY(r1.getLayoutY() + 20);
            r2.setLayoutY(r2.getLayoutY() + 20);
            r3.setLayoutY(r3.getLayoutY() + 20);
            r4.setLayoutY(r4.getLayoutY() + 20);
            s.getStar4().setLayoutY(star4.getLayoutY() + 20);
            r.checkrect();
        }
        if(!colordisk.isVisible())
            colordisk.setVisible(true);
        if(ball1.getLayoutY()>=80 && ball1.getLayoutY()<=150) {
            ball1.setLayoutY(ball1.getLayoutY());
            Timeline t1 = new Timeline(new KeyFrame(Duration.millis(4000), new KeyValue(ball1.layoutYProperty(),600)));
            t1.setCycleCount(1);
            t1.play();
        }
        else {
            ball1.setLayoutY(ball1.getLayoutY()-30);
            Timeline t1 = new Timeline(new KeyFrame(Duration.millis(4000), new KeyValue(ball1.layoutYProperty(),600)));
            t1.setCycleCount(1);
            t1.play();
        }
        s.checkscore();
        b.getColordisk().setLayoutY(colordisk.getLayoutY()+20);
        b.colourchange();
        /*checklines();
        checkarcs();
        checkcross();
        checkrect();*/
    }
    star s;
    sample.ball b;
    lines_obs v;
    cross_obs f;
    rectangle_obs r;
    circle_obs o;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        s = new star(star1, star2, star3, star4, ball1, scoreBoard);

        o = new circle_obs(ball1);
        yellow = o.getYellowArc();
        pink = o.getPinkArc();
        purple = o.getPurpleArc();
        blue = o.getBlueArc();

        mainPane.getChildren().add(yellow);
        mainPane.getChildren().add(pink);
        mainPane.getChildren().add(blue);
        mainPane.getChildren().add(purple);

        yellow.setCenterX(228);
        pink.setCenterX(228);
        purple.setCenterX(228);
        blue.setCenterX(228);
        s.getStar1().setLayoutY(210);
        s.getStar1().setLayoutX(450);
        o.move();

        v = new lines_obs(ball1);
        line1 = v.getBlueLine();
        line2 = v.getPinkLine();
        line3 = v.getPurpleLine();
        line4 = v.getYellowLine();
        s.getStar2().setLayoutY(line1.getLayoutY()-50);
        s.getStar2().setLayoutX(452);
        mainPane.getChildren().add(line1);
        mainPane.getChildren().add(line2);
        mainPane.getChildren().add(line3);
        mainPane.getChildren().add(line4);

        line1.setVisible(true);
        line2.setVisible(true);
        line3.setVisible(true);
        line4.setVisible(true);

        line1.setLayoutX(118);
        line2.setLayoutX(line1.getLayoutX()+237);
        line3.setLayoutX(118);
        line4.setLayoutX(line3.getLayoutX()+237);
        line1.setLayoutY(line1.getLayoutY()-100);
        line2.setLayoutY(line2.getLayoutY()-100);
        line3.setLayoutY(line3.getLayoutY()-100);
        line4.setLayoutY(line4.getLayoutY()-100);

        v.move();

        f = new cross_obs(ball1);
        l1 = f.getBlueLine();
        l2 = f.getPinkLine();
        l3 = f.getPurpleLine();
        l4 = f.getYellowLine();

        mainPane.getChildren().add(l1);
        mainPane.getChildren().add(l2);
        mainPane.getChildren().add(l3);
        mainPane.getChildren().add(l4);

        l1.setLayoutX(l1.getLayoutX()+440);
        l2.setLayoutX(l2.getLayoutX()+440);
        l3.setLayoutX(l3.getLayoutX()+440);
        l4.setLayoutX(l4.getLayoutX()+440);

        l1.setLayoutY(l1.getLayoutY()-600);
        l2.setLayoutY(l2.getLayoutY()-600);
        l3.setLayoutY(l3.getLayoutY()-600);
        l4.setLayoutY(l4.getLayoutY()-600);
        s.getStar3().setLayoutX(452);
        s.getStar3().setLayoutY(l4.getLayoutY()-100);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);

        r = new rectangle_obs(ball1);
        r1 = r.getBlueLine();
        r2 = r.getPinkLine();
        r3 = r.getPurpleLine();
        r4 = r.getYellowLine();

        mainPane.getChildren().add(r1);
        mainPane.getChildren().add(r2);
        mainPane.getChildren().add(r3);
        mainPane.getChildren().add(r4);

        r1.setLayoutX(r1.getLayoutX()+370);
        r2.setLayoutX(r2.getLayoutX()+370);
        r3.setLayoutX(r3.getLayoutX()+370);
        r4.setLayoutX(r4.getLayoutX()+370);
        r1.setLayoutY(r1.getLayoutY()-640);
        r2.setLayoutY(r2.getLayoutY()-640);
        r3.setLayoutY(r3.getLayoutY()-640);
        r4.setLayoutY(r4.getLayoutY()-640);
        s.getStar4().setLayoutX(452);
        s.getStar4().setLayoutY(r1.getLayoutY());
        r1.setVisible(true);
        r2.setVisible(true);
        r3.setVisible(true);
        r4.setVisible(true);

        r.move();
        f.move();

        ball1.setStroke(Color.BLUE);
        ball1.setFill(Color.BLUE);

        b = new sample.ball(ball1, colordisk);
        colordisk.setLayoutX(452);
        colordisk.setLayoutY(50);
        colordisk.setFill(Color.PINK);
        colordisk.setStroke(Color.PINK);
    }
}

