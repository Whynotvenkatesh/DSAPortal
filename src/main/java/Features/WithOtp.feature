Feature: Login with Valid Credentials

  Scenario: Successful Login with Valid Credentials
    Given the user navigates to login page
    When user enters email as "vaibhav.kohli@creditsaison-in.com"
    Then user click_Send_Button
    Then user_click_EnterOtp_Button
    Then the user clicks on the Login button
    Then the user clicks on the Choose_dropdown
    Then the user clicks on the LoanAgainstProperty_button
    Then the user clicks on the AddApplication_btn
    Then the user clicks on partnerdropdown
    Then the user clicks on PartnerList
    Then the user clicks on the SchemeDrpDwn
    Then the user click on the SchemeList
