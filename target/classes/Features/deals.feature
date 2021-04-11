Feature: Deal data creation

Scenario: FREE  deals test scenario  

 Given : user is already login page
 Then : title at login page is Free CRM
 Then : user enter username and password
  | ashishmakhija26@gmail.com | $$345Royal# |
 
 Then : user click on login button
 Then : user is on Home Page
 Then : user mouse over on Deals link
  Then : user clicks on new Deals link
 Then : user enter Deals details
 	| Test Deal | 1000 | 50 | 10 |
 Then : user clicks on save button
