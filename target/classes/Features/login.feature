Feature: Free CRM Login Feature
 
 Scenario Outline: Free CRM login test scenario
 # Without Example Keyword 
# Given : user is already login page
# Then : title at login page is Free CRM
# Then : user enter "ashishmakhija26@gmail.com" and "maths95makhija"
# Then : user click on login button 
# Then : user is on Home Page
# 
 
 # With Example Keyword 
 Given : user is already login page
 Then : title at login page is Free CRM
 Then : user enter "<username>" and "<password>"
 Then : user click on login button 
 Then : user is on Home Page
 
 Examples:
 
 | username | password|
 | ashishmakhija26@gmail.com | $$345Royal# |
 | naveenk | naveen |
 
 
# Scenario: user is able to create a new contact
#
# Given : user is already home page
# Then : user mouse over on contacts link
# Then : user clicks on new Contact link
# Then : user enter firstname and lastname
# Then : user clicks on save button
# 