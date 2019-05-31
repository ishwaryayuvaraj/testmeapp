Feature: Login for pom framework
Scenario: Login
Given Login
When enter username
When enter password
When click login
Then close the application