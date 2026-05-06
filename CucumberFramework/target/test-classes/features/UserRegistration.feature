Feature: User Registration

  @Demo
  Scenario: Successful user registration
    Given client is ready to register a user
    When client submits a POST request to "/api/users" with details:
      | email    | password |
      | test@example.com | SecurePwd123 |
    Then response status code should be 201
    And new user should exist with email "test@example.com"
