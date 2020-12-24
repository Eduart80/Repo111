Feature:
  Scenario: TC4-User can create a new teacher account in non-taxable state using Zip Code
    When i 'create new account' account
    And i select radio button as a teacher
    And click Next
    When on the next form i select 'Ms.'
    And enter name 'Eva' in field
    And entered last name 'Dora' in field
    Then entered email 'evadora@yahoo.com' in field
    And password '12345ASd' next
    When clicked terms
    And next button
    When on next form i enter '99518' zip code, and click search
    Then entered 'Adak Schoo' on search
    And select from 'Adak School' list
    Then i verify the address is the same as '118 E INTL AIRPORT RD'
    Then i select role as Teacher (by Grade)
    And select '1st Grade' from list and enter 10 students
    And Reading Level: 'Guided Reading Level (GRL)'
    When remove adds
    And i see if teacher code is here
    When click myAccount and select 'Profile'
    Then i check the teacher code
    Then i check the Name 'Mr. Khan Fight' is correct
    Then i verify the address is 'SCHOLASTIC+BOOK+CLUBS 568 Broadway # 2 New York, NY 10012'