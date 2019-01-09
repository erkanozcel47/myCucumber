Feature: home page search functionality

Scenario: Verify search term
    Given the user is on the homepage
    When the user enters  search term
    Then the search box must contain the search term
    
    
    @temp
    Scenario: Verify the login 
    Given the user on the login page
    When the user enters the first name and last name
    Then click the submit button
    