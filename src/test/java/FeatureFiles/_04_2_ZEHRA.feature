Feature: Verify Add button displayed

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

  Scenario: Verify Add button

    Then Verify add button
