package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuBar menuPrincipal;
	
	@FXML
	private MenuItem menuItemVendedor;
	
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("teste vendedor");
	}
	@FXML
	public void onMenuItemDepartamentoAction() {
		loadView("/gui/DepartamentList.fxml");

		
	}
	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/About.fxml");
		
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

	private synchronized void  loadView(String absolutName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutName));
			VBox newVBox = loader.load();
			
			Scene scene = Main.getScene();
			VBox mainVBox = (VBox) ((ScrollPane) scene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlert("IOException", "erro ao carregar pagina", e.getMessage(), AlertType.ERROR);
			
		}
	}
}