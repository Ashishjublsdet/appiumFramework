Feature: Validate the test case of Login module

#  Scenario: Validate login module with correct mobile Number & Password
#    Given User open browser and then enter KareHealth URL
#    When User enter correct username
#    Then User enter correct Password
#    Then User click on Submit Button


  Scenario: Validate login module with Incorrect mobile Number & Password
    Given User open browser and then enter KareHealth URL
    When User enter Incorrect username
    Then User enter correct Password
    Then User click on Submit Button
    Then Verify the Error Message
