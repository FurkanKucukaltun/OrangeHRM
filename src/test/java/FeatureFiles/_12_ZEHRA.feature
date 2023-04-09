Feature: Failed password verification for password characters

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario: Add Ess user

    And User sending the keys in Dialog Content

      | userName        | Adalwin   |
      | password        | AA234567. |
      | confirmPassword | AA234567. |

    And User sending the keys in Employee Name
      | employeeName | A |

    And Click on the element in select Employee Name
      | employeeNameList |

    And Select on the element in Dialog
      | userRoleSelect | ESS     |
      | statusSelect   | Enabled |


    Then Verify error message for password characters