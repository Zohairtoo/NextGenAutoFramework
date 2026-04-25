Feature: User Registration

  As a new customer
  I want to register an account
  So that I can use the application services

  Scenario: Successful user registration
    Given the client is ready to register a user
    When the client submits a POST request to "/api/users" with details:
      | email    | password |
      | test@example.com | SecurePwd123 |
    Then the response status code should be 201
    And a new user should exist with email "test@example.com"