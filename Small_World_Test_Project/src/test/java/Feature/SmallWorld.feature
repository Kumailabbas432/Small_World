Feature: small_world_test


  Scenario: Login_Page_Valid_Credentials
    Given launch_chrome
    When user_lands_sauce_demo_page
    Then verify_page
    And login with "standard_user" and "secret_sauce"
    Then verify_user_logged_in
    And close_browser

  Scenario: Login_With_Invalid_Credential
    Given launch_chrome
    When user_lands_sauce_demo_page
    Then verify_page
    And try_login_with_invalid_credential "asd" and "asd"
    Then verify_user_should_not_logged_in
    And close_browser


  Scenario: Logout
    Given launch_chrome
    When user_lands_sauce_demo_page
    Then verify_page
    And login with "standard_user" and "secret_sauce"
    Then verify_user_logged_in
    And logout_user
    Then verify_user_logged_out
    And close_browser