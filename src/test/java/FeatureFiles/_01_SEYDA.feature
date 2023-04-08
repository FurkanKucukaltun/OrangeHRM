Feature: Successfully creating new ESS user

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
      | confirmPassword | Aa234567. |

    And User sending the keys in Employee Name
      | employeeName | A |

    And Click on the element in select Employee Name
      | employeeNameList |


    And Select on the element in Dialog
      | userRoleSelect | ESS     |
      | statusSelect   | Enabled |

    And Click on the element in Dialog
      | saveBtn |

  Scenario: Verifying admin name in Employee Field

    And User sending the keys in Dialog Content
      | employeeName | seyda |

    Then Verify contains text
      | employeeNameList | No Records Found |

    Then Verify contains text
      | invalidMsg | invalid |