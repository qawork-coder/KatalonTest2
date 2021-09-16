Feature: To test Google for multiple set of Data

  Scenario Outline: Enter Multiple Values
    Given Google Page shoudl be launched
    When Search field is visible
    Then Enter Text <value>

    Examples: 
      | value   |
      | tj      |
      | Katalon |

   
