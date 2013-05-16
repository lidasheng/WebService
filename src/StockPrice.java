import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: dasheng
 * Date: 13-5-16
 * Time: 下午1:09
 * To change this template use File | Settings | File Templates.
 */
@Path ("/stock/{stockId}")
public class StockPrice {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getStockPrice(@PathParam("stockId") String stockId) {
        try {

            URL url = new URL("http://download.finance.yahoo.com/d/quotes.csv?s=600036.SS&f=nab");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            return br.readLine();

        }   catch (Exception e) {
            e.printStackTrace();
        }
       return stockId;
    }

}
