import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 * Created with IntelliJ IDEA.
 * User: dasheng
 * Date: 13-5-16
 * Time: 下午1:21
 * To change this template use File | Settings | File Templates.
 */
public class ClientTest {
    public static void main(String[] args) {
        Client client = Client.create();
        WebResource resource = client.resource("http://localhost:8080/stock/600036.SS");
        String s = resource.get(String.class);
        System.out.println(s);

    }

}
