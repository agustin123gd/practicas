package mx.uv.sw80640;

import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(2020);
        get("/",(reg,res)->"hola desde spark");
        get("/hola",(reg,res)->"hola hola");
        get("/adios",(reg,res)->"adios desde spark");
    }
}
