module crudvendedores {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui;
	opens gui.util;
	opens model.entities;
	opens model.services;
	opens db;
	opens model.dao.impl;
	opens model.dao;
	
	
}
