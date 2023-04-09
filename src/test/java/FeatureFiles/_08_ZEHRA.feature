Feature: We should be able to see Add button displayed

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    Then Verify add button
