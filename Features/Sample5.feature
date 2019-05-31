Feature: login with mutiple set of test data
  
  Scenario Outline: Title of your scenario outline
    Given user launching testmeapp
    When user enter username as "<username>" And enter password as"<password>"
    Then click ok
    And verify login result

    Examples: 
      | username  | password | 
      | lalitha |     password123 | 
     # | ishu |     yuvi | 
