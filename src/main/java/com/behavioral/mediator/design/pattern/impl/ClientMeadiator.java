package com.behavioral.mediator.design.pattern.impl;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClientMeadiator extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		UIMeadiator meadiator = new UIMeadiator();
		Slider slider = new Slider(meadiator);
		TextBox textBox = new TextBox(meadiator);
		Label label = new Label(meadiator);

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setVgap(20);
		gridPane.setPadding(new Insets(25, 25, 25, 25));
		gridPane.add(label, 0, 0);
		gridPane.add(slider, 0, 1);
		gridPane.add(textBox, 0, 2);
		Scene scene = new Scene(gridPane, 500, 500);
		primaryStage.setTitle("Mediator Pattern");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
