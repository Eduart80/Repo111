
  Feature: login
  @smoke
    Scenario:
    When i signing to account
    Then i entered email 'khanfighu@yahoo.com' in field
    And i password '12345ASd' next
    And clicked enter
    When click myAccount and select 'Profile'
    Then i check the teacher code
    Then i check the Name 'Mr. Khan Fight' is correct
    Then i verify the address is 'SCHOLASTIC+BOOK+CLUBS 568 Broadway # 2 New York, NY 10012'
