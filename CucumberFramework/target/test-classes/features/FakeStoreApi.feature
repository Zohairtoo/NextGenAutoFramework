Feature: Fake Store API play

  @DemoAPITest @FakeStoreAPI
  Scenario: Navigate to fakeStoreApi and create a user
    Given client navigates to fakeStoreApi
    When client creates a new user
    | email    | password |
    | test@example.com | SecurePwd123 |
    Then client is successfully added

  @DemoAPITest @FakeStoreAPI
  Scenario: Navigate to fakeStoreApi and create a new product
    Given client navigates to fakeStoreApi
    When client logs in with user_pass
    And client creates a new product
    Then product is successfully added