Feature: Failed password verification

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario: Add Ess user

    And Click on the element in Dialog
      | statusSelect       |
      | selectStatusEnable |
      | userRoleSelect     |
      | selectRoleESS      |

    And User sending the keys in Dialog Content

      | userName        | Adalwin        |
      | password        | Aa234567.      |
      | confirmPassword | Aa234567x      |

    Then Verify error message for confirm password


  Scenario: Verify error message

    And User sending the keys in Dialog Content

      | password        | AA234567. |
      | confirmPassword | AA234567. |

    Then Verify error message for password characters


