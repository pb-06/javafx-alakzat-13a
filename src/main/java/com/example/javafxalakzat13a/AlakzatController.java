package com.example.javafxalakzat13a;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;

public class AlakzatController {
    @FXML public ListView<String> listview_Listview;
    @FXML public ImageView imageview_Alakzat;
    @FXML public Pane pane_Alakzat;
    @FXML public RadioButton piros, zold, kek, negyzet, kor, haromszog;

    public void onPirosSelected(ActionEvent actionEvent) {
        //System.out.println("onPirosSelected actionEvent"+actionEvent);
        pane_Alakzat.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
    }

    public void onZoldSelected(ActionEvent actionEvent) {
        pane_Alakzat.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));
    }

    public void onKekSelected(ActionEvent actionEvent) {
        pane_Alakzat.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
    }

    public void onNegyzetSelected(ActionEvent actionEvent) throws FileNotFoundException {
        imageview_Alakzat.setImage(new Image("file:icons/negyzet.png"));
    }

    public void onKorSelected(ActionEvent actionEvent) throws FileNotFoundException {
        imageview_Alakzat.setImage(new Image("file:icons/kor.png"));
    }

    public void onHaromszogSelected(ActionEvent actionEvent) throws FileNotFoundException {
        imageview_Alakzat.setImage(new Image("file:icons/haromszog.png"));
    }

    public void onHozzaadClick(ActionEvent actionEvent) {
        ObservableList<String> listviewLines = listview_Listview.getItems();

        String newline = "";

        if (piros.isSelected()) {
            newline += "Piros, ";
        }
        if (zold.isSelected()) {
            newline += "Zöld, ";
        }
        if (kek.isSelected()) {
            newline += "Kék, ";
        }

        if (negyzet.isSelected()) {
            newline += "Négyzet";
        }
        if (kor.isSelected()) {
            newline += "Kör";
        }
        if (haromszog.isSelected()) {
            newline += "Háromszög";
        }

        //listviewLines.add("Piros, Kör");

        // TODO
        if (!newline.isEmpty()) {
            listviewLines.add(newline);
        }

        listview_Listview.setItems(listviewLines);
        listview_Listview.getSelectionModel().selectLast();
    }


}