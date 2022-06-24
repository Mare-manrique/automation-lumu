Feature: wordcounter validation


@ScenarioOne
  Scenario Outline: Juan types a phrase to validate the number of characters and words
    Given he goes to the browser and enters the page
    When he writes the sentence <phrase> to validate the number of words and characters

  Examples:
    | phrase                                    |
    | Hola, soy Maria Angelica Espitia Manrique |
    | maria                                     |
    | borre                                     |


  @CaseOptionsScenario
  Scenario Outline: Juan validates that the button and case selection works correctly
    Given he goes to the browser and enters the page
    When he writes the sentence <phrase> to make use of the button and the option <option>

    Examples:
      | phrase                    | option    |
      | Hola soy Angelica Espitia | UPPERCASE |
      | Hola soy                  | lowercase |




