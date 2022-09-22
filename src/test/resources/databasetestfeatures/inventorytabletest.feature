@DataBaseVerification
Feature: user should be able to view products information in the cc_CubeCart_inventory table
  Scenario: user should be able to get product info
    Given user has access to the relational data base
    When user query the sql script in the cc_CubeCart_inventory table
    Then user should get the product related information