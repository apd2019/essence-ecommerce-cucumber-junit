Feature: Add to Cart and Checkout

  Scenario: User adds item to cart and completes checkout
    
    Given the user opens the e-commerce application
    When the user clicks on the Add to Cart button
    Then the item should be added to the cart
    When the user clicks on the Checkout button
    Then the user is navigated to the Billing Address page
    When the user enters billing details
    And the user clicks on Place Order
    Then the order should be placed successfully