
Feature: Login with Valid Credentials

  Scenario: Successful Login with Valid Credentials
    Given the user navigates to login page
    When user enters email as "anurag.anand@creditsaison-in.com" and password as "QAteam@4868"
    And the user clicks on the Login button
    Then the user should be redirected to the Home Page
    When the user selects "Loan against Property" from the dropdown list
    When the user clicks on the "Add Application" button
    Then the user should be redirected to the "Partner Details" pag
    When user click the SchemeDropdown list
    And user select the SchemeOptions item
    And user click the SubProductDropdown list
    And user select the SubProductOptions item
    And user click the BranchDropdown list
    And user select the BranchOptions item
    And user click the SalesManagerDropdown list
    And user select the SalesManagerOptions item
    And user click the NextBtn
    Then user navigates the Lead details page
    When user Enter the Name in the field
    And user enter the Phone number in the field
    And user enter the Loan Amount in the field
    And user enter the tenure in the field
    And user enter the interest in the field
    And user click the EmployeTypeDropdown
    And user Select the SalariedItem
    And user click the LoanPurposeDropdown
    And user select the LoanPurposeItem
    And user click on CeateLeadBtn
    And user click on LeadBtn











