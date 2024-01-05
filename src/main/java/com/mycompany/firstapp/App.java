package com.mycompany.firstapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;
import java.sql.Statement;
import java.sql.SQLException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
         scene.getStylesheets().add(getClass().getResource("first.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException  {
        
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
      static Connection c;
      static Statement s;
      static String req;
    public static void main(String[] args)  {
        launch();
  
     data c1= new data();
     try{
     
     c=c1.connet();
        s=c.createStatement();
     req="drop table hhh ";
     s.execute(req);
         System.out.println("ok");
         
     }
     catch(SQLException e){
      System.out.println("no");
     System.out.println(e.getMessage());
  

    
     }
    }

}