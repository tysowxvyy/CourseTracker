package org.example;
import com.google.gson.Gson;

import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import static spark.Spark.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        List<Assignment> assignments = new ArrayList<>();

        //Convert JSON string to Assignment
        post("/assignments", (request, response) -> {
            Assignment newAssignemnt = gson.fromJson(request.body(), Assignment.class);

            //Add it to the list
            assignments.add(newAssignemnt);
            response.status(201);
            return gson.toJson(newAssignemnt);
        });
        put("/assignments/:index", (request, response) -> {
            int index = Integer.parseInt(request.params(":index"));
            if (index >= 0 && index < assignments.size()) {
                Assignment a = assignments.get(index);
                a.setCompleted(true);
                response.type("application/json");
                return gson.toJson(a);
            }else {
                response.status(404);
                return "Assignment not found";
            }
        });
        delete("/assignments/:index", (request, response) -> {
            int index = Integer.parseInt(request.params(":index"));
            if (index >= 0 && index < assignments.size()) {
                assignments.remove(index);
                response.status(200);
                return "Deleted assignment at index " + index;
            }
            else {
                response.status(404);
                return "Assignment not found";
            }
        });
        get("/assignemnts", (request, response) -> {
            response.type("application/json");
            return gson.toJson(assignments);
        });
    }
}
