Feature: Product info

@temp
Scenario Outline: Product details with map n outline
	Given the user is on the page
	When the user selects "<product>"
	Then the system should velidate the product information
     	|name	  |	<product>   |
		|count    |	1	        |
		|condition|	New	        |
		|size	  |	S		    |
		|price    | <price>	    |
	
Examples:
		| price   	|product                        |
		| $16.51    |Faded Short Sleeve T-shirts    |
		| $27.00 	|Blouse                         |
		| $26.00  	|Printed Dress                  |  
		| $28.98  	|Printed Summer Dress           |
		| $16.40    |Printed Chiffon Dress          |
	 