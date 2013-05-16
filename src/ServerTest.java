import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

/**
 * Created with IntelliJ IDEA.
 * User: dasheng
 * Date: 13-5-16
 * Time: 下午1:28
 * To change this template use File | Settings | File Templates.
 */
public class ServerTest {
    public  static void main(String [] args) throws Exception{
        HttpServer hs = HttpServerFactory.create("http://127.0.0.1:8080/");
        hs.start();
    }
}
