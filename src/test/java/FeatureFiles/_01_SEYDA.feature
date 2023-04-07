Feature: Successfully creating new ESS user

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario:

    And User sending the keys in Employee Name
      | employeeName    | O |

    And User sending the keys in Dialog Content

      | userName        | Adalwin      |
      | password        | Aa234567.     |
      | confirmPassword | Aa234567.     |


    And Click on the element in Dialog

      | employeeName2 |

    And Select on the element in Dialog
      | userRoleSelect | ESS     |
      | statusSelect   | Enabled |

    And Click on the element in Dialog
      | saveBtn |