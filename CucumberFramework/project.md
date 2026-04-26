# Structure of the project

### Project has the capability to run web and api tests

## Src/Test

- test/<artifact>/feature/<area>/.feature files are the cucumber feature files
- They connect with test/<artifact>/stepdefinition/<area>/<areaFeature>StepDefinition.java files
- These stepdefinition files then connect with StepService interface java files

- The stepService interface has 4 different implementation
  1) Web Implementation
  2) Rest Api Implementation
  3) Device Implementation
  4) Performance Implementation
- Each of these implementation will be controlled by Active profile (we will use Spring profile groups which a newer version).
- They can be executed individually or in different combinations
  - Web + Rest
  - Rest + Performance
  - Device + Rest

## Src/Main

#### Web Implementation
- StepService interface java class is implemented by web typed <areaFeature>StepServiceImplementation
- The webStepServiceImplementation connects with <areaFeature>Page class these are the page objects.
- A <areaFeature>Page class will have locators and action methods. These action methods are singular operation. Example fillUserName, clickLogin etc.
- The <areaFeature>Page class extends (inherits) AbstractPage class.
- An AbstractPage class has:
  1) Initiates config, webDriverLoader, util etc.
  2) Common locators
  3) Commonly used methods like waitForElementPresentAndClick, waitForElementClickableAndGet, gotoUrl etc.

#### Rest Api Implementation
- StepService interface java class is implemented by rest typed <areaFeature>StepServiceImplementation
- The restStepServiceImplementation connects with <entityOfAreaOfFeature>CommonRequestService class. Here entity means a transaction, account, user, package etc. on which APi puts on some action.
  1) Extends AbstractCommonRequestService
     - Has common methods to fetch values from Json e.g. cookies, headerParams, buildQueryParams.
     - May have common methods to deal with JSON creation, updates etc.
     - Initiates config, sessionProps, <area>Requests.
     - Also Initiates component/model classes which hold the object and maps/hashmaps of models
       - extends AbstractItems class which holds having common methods related models e.g. updateRequestBody.
  2) Has methods implementations perform the action via rest api call for example login, signTransaction etc.
  3) While performing actions a method can do singular/multiple rest based calls via <entity>Request class.
  4) <entity>Request class has all specific calls e.g. GET/PATCH/POST/DELETE calls with their specific parameter to intake to perform api call.
     - all <entity>Request classes extends AbstractRequests class
       - These have got default API calls which are used by <area>Request calls.
  5) It also uses Builder classes which extends AbstractBuilder classes which can return payload objects specifically for entities for api call executions. (Optional)

### Device Implementation
- Similar pattern of web implementation.

### Performance Implementation:
- We will use Gatling to execute performance tests.