#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@featureTest
Feature: Uso de cucumber en el que se va a probar el funcionamiento 
de una red social.

@Scenario1
Scenario: Login correcto de un usuario
Given Un usuario y password 
When usuario correcto y password correcta
Then se loguea

@Scenario2
Scenario: Login incorrecto de un usuario
Given Un usuario y password
When Usuario incorrecto y una password incorrecta
Then no se loguea

@Scenario5
Scenario: Logout de un usuario
Given un usuario
When se hace logout
Then se sale