#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
Feature: Verify user is able to login to rediffmail website
@tag1
  Scenario: Rediffmail user is able to login 
    Given Rediff User is able to navigate to total jobs login page url 
    When Rediff User enters valid email id and valid password
    And Rediff user is able to click on Sign in button
    Then Rediff user has successfully logged in to portal 

#@tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |