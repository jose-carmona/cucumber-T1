Feature: cucumber + selenium as tests framework
As a programmer
I want to use cucumber and selenium as a tests framework
To improve the quality of my programs

  Scenario: search "cucumber + selenium" on Google 
    Given I am on Google search page
    When I enter "cucumber + selenium" as search phrase
    And I click on search button
    Then results are shown
