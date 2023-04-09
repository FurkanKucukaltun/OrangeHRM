Feature: Failed password verification

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario: Add Ess user

    And User sending the keys in Dialog Content

      | userName        | Adalwin   |
      | password        | Aa234567. |
      | confirmPassword | Aa234567x |

    And User sending the keys in Employee Name
      | employeeName | A |

    And Click on the element in select Employee Name
      | employeeNameList |


    And Select on the element in Dialog
      | userRoleSelect | ESS     |
      | statusSelect   | Enabled |

    And Click on the element in Dialog
      | saveBtn |

    Then Verify error message for confirm password


