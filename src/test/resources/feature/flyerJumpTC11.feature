@regression
Feature:

  Scenario: TC11-Verify YTO-By Flyer jumper
    When i signing to account
    Then i entered email 'khanfighu@yahoo.com' in field
    And i enter password '12345ASd' and next
    And clicked enter
    Then  check toolTips
    When at myAccount and click 'YOUR TEACHER ORDER'
    When i scroll down '1200' pixels
    And i go to By Flyer tab and click on 'PriceQTY box'
    Then a jumper box with message: 'All student paper flyer orders MUST be entered in the Student Flyer Orders tab.'
    When i enter number '5' obx
    Then i entered next number '5' box and verify message
    And i verify Teacher does NOT see any jumper