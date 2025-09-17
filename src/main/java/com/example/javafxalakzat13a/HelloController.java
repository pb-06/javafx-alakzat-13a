package com.example.javafxalakzat13a;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML public ListView<String> listview_Listview;
    @FXML public ImageView imageview_Alakzat;
    @FXML public Pane pane_Alakzat;

    public void onPirosSelected(ActionEvent actionEvent) {
        System.out.println("onPirosSelected actionEvent"+actionEvent);
        pane_Alakzat.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
    }

    public void onZoldSelected(ActionEvent actionEvent) {
        System.out.println("onZoldSelected actionEvent"+actionEvent);
        pane_Alakzat.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
    }

    public void onBlueelected(ActionEvent actionEvent) {
        System.out.println("onKekSelected actionEvent"+actionEvent);
        pane_Alakzat.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
    }
}