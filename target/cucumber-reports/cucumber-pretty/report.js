$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("KiwiSaverCalcTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: anthony0lai@gmail.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: Westpac Kiwisaver Calculator test"
    }
  ],
  "line": 6,
  "name": "KiwiSaver Calculator test",
  "description": "",
  "id": "kiwisaver-calculator-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 5,
      "name": "@KiwiSaverCalcTest"
    }
  ]
});
formatter.before({
  "duration": 8060804800,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "Browse to KiwiSaver Calculator page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I browse to KiwiSaver Calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "wpKiwiSaverCalcTestStepDefinition.browseKiwiSaverCalcPage()"
});
formatter.result({
  "duration": 7827701600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Proper message box should be displayed for Current Age field",
  "description": "",
  "id": "kiwisaver-calculator-test;proper-message-box-should-be-displayed-for-current-age-field",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Major"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click infomation icon for CurrentAge field",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Message is displayed for CurrentAge field",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Message is displayed below input box for CurrentAge field",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "CurrentAge",
      "offset": 28
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.clickInfoIcon(String)"
});
formatter.result({
  "duration": 468633300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CurrentAge",
      "offset": 25
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.checkMsgDisplay(String)"
});
formatter.result({
  "duration": 33623500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "below",
      "offset": 21
    },
    {
      "val": "CurrentAge",
      "offset": 41
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.checkMsgBoxPos(String,String)"
});
formatter.result({
  "duration": 39324200,
  "status": "passed"
});
formatter.after({
  "duration": 74075000,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 16,
      "value": "#And Message displayed for CurrentAge field is \"This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.\""
    }
  ],
  "line": 19,
  "name": "Projected balance can be calculated using different user inputs",
  "description": "",
  "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Major"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User inputs Current Age \u003cCurrentAge\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User inputs employment status \u003cEmploymentStatus\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User inputs Salary/Wage per year \u003cAnnualSalary\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User inputs contirbution rate \u003cContributionRate\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User inputs Current KiwiSaverBalance \u003cCurrentKiwiSaverBalance\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User inputs voluntary contribution \u003cVoluntaryContribution\u003e with frequency \u003cVoluntaryContributeFreq\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User inputs Risk Profile \u003cRiskProfile\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User inputs Saving goal per year \u003cAnnualSavingGoal\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "KiwiSaver projection result is available",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;",
  "rows": [
    {
      "cells": [
        "CurrentAge",
        "EmploymentStatus",
        "AnnualSalary",
        "ContributionRate",
        "CurrentKiwiSaverBalance",
        "VoluntaryContribution",
        "VoluntaryContributeFreq",
        "RiskProfile",
        "AnnualSavingGoal"
      ],
      "line": 30,
      "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;;1"
    },
    {
      "cells": [
        "30",
        "Employed",
        "82000",
        "4%",
        "",
        "",
        "",
        "Defensive",
        ""
      ],
      "line": 31,
      "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;;2"
    },
    {
      "cells": [
        "45",
        "Self-employed",
        "",
        "",
        "100000",
        "90",
        "Fortnightly",
        "Conservative",
        "290000"
      ],
      "line": 32,
      "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;;3"
    },
    {
      "cells": [
        "55",
        "Not employed",
        "",
        "",
        "140000",
        "10",
        "Annually",
        "Balanced",
        "200000"
      ],
      "line": 33,
      "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7019434500,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "Browse to KiwiSaver Calculator page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I browse to KiwiSaver Calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "wpKiwiSaverCalcTestStepDefinition.browseKiwiSaverCalcPage()"
});
formatter.result({
  "duration": 7559260500,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Projected balance can be calculated using different user inputs",
  "description": "",
  "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Major"
    },
    {
      "line": 5,
      "name": "@KiwiSaverCalcTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User inputs Current Age 30",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User inputs employment status Employed",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User inputs Salary/Wage per year 82000",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User inputs contirbution rate 4%",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User inputs Current KiwiSaverBalance ",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User inputs voluntary contribution  with frequency ",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User inputs Risk Profile Defensive",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User inputs Saving goal per year ",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "KiwiSaver projection result is available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 24
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputCurAge(String)"
});
formatter.result({
  "duration": 43390000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Employed",
      "offset": 30
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputEmpSatus(String)"
});
formatter.result({
  "duration": 479127900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "82000",
      "offset": 33
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputAnnualSalary(String)"
});
formatter.result({
  "duration": 85541100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4%",
      "offset": 30
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputContributionRate(String)"
});
formatter.result({
  "duration": 105200700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 37
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputCurrentBalance(String)"
});
formatter.result({
  "duration": 46600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 35
    },
    {
      "val": "",
      "offset": 51
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputVolContribution(String,String)"
});
formatter.result({
  "duration": 35400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Defensive",
      "offset": 25
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputRiskProfile(String)"
});
formatter.result({
  "duration": 46300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 33
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputSavingGoal(String)"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.match({
  "location": "wpKiwiSaverCalcTestStepDefinition.checkKiwiSaverResultReady()"
});
formatter.result({
  "duration": 24429200,
  "status": "passed"
});
formatter.after({
  "duration": 68663400,
  "status": "passed"
});
formatter.before({
  "duration": 6971258000,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "Browse to KiwiSaver Calculator page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I browse to KiwiSaver Calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "wpKiwiSaverCalcTestStepDefinition.browseKiwiSaverCalcPage()"
});
formatter.result({
  "duration": 8022755400,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Projected balance can be calculated using different user inputs",
  "description": "",
  "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Major"
    },
    {
      "line": 5,
      "name": "@KiwiSaverCalcTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User inputs Current Age 45",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User inputs employment status Self-employed",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User inputs Salary/Wage per year ",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User inputs contirbution rate ",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User inputs Current KiwiSaverBalance 100000",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User inputs voluntary contribution 90 with frequency Fortnightly",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User inputs Risk Profile Conservative",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User inputs Saving goal per year 290000",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "KiwiSaver projection result is available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "45",
      "offset": 24
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputCurAge(String)"
});
formatter.result({
  "duration": 60842500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Self-employed",
      "offset": 30
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputEmpSatus(String)"
});
formatter.result({
  "duration": 431288900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 33
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputAnnualSalary(String)"
});
formatter.result({
  "duration": 46300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputContributionRate(String)"
});
formatter.result({
  "duration": 55200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100000",
      "offset": 37
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputCurrentBalance(String)"
});
formatter.result({
  "duration": 84582600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "90",
      "offset": 35
    },
    {
      "val": "Fortnightly",
      "offset": 53
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputVolContribution(String,String)"
});
formatter.result({
  "duration": 267441400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Conservative",
      "offset": 25
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputRiskProfile(String)"
});
formatter.result({
  "duration": 149125600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "290000",
      "offset": 33
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputSavingGoal(String)"
});
formatter.result({
  "duration": 104946500,
  "status": "passed"
});
formatter.match({
  "location": "wpKiwiSaverCalcTestStepDefinition.checkKiwiSaverResultReady()"
});
formatter.result({
  "duration": 37020800,
  "status": "passed"
});
formatter.after({
  "duration": 120229000,
  "status": "passed"
});
formatter.before({
  "duration": 6846724000,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "Browse to KiwiSaver Calculator page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I browse to KiwiSaver Calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "wpKiwiSaverCalcTestStepDefinition.browseKiwiSaverCalcPage()"
});
formatter.result({
  "duration": 7400835900,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Projected balance can be calculated using different user inputs",
  "description": "",
  "id": "kiwisaver-calculator-test;projected-balance-can-be-calculated-using-different-user-inputs;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@Major"
    },
    {
      "line": 5,
      "name": "@KiwiSaverCalcTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User inputs Current Age 55",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User inputs employment status Not employed",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User inputs Salary/Wage per year ",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User inputs contirbution rate ",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User inputs Current KiwiSaverBalance 140000",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User inputs voluntary contribution 10 with frequency Annually",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User inputs Risk Profile Balanced",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User inputs Saving goal per year 200000",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "KiwiSaver projection result is available",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "55",
      "offset": 24
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputCurAge(String)"
});
formatter.result({
  "duration": 47021700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Not employed",
      "offset": 30
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputEmpSatus(String)"
});
formatter.result({
  "duration": 551315300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 33
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputAnnualSalary(String)"
});
formatter.result({
  "duration": 50700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputContributionRate(String)"
});
formatter.result({
  "duration": 40300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "140000",
      "offset": 37
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputCurrentBalance(String)"
});
formatter.result({
  "duration": 75030100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 35
    },
    {
      "val": "Annually",
      "offset": 53
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputVolContribution(String,String)"
});
formatter.result({
  "duration": 239615100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Balanced",
      "offset": 25
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputRiskProfile(String)"
});
formatter.result({
  "duration": 89079600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200000",
      "offset": 33
    }
  ],
  "location": "wpKiwiSaverCalcTestStepDefinition.inputSavingGoal(String)"
});
formatter.result({
  "duration": 106614100,
  "status": "passed"
});
formatter.match({
  "location": "wpKiwiSaverCalcTestStepDefinition.checkKiwiSaverResultReady()"
});
formatter.result({
  "duration": 42440500,
  "status": "passed"
});
formatter.after({
  "duration": 88516900,
  "status": "passed"
});
});