Feature: Admin user should be able to add, delete, edit, search customer information

  Background:
    Given user already on the login page
    When user enter valid username password to click on login button
    Then user should be able to login successfully

  @AddCustomer
  Scenario: User should be able to add customer
    Given user already on the DashBoard Page
    When user click on Customers Link
    And user click on Add Customer button to fill out all necessary information
    Then new customer should be added

  @EditCustomer
  Scenario: User should be able to edit existing customer information
    Given user already on the DashBoard Page
    When user click on Customers Link
    And user click on edit icon to edit customer information
    Then  customer information updated successfully

  @DeleteCustomer
  Scenario: User should be able to delete customer
    Given user already on the DashBoard Page
    When user click on Customers Link
    And user click on delete icon to submit delete
    Then customer should be deleted successfully