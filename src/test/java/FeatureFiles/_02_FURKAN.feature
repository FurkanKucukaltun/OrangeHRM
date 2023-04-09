Feature: Successfully creating new ESS user

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario: Creating new ESS User by entering only mandatory fields

    And Click on the element in Dialog
      | statusSelect       |
      | selectStatusEnable |
      | userRoleSelect     |
      | selectRoleESS      |

    And User sending the keys in Dialog Content
      | userName        | Adalwin      |
      | password        | Aa234567.    |
      | confirmPassword | Aa234567.    |
      | employeeName    | Jasmine Morgan |

    And Click on the element in select Employee Name
      | employeeNameList | Jasmine Morgan |

    And Click on the element in Dialog
      | saveBtn |

    Then Verify contains text
      | successMsg | Success |

    Then Display required element
      | Jasmine Morgan |



  Scenario: Verifying username field notification messages

    And User sending the keys in Dialog Content

      | userName        | Adal   |

   Then Verify error message

  Scenario: Display 'Add User' heading

    Then Verify Add User heading

