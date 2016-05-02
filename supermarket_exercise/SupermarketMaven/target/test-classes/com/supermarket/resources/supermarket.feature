Feature: Various number of items and offers


Scenario Outline: 'X' Items each for A, B, C, D with 2 offers
  Given there are <items> of "A" that costs "2.00"
  And there are <items> of "B" that costs "1.50"
  And there are <items> of "C" that costs "1.25"
  And there are <items> of "D" that costs "1.00"

  And there is an offer for "A" for 2 units the cost is "3.00"
  And there is an offer for "B" for 3 units the cost is "3.50"
  Then the total should come up to "<expected_total>"

  Examples:
    | items | expected_total |
    | 3     | 15.25          |
    | 5     | 25.75          |
    | 10    | 49.50          |
