package org.cjpostma.shop;

import static spark.Spark.get;
import static spark.Spark.port;
public class WebShopApi {

    public static void main(String... args){

        port(80);
        get("/hello", (req, res) -> "Hello World");
    }
}
