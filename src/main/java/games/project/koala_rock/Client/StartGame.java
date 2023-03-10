package games.project.koala_rock.Client;

import games.project.koala_rock.Sound.Son;
import games.project.koala_rock.View.VueDemarrage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class StartGame extends Application {

    private final VueDemarrage vueDemarrage = new VueDemarrage();

    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        vueDemarrage.screenStart();
        Son.playMusic();
    }
}
