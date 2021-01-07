
Feature:
# just testing
  Scenario:TC16 check books from search bar
    # keyWords = 'Given', 'When', 'Then', 'And', 'But' or ( '*' - for continue steps)
    When i signing to account
    * i entered email 'evadorac@yahoo.com' in field
    * i enter password '12345ASd' and next
    Then clicked enter
    And wait for add to load and remove
    Then  check toolTips
    And i see for teacher code is present in main page
    Then i click search bar and enter 'Harry' in field