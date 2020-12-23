Feature:
  @smoke
  Scenario: TC6-Verify teacher gets error for invalid item number in SFO (Student Flyer Order)
    When i signing to account
    Then i entered email 'khanfighu@yahoo.com' in field
    And i password '12345ASd' next
    And clicked enter
    And Go to 'Your Teacher Order'