package org.example;
import static spark.Spark.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello world!");
    }
}