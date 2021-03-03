Feature:gmiBank Registration

  @wip
  Scenario: TC01 gmiBank Registration  with valid credentials



    Given user navigate to "gmibank_url"
    And user clicks the symbol  on the top of the page
    And user clicks register
    And user enters an valid SSN number in the SSN textbox
    And user enters a valid first name in the name textbox
    And user enters a valid last name  in the last name text box
    And user enters a valid address in the address textbox
    And user enters a valid mobile phone number in the mobile phone number textbox
    And user enters a valid username in the username textbox
    And user enters a valid email address in the email address textbox
    And user enters a new password in the new password textbox
    And user enters the new password in the  password confirmation textbox
    And user clicks  register
    And user sees the success message



