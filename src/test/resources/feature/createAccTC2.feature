
  Feature:

    Scenario:TC2-User can create a new teacher account in taxable state using School Search
      When i 'create new account' account
      And i select radio button as a teacher
      And click Next
      When on the next form i select 'Mr.'
      And enter name 'Emanuel' in field
      And entered last name 'Ali' in field
      Then entered email 'emanuelAli@yahoo.com' in field
      And password '12345ASd' next
      When clicked terms
      And next button
      And select
      When next form i search for 'New Y' and next
      And i enter for 'New York' in city
      Then entered 'Scholastic+Book+Club' on search
      And select 'Scholastic+Book+Clubs' from list
      Then i verify the address is the same as '568 Broadway # 2'
      Then i select role as Teacher (by Grade)
      And select '1st Grade' from list and enter 10 students
      And Reading Level: 'Guided Reading Level (GRL)'
      When remove adds
      When click myAccount and select 'Profile'
      Then i check the teacher code
      Then i check the Name 'Mr. Emanuel Ali' is correct
      Then i verify the address is 'SCHOLASTIC+BOOK+CLUBS 568 Broadway # 2 New York, NY 10012'