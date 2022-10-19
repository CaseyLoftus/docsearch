import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testFunctionality(){
        Handler h = new Handler();
        URI rootPath = new URI("http://localhost/");
        assertEquals(h.handleRequest(rootPath), "Don't know how to handle that path!");
    }
}