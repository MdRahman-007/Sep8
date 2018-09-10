$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/DarkSky.feature");
formatter.feature({
  "line": 4,
  "name": "Verify temp timeline",
  "description": "",
  "id": "verify-temp-timeline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3017718679,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify time machine calendar",
  "description": "",
  "id": "verify-temp-timeline;verify-time-machine-calendar",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@temp-3"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I click on Time machine",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I verify date is selected to todays date",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iamOnHomePage()"
});
formatter.result({
  "duration": 270220954,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.clickOnTimeMachine()"
});
formatter.result({
  "duration": 193454659,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyTodaysDate()"
});
formatter.result({
  "duration": 53697990,
  "status": "passed"
});
formatter.after({
  "duration": 105487785,
  "status": "passed"
});
});