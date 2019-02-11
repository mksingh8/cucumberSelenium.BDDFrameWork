$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/home/manish/git/cucumberSelenium.BDDFrameWork/test.shaadi.com/src/main/java/Features/loginMapTable.feature");
formatter.feature({
  "name": "Shaadi Login Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Shaadi.com Login Test Scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepWithMapDefinition.user_already_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepWithMapDefinition.user_clicks_on_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters userName and password on signin page",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "msingh1",
        "password1"
      ]
    },
    {
      "cells": [
        "msingh2",
        "password2"
      ]
    },
    {
      "cells": [
        "msingh3",
        "password3"
      ]
    },
    {
      "cells": [
        "msingh4",
        "password4"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepWithMapDefinition.user_enter_usrName_password_on_sigin_page(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Signin button on signin page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepWithMapDefinition.user_clicks_on_Signin_button_on_signin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is moved to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepWithMapDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
});