@Homepage
Feature: Home Page
  Scenario: Add to do lists
    Given User launch the aut
    When Create To-Do with title and description
    Then Complete/Check To-Do with title “effort” and “Pray”
    Then Uncheck To-Do “effort”
    Then Filter To-Do for “Active” only and verify it
    Then Filter To-Do for “Complete” only and verify it


