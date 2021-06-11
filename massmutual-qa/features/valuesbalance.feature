Feature: Count of Values and Total Balance
  For verifying the values count, currency and total balance

  Scenario: Verifications of Values and Balance from UI Page
  Given I navigate to the url "https://www.exercise1.com/values"
    #Given I navigate to the url "https://www.exercise1.com/values"
    Then I verify whether right count of values appear on the page
    Then I verify values from the page are greaterthan zero
    Then I verify if the values are formatted as currencies
    Then I verify if the total balance is equal to sum of all the values