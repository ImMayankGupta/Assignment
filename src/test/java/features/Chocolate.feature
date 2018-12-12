#
# A basket contains 300 chocolate bars. On Halloween night, 
# 50 chocolate bars were given out as treats; friends at home ate 72 bars from the basket, 
# 25 bars were shared with co-workers on the following day, and the rest were kept in storage.
#
# Feature: Chocolate
#
# Created by Mayank
#

Feature: Chocolate
  As A good citizen, on Halloween night
  I want to distribute chocolate to kids and friends
  So That I bought a basket of chocolate bar

  Scenario Outline: Find Remaining chocolate in basket
    Given A basket of <total> chocolate bar
    When I give <give> chocolate bar as a treat
    And Friends eat <eat> chocolate bar
    And I share <share> chocolate bar with co-worker
    Then I keep remaining <remaining> chocolate bar in storage

  Examples: 
    |total|give|eat|share|remaining|
    |300  |50  |72 |25   |   153 |
   
   
  Scenario: Basket is empty
    Given A basket of chocolate bar
    When The basket has 0 chocolate
    Then I give 0 chocolate bar as a treat
    And Friends eat 0 chocolate bar
    And I share 0 chocolate bar with co-worker
    And I keep remaining 0 chocolate bar in storage
    
  Scenario: All chocolate given as treat
    Given A basket of 300 chocolate bar
    When I give 300 chocolate bar as a treat
    Then Friends eat 0 chocolate bar
    And I share 0 chocolate bar with co-worker
    And I keep remaining 0 chocolate bar in storage
    
  Scenario: All chocolate eaten by friends
    Given A basket of 300 chocolate bar
    When Friends eat 300 chocolate bar
    Then I give 0 chocolate bar as a treat
    And I share 0 chocolate bar with co-worker
    And I keep remaining 0 chocolate bar in storage
    
  Scenario: All chocolate shared with co-workers
    Given A basket of 300 chocolate bar
    When I share 300 chocolate bar with co-worker
    Then I give 0 chocolate bar as a treat
    And Friends eat 0 chocolate bar
    And I keep remaining 0 chocolate bar in storage
    
  Scenario: All chocolate kept in storage
    Given A basket of 300 chocolate bar
    When I keep remaining 300 chocolate bar in storage 
    Then I give 0 chocolate bar as a treat
    And Friends eat 0 chocolate bar
    And I share 0 chocolate bar with co-worker