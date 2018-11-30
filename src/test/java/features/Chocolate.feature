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
  As A good person, on Halloween night
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
   