Feature: Enter Details

  Scenario: Using a List
    Given Launch the Website1
    When Enter the input details using Map
      | firstname | tj         |
      | lastname  | tj         |
      | email     | tj@tj,com  |
      | phone     | 9898989765 |
      | Gender    | Male       |
      | Course    | Selenium   |
    Then Click on submit button1
