Feature: Verifying the items checkout and searching


  #TestCase-01
  @test
  Scenario: Verify that the item is added to basket and after checking out submitted to new address successfully
    Given owasp home page is displayed
    Then Check that Account option available
    When Click on the Account option
    And Click on the login option
    And enter username and password
    And Click on the Log in button
    And Add to basket for 1 item
    Then Check that the 1 item is added notification is displayed
    When Click on your basket
    Then check that 1 item is added
    When Click on the Checkout button
    Then Check that add new address is displayed
    When Click on the Add new address
    Then Check that the add new address form is displayed
    When Fill the address form
    And Click on the submit button

    #TestCase-02
    @test
    Scenario: Verify that the searching product is displayed properly
    Given owasp home page is displayed
    Then Check that Account option available
    When Click on the Account option
    And Click on the login option
    And enter username and password
    And Click on the Log in button
    Then Check that search button is displayed
    When Click on the Search Button
    When search for apple
    Then Check that 2 apple product is displayed and banana isn't displayed








