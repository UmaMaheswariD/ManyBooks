$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Verify Flipkart Login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch the Flipkart Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.launchFlipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check successful login on Flipkart website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User login with Registered credentials",
  "keyword": "When "
});
formatter.match({
  "location": "Login.login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyLogin()"
});
formatter.result({
  "status": "passed"
});
});