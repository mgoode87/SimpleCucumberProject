Feature: Simple Cucumber Project

  Scenario: Challenging Doms
    Given I am on the Challenging Dom test page
    When I see the table contains "Definiebas4"
    #Then I see the answer box contains a number
    #Then I see the blue button contains text
    Then I click the blue button
    #Then I see the blue button contains text
    #Then I see the answer box contains an updated number

  Scenario: Dynamic Loading
    Given I am on the Dynamic Loading test page
    When I click the start button
    Then I see a loading bar appear
    Then I wait and see "Hello, World!" appear

  Scenario: CheckBoxes
    Given I am on the Checkboxes test page
    When I see checkboxTwo is checked
    Then I click checkboxOne
    Then I see checkboxOne is checked
    Then I click checkboxTwo
    Then I see checkboxTwo is unchecked

  Scenario: Form Auth
    Given I am on the Login test page
    When I enter an invalid Username
    When I enter an invalid Password
    When I click the Login button
    Then I see an error message appear
