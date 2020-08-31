#language:en
@SelectAddressArndRegisterIt
Feature: Insert an address to see products
  I want to register my address and see products list

  @age18
  Scenario: Customer is over 18 and wants to register address
    Given customer is on ZeDelivery page
    When  customer is 18 years old
    And customer can set his address as "Hermantino Coelho"
    And type the address number as "743"
    And does not have a complement
    Then customer can see his address registered as "Hermantino Coelho"


  @minor
  Scenario: Customer is a minor and needs to see a minor warning message
    Given customer is on ZeDelivery page
    When customer is 16 years old
    Then customer reads a warning message

