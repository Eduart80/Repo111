@regression
Feature:

  Scenario: TC5-Verify teacher can add only 3 credit cards under My Credit Cards in My Accounts
    When i signing to account
    Then i entered email 'khanfighta@yahoo.com' in field
    And i enter password '12345ASd' and next
    And clicked enter
    Then  check toolTips
    When go to myAccount and click 'Profile'
    Then i click to add a new creditCard
    And i receive popUp error 'You can only store three credit cards'
