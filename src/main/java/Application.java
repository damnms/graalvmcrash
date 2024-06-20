import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Application {

    public static void main(String args[]) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://localhost:8080"));
    }

}
