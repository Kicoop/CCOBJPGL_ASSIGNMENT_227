package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2 , img3 , img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Jollibee jollibee = new Jollibee();
    MangInasal manginasal = new MangInasal();
    McDonalds mcdonalds = new McDonalds();
    YellowCab yellowcab = new YellowCab();
    Zarks zarks = new Zarks();

    public void initialize() {
        jollibee.setColor("Red");
        jollibee.setFood("Chickenjoy");

        manginasal.setColor("Green");
        manginasal.setFood("Liempo");

        mcdonalds.setColor("Yellow");
        mcdonalds.setFood("Ala King");

        yellowcab.setColor("Black");
        yellowcab.setFood("Pizza");

        zarks.setColor("White");
        zarks.setFood("Burger");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Jollibee's color is " + jollibee.getColor() + " and their best sellers are " + jollibee.getFood());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Mang Inasal's color is " + manginasal.getColor() + " and their best sellers are " + manginasal.getFood());
        }

        if(sourceButton == btn3){
            alert.setContentText("McDonalds color is " + mcdonalds.getColor() + " and their best sellers are " + mcdonalds.getFood());
        }

        if(sourceButton == btn4){
            alert.setContentText("Yellow Cab's color is " + yellowcab.getColor() + " and their best sellers are " + yellowcab.getFood());
        }
        if(sourceButton == btn5){
            alert.setContentText("Zarks color is " + zarks.getColor() + " and their best sellers are " + zarks.getFood());
        }

        alert.showAndWait();

    }
}
