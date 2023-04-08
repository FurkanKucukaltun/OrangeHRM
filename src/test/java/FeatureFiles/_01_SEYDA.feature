Feature: Successfully creating new ESS user

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario: Add Ess user
    And Click on the status element in select
      | statusSelect |

    And Click on the user role element in select
      | userRoleSelect |

#    And User sending the keys in Dialog Content
#      | userName        | Adalwin      |
#      | password        | Aa234567.    |
#      | confirmPassword | Aa234567.    |
#      | employeeName    | Odis Adalwin |
#
#    And Click on the element in select Employee Name
#      | employeeNameList | Odis Adalwin |


#    And Click on the element in Dialog
#      | saveBtn |
#
#    Then Verify contains text
#      | successMsg | success |


  Scenario: Verifying admin name in Employee Field

    And User sending the keys in Dialog Content
      | employeeName | seyda |

    Then Verify contains text
      | employeeNameList | No Records Found |

    And Click on the element in Dialog
      | userName |

    Then Verify contains text
      | invalidMsg | Invalid |

  Scenario: Display all required elements on User Management page for Admin users


    Then Verify contains text
      | saveBtn | Save   |
      | cancel  | Cancel |
      | |  |
      | |  |