Feature:

  Scenario: TC6-Verify teacher gets error for invalid item number in SFO (Student Flyer Order)
    When i signing to account
    Then i entered email 'khanfighu@yahoo.com' in field
    And i password '12345ASd' next
    And clicked enter
    Then  check toolTips
    When i see for teacher code is present
    And Go to 'Enter Orders'
    Then Select 'Student Flyer Orders'
    When i enter student name 'Harry'
    And item number '111'
    Then i click ADD button
    And i got error msg: 'Please enter a valid item number.'