package edu.masanz.controller;

import io.javalin.http.Context;
import java.util.HashMap;

public class EditorController {
    public static void iniciar( Context context) {
        HashMap<String, Object> model= new HashMap<>();
        context.render("/templates/editor.ftl");
    }
}