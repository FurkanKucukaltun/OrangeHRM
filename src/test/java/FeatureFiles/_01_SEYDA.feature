Feature: Successfully creating new ESS user

  Background:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |

  Scenario:

    And User sending the keys in Dialog Content
      | employeeName    | technoStd |
      | userName        | technoStd |
      | password        | 123456    |
      | confirmPassword | 123456    |

    And Select on the element in Dialog
      | userRoleSelect | ESS     |
      | statusSelect   | Enabled |

    And Click on the element in Dialog
      | saveBtn |