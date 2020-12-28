@regression
Feature:

  Scenario: TC7-Verify teacher can add multiple books for a student in SFO
    When i signing to account
    Then i entered email 'khanfighu@yahoo.com' in field
    And i password '12345ASd' next
    And clicked enter
    Then  check toolTips
    When i see for teacher code is present
    And Go to 'Enter Orders'
    Then Select 'Student Flyer Orders'
    When i enter student name 'Harry'
    And item number '35J3'
    Then i click ADD button
    And add quantity of '2'
    When i enter student name 'Harry'
    And item number '35N3'
    Then i click ADD button
    And add second quantity of '4'
    When i enter student name 'Harry'
    And item number '16B3'
    Then i click ADD button
    And add third quantity of '1'
    Then i verify entry name 'Harry' is the same
    Then i verify entry item '35J3, 35N3, 16B3' is the same
    Then i verify entry QTY '3' is the same
    And click Review card button
    Then i verify quantity '3'
    Then i verify total amount pay is the same in SFO
    Then i verify totalbooks is '7'
