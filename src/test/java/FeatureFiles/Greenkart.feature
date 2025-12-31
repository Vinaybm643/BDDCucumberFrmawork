
Feature: Search the product name and validate it

Scenario: Search the ProductName in HomePage and Validate that same name in Top details page 

Given User is on GrenKart page
When User search the productName "Tom" 
And Grab the PdoductName
Then search the same ProductName "Tom" in Top details page 
And Validate ProductName