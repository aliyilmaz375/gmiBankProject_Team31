Feature:gmibank Registration


  Scenario: TC02 gmiBank registration with invalid credentials
    Given user navigate to "gmibank_url"
    And user clicks the symbol  on the top of the page
    And user clicks register
    And user enters a valid SSN number in the SSN textbox
    And user enters a valid name in the name textbox
    And user enters an invalid last name  in the last name text box
    And user enters a valid address in the address textbox
    And user enters a valid mobile phone number in the mobile phone number textbox
    And user enters a valid username in the username textbox
    And user enters a valid email address in the email address textbox
    And user enters a new password in the new password textbox
    And user enters the new password in the  password confirmation textbox
    Then user clicks  register
    And user sees the default message