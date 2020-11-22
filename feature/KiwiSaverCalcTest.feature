#Author: anthony0lai@gmail.com
#Keywords Summary : 
#Feature: Westpac Kiwisaver Calculator test

@KiwiSaverCalcTest
Feature: KiwiSaver Calculator test

	Background: Browse to KiwiSaver Calculator page  
		Given I browse to KiwiSaver Calculator page
		
	@Major
	Scenario: Proper message box should be displayed for Current Age field
		When I click infomation icon for CurrentAge field
		Then Message is displayed for CurrentAge field
		And Message is displayed below input box for CurrentAge field
		#And Message displayed for CurrentAge field is "This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver."
		
	@Major
	Scenario Outline: Projected balance can be calculated using different user inputs
		When User inputs Current Age <CurrentAge>
		And User inputs employment status <EmploymentStatus>
		And User inputs Salary/Wage per year <AnnualSalary>
		And User inputs contirbution rate <ContributionRate>
		And User inputs Current KiwiSaverBalance <CurrentKiwiSaverBalance>
		And User inputs voluntary contribution <VoluntaryContribution> with frequency <VoluntaryContributeFreq>
		And User inputs Risk Profile <RiskProfile>
		And User inputs Saving goal per year <AnnualSavingGoal> 
		Then KiwiSaver projection result is available
	Examples:
		|CurrentAge|EmploymentStatus|AnnualSalary|ContributionRate|CurrentKiwiSaverBalance|VoluntaryContribution|VoluntaryContributeFreq|RiskProfile   |AnnualSavingGoal|
		| 30       | Employed       | 82000      | 4%             |                       |                     |                       | Defensive    |                |
		| 45       | Self-employed  |            |                | 100000                | 90                  | Fortnightly           | Conservative | 290000         |
		| 55       | Not employed   |            |                | 140000                | 10                  | Annually              | Balanced     | 200000         |