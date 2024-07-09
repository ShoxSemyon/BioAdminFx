package home.example.bioadmin;

import home.example.bioadmin.configuration.BeenContainerApp;
import home.example.bioadmin.controllers.MainFrameController;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeenContainerApp.class);
        applicationContext.getBean(MainFrameController.class).startMainFrame(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}