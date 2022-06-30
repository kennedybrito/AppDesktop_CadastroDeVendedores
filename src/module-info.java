module crudvendedores {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui;
	opens gui.util;
	opens model.entities;
	opens model.services;
	
}
