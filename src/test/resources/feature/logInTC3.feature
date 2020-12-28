@regression
  Feature: login

    Scenario:TC3-Teacher can add books in Recommendations List from Quick View
    When i signing to account
    Then i entered email 'khanfighu@yahoo.com' in field
    And i password '12345ASd' next
    And clicked enter
    When in search i enter for 'Harry'
    And click on Book 'Quick View'
    Then make recommendation
    And select 'Recommendations for Students'
    When Verify the item is added to my Lists
