$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/valuesbalance.feature");
formatter.feature({
  "name": "Count of Values and Total Balance",
  "description": "  For verifying the values count, currency and total balance",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifications of Values and Balance from UI Page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I navigate to the url \"https://www.google.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "test.mm.stepdefs.GivenThenStatements.driverInitAndNav(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify whether right count of values appear on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "test.mm.stepdefs.GivenThenStatements.verifyRightCountOfValuesFromUI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify values from the page are greaterthan zero",
  "keyword": "Then "
});
formatter.match({
  "location": "test.mm.stepdefs.GivenThenStatements.valuesFromUIGreaterThanZero()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if the values are formatted as currencies",
  "keyword": "Then "
});
formatter.match({
  "location": "test.mm.stepdefs.GivenThenStatements.valuesFromUIFormattedAsCurrencies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if the total balance is equal to sum of all the values",
  "keyword": "Then "
});
formatter.match({
  "location": "test.mm.stepdefs.GivenThenStatements.verifyTotalBalanceIsSumOfValues()"
});
formatter.result({
  "status": "passed"
});
});