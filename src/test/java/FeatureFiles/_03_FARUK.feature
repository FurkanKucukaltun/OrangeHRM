Feature: Verifying mandatory field notification messages.

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav

      | admin |

    And Click on the element in Dialog

      | addBtn |

    Scenario: Saving before entering mandatory field.

      And User sending the keys in Dialog Content

      | userName        | ofyekeler  |
      | password        | OfY.123456 |
      | confirmPassword | OfY.123456 |

      And Click on the element in Dialog

      | saveBtn |

      Then Verify red color message

    Scenario: Not get the same username

      And User sending the keys in Dialog Content

        | userName        | Admin      |
        | password        | OfY.123456 |
        | confirmPassword | OfY.123456 |

      And User sending the keys in Employee Name

        | employeeName | Admin |

      And Click on the element in select Employee Name

        | employeeNameList |

      And Select on the element in Dialog
        | userRoleSelect | Admin   |
        | statusSelect   | Enabled |

      And Click on the element in Dialog

        | saveBtn |

      Then Verify Already Exists message

    Scenario: Password should be at least 8 characters

      And User sending the keys in Dialog Content

        | userName        | ofyekeler  |
        | password        | OfY.123    |
        | confirmPassword | OfY.123    |

      And Click on the element in Dialog

        | saveBtn |

      Then Verify 8 characters message