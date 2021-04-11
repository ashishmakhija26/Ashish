Feature: Free CRM create contacts

Scenario Outline:FREE  Create contacs test scenario  

 Given : user is already login page
 Then : title at login page is Free CRM
 Then : user enter "<username>" and "<password>"
 Then : user click on login button
 Then : user is on Home Page
 Then : user mouse over on contacts link
 Then : user clicks on new Contact link
 Then : user enter "<firstname>" and "<lastname>" and "<position>"
 Then : user clicks on save button
 
 Examples:
 	        |username                  | password    |  firstname  |   lastname |    position     |
 	        |ashishmakhija26@gmail.com | $$345Royal# |   Ash       |     Makhija|    Software Eng.|
 	        |ashishmakhija26@gmail.com | $$345Royal# |   Jatin     |    Keshwani|    Software Eng.|