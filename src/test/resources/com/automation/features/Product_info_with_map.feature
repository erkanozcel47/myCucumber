Feature: Product info

Scenario Outline: Product details with map and outline
	Given the user is on the home page
	When the user selects "<product>"
	Then the system should display the product information:
		|name	  |	<product>   |
		|count    |	1	        |
		|condition|	New	        |
		|size	  |	S		    |
		|price    | 	<price>		|  

	Examples:
		| price   	|product               |
		| $28.98    |Printed Summer Dress  |
		| $26.00  	|Printed Dress         |
		| $16.40  	|Printed Chiffon Dress |

Scenario Outline: verify <page> title
	When the user is on the <page>
	Then the title and url should be:
		|Title|<title>|
		|Url  |<url>  |

	Examples: 
		|page      |title           |url                                    |
		|home page | My Store       |http://automationpractice.com/index.php|
		|login page|Login - My Store|http://automationpractice.com/index.php?controller=authentication&back=my-account|
		
		
		
#in this case we create our map keys in a column and we try to change our values in every scenario
#so that in one scenario we can test more than one product so this is showing power of BDD in cucumber.