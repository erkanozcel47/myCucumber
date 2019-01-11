Feature: Products
 
Scenario Outline: blank email 
	Given the user is on the  "<product>"
	When the user tries to register "<product>"
	Then the system should display message "<product>" 

	Examples:
	|product            | 
	| asdfhgjhkjgfds    |
	| adsfghjgfdsasdfggh|