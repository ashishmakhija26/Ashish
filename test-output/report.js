$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Automation/FreeCrmBDDFrameWork/src/main/java/Features/deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deal data creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "FREE  deals test scenario",
  "description": "",
  "id": "deal-data-creation;free--deals-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": ": user is already login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": title at login page is Free CRM",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": ": user enter username and password",
  "rows": [
    {
      "cells": [
        "ashishmakhija26@gmail.com",
        "$$345Royal#"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": ": user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": ": user is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": ": user mouse over on Deals link",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": ": user clicks on new Deals link",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": ": user enter Deals details",
  "rows": [
    {
      "cells": [
        "Test Deal",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": ": user clicks on save button",
  "keyword": "Then "
});
formatter.match({
  "location": "DealStepDefination.User_is_already_login_page()"
});
formatter.result({
  "duration": 6647337700,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.title_at_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 96784400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 3746175500,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_click_on_login_button()"
});
formatter.result({
  "duration": 83149500,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 9983400,
  "status": "passed"
});
formatter.match({
  "location": "DealStepDefination.user_mouse_over_on_Deals_link()"
});
formatter.result({
  "duration": 93990035500,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//span[@class\u003d\u0027item-text\u0027 and text()\u003d\u0027Deals\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-5RD309O\u0027, ip: \u0027192.168.1.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinations.DealStepDefination.user_mouse_over_on_Deals_link(DealStepDefination.java:80)\r\n\tat ✽.Then : user mouse over on Deals link(E:/Automation/FreeCrmBDDFrameWork/src/main/java/Features/deals.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DealStepDefination.user_clicks_on_new_Deals_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefination.user_enter_Deals_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DealStepDefination.user_clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
});