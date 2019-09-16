Feature: Wikipedia Test
Description: This is a feature file which tests the search functionality of Wikipedia

@MockTest
Scenario: Wikipedia Title Test
		Given user is on wikipedia.org
		Then  title wikipedia

@SmokeTest
Scenario: Wikipedia Search Test
		Given user is on the home page
		When user enters a search keyword
		And user clicks on search button
		Then it open a corresponding wiki page