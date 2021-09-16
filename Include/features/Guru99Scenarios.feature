Feature: To test Guru99 BankingPage

@Regression
Scenario: Test Valid Login
Given User is on the Banking Page
When User enters username mngr353236
And User enters password dYgEtaz
Then Click on Login button 

@Sanity
Scenario: Test Valid Login
Given User is on the Banking Page
When User enters username mngr353236fdfd
And User enters password dYgEtazfdf
Then Click on Login button 