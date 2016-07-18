/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectAPI;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Document;

/**
 *
 * @author Felipe
 */
public class WalmartAPI {
    public Document productLookup() {
        Document doc = null;
        try {
            String url = "http://api.walmartlabs.com/v1/items";
            String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
            String itemNumber = "12417832";
            String apiKey = "afej2pqfx7tj76gynktrmk3c";
            
            url += "/" + itemNumber + "?apiKey=" + apiKey;
            URLConnection connection = new URL(url).openConnection();
            connection.setRequestProperty("Accept-Charset", charset);
            InputStream response = connection.getInputStream();
            
            Scanner scanner = new Scanner(response);
            String responseBody = scanner.useDelimiter("\\A").next();
            System.out.println(responseBody);
            
        } catch (IOException ex) {
            Logger.getLogger(WalmartAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doc;
}
}
