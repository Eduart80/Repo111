
Feature:

  Scenario:TC13 Verify non-zero tax is present for SFO-YTO orders in the checkout for teacher with tax state school
    When i signing to account
    Then i entered email 'khanfighu@yahoo.com' in field
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
    Then calculate the books quantity
    Then verify the total matches the number of books
    Then i verify total amount pay is the same like SFO
    Then and verify total quantity of student entered is the same in SFO
    When i enter TeachOrder '4S5'
    Then i click ADD button
    And add quantity books '1' and click proceed to checkOut
    And i proceed to check out
    Then verify tax is not zero $.
