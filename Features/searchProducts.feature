Feature: searching products 

Scenario Outline: searching products on google 

Given i am on the google homepage 


When i enter the "<Product_name>" in the search bar
And  i click on the search button 



Then i can see the search results successfully




Examples: 
| Product_name | 
| Computer     | 
|  Toys        | 
| Flower       | 
