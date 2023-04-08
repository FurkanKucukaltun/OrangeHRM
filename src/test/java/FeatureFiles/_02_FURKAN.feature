Feature: Successfully creating new ESS user

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario: Verifying username field notification messages

    And User sending the keys in Dialog Content

      | userName        | Adal   |

   Then Verify error message


  Scenario: Display 'Add User' heading

    Then Verify Add User heading

