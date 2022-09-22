@AddMultipleProducts
Feature: Related Products Features

  Background:
    Given user already on the login page
    When user enter valid username password to click on login button
    Then user should be able to login successfully

  Scenario Outline: user should be able to add products
    Given Admin user already on the DashBoard Page
    When user click on products link
    And user click on add product link to fill out "<productName>" "<productCode>" and other related information
    Then product should be added successfully

    Examples:
      |productName|productCode|
      |Books|AA267|
      |Shoes|VV_765|
      |Phone|YU876|