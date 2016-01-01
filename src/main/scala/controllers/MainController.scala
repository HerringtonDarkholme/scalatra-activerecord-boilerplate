package controllers

import org.scalatra.ScalatraServlet

class MainController extends ScalatraServlet with ApplicationController {
  get("/") {
    contentType = "text/html"
    layoutTemplate("/WEB-INF/views/index.jade",
      "title" -> "Index page", "message" -> "Hello, Scala ActiveRecord")
  }
}

