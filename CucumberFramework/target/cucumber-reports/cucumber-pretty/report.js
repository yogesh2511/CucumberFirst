$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In",
  "description": "As an employee of the company\nI want to login to application with my credentails\nIn order to use the application features.",
  "id": "sign-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 6625673800,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "User navigates to Applicaton URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Login pahe URL \"http://192.168.43.16:2511/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should see Log In Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://192.168.43.16:2511/",
      "offset": 28
    }
  ],
  "location": "loginStepDefination.i_am_on_the_Login_pahe_URL(String)"
});
formatter.result({
  "duration": 1634516300,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.i_should_see_Log_In_Page()"
});
formatter.result({
  "duration": 20338800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Sign In with valid credential",
  "description": "",
  "id": "sign-in;sign-in-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I enter username as \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter password as \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "loginStepDefination.i_enter_username_as(String)"
});
formatter.result({
  "duration": 112139100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    }
  ],
  "location": "loginStepDefination.i_enter_password_as(String)"
});
formatter.result({
  "duration": 116000600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.click_on_login_button()"
});
formatter.result({
  "duration": 6418499000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1852357800,
  "status": "passed"
});
});