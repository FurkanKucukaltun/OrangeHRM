Feature: Successfully creating new ESS user

  Scenario:
    Given  I log in as an Admin

    And  Click on the element in LeftNav
      | admin |

    And Click on the element in Dialog
      | addBtn |


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






#  Step 1 – I login as an Admin
#
#  Step 2 – I navigate to Admin / User Management page.
#
#  Step 3 – I click on Add button
#
#  Step 4 – I fill up the form by entering the required info to the all input boxes
#
#  Step 5 – I click on Save button
#
#  Step 6 – I verify that ESS – user name is added on the list