Feature: Verify DSA Login with OTP
  Scenario: Successful Login with Valid Emailid
    Given the user navigates to loginhomepage
    When user enter email as "vaibhav.kohli@creditsaison-in.com"
    And user enters the OTP
    Then user clicks on the Verify button


