package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class SidebarController implements Initializable {

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnMobil;

    @FXML
    private Button btnLogout;

    @FXML
    private Pane pnlDashboard;

    @FXML
    private AnchorPane pnlChange;

    @FXML
    private AnchorPane pnlMain;

    public void initialize(URL location, ResourceBundle resources) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/Dashboard.fxml"));
            Parent root = loader.load();

            pnlChange.getChildren().setAll(root);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnMobil) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/ListMobil.fxml"));
                Parent root = loader.load();

                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        } else if (event.getSource() == btnDashboard) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/Dashboard.fxml"));
                Parent root = loader.load();
                pnlChange.getChildren().setAll(root);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        } else if (event.getSource() == btnLogout) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/Login.fxml"));
                Parent root = loader.load();
                pnlMain.getChildren().setAll(root);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
