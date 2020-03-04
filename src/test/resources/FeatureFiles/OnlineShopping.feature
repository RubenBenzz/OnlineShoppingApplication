@shop
Feature: Online shopping

  Scenario Outline: Send a message to customer service
    Given launch the shopping application
    And user navigates to Contact us page
    And user composes the message with <subject>,<email>,<orderID>,<message>
    When user sends the message
    Then user sees a successful message <messageSentSuccess>

    Examples: 
      | subject          | email         | orderID | message                                      | messageSentSuccess                                   |
      | Customer service | Test@test.com |     123 | I want to return my product as it is damaged | Your message has been successfully sent to our team. |

  Scenario Outline: Create an account using existing email ID
    Given launch the shopping application
    And user navigates to Sign in page
    When user enters <email> and creates account
    Then user sees account creation <error>

    Examples: 
      | email         | error                                                                                                                |
      | Test@test.com | An account using this email address has already been registered. Please enter a valid password or request a new one. |

  Scenario Outline: Add an item to the cart and remove the same
    Given launch the shopping application
    And user searches for a given <product>
    And user selects the <product>
    And user adds the product to the cart
    And user proceeds to checkout
    When user removes given <product> from the cart
    Then user sees an empty cart <message>

    Examples: 
      | product                     | message                      |
      | Faded Short Sleeve T-shirts | Your shopping cart is empty. |
