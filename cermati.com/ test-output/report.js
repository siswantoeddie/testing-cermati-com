$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./feature/register.feature");
formatter.feature({
  "line": 1,
  "name": "Register",
  "description": "",
  "id": "register",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully register the new member",
  "description": "",
  "id": "register;successfully-register-the-new-member",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Open url \"https://www.cermati.com/app/gabung\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter the required information field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Daftar button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "We can see the verification page contains \"Pilih Metode Verifikasi\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.launch_browser()"
});
formatter.result({
  "duration": 12390035800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.cermati.com/app/gabung",
      "offset": 10
    }
  ],
  "location": "testSteps.open_url(String)"
});
formatter.result({
  "duration": 4020972800,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.enter_the_required_information_field()"
});
formatter.result({
  "duration": 11747790300,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.click_on_Daftar_button()"
});
formatter.result({
  "duration": 2073843600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pilih Metode Verifikasi",
      "offset": 43
    }
  ],
  "location": "testSteps.we_can_see_the_verification_page_contains(String)"
});
formatter.result({
  "duration": 20166600,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.close_browser()"
});
formatter.result({
  "duration": 5389562400,
  "status": "passed"
});
});