package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class ApiDocController extends Controller {

    @Inject
    private ApiDocController() {
    }

    public Result api() {
        return redirect("/assets/lib/swagger-ui/index.html?url=/assets/swagger.json");

    }
}
