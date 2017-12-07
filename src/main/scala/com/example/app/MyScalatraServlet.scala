package com.example.app

import org.scalatra._
import java.sql.{DriverManager, Connection, Statement, ResultSet,SQLException}

class MyScalatraServlet extends ScalatraServlet {

  get("/twitter/") {
    views.html.hello()
  }

}
