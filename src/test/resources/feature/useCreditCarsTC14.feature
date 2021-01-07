
Feature:

  Scenario: TC14 make order using existing credit card
    When i signing to account
    Then i entered email 'evadorab@yahoo.com' in field
    And i enter password '12345ASd' and next
    And clicked enter
    Then  check toolTips
    When i see for teacher code is present
    And Go to 'Enter Orders'
    Then Select 'Student Flyer Orders'
    When student name 'Harry'
    And item number '4S5'
    Then i click ADD button
    And add quantity of '1'
    When student name 'Harry'
    And item number '8S4'
    Then i click ADD button
    And add quantity of '1'
    When student name 'John'
    And item number '17S4'
    Then i click ADD button
    And add quantity of '2'
    When student name 'Michael'
    And item number '39S4'
    Then i click ADD button
    And add quantity of '4'
    When student name 'Michael'
    And item number '4S5'
    Then i click ADD button
    And add quantity of '2'
    Then i verify entry name 'Harry, Michael, John' is same
    Then verify entry items '4S5, 8S4, 17S4, 39S4, 4S5' are the same
    And click Review card button
    When i enter TeachOrder '4S5'
    Then i click ADD button
    And add quantity books '2' and click proceed to checkOut
    Then calculate the books quantity
    Then verify the total matches SFO and YTO number of books
    Then i verify total amount pay is the same
    And i proceed to check out
    Then click continue to checkout
    And i scroll down
    Then i select payment method with existing credit card
    And proceed with checkout
    Then i verify Thank You Msg is present
    And reference number is shown
