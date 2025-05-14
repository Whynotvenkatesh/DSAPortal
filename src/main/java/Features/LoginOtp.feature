Feature : Verify DSA Login with OTP

  Scenario: Scenario: Successful Login with Valid Emailid
    Given the user navigates to login page
    When user enters email as "vaibhav.kohli@creditsaison-in.com"
    And the user clicks on the SendOtp button
    And user clicks on the InputOtp button
    Then use click the Verify Button