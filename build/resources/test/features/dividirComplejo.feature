Feature: Divicion complejo
  quiero dividir numeros complejos
  Scenario Outline: Divicion complejos
    Given quiero una divicion de complejos
    When los numeros son <arg1> + <arg2>i dividido entre <arg3> + <arg4>i
    Then resultado de la divicion 0,94f + 0,58fi
    Examples:
      | arg1 | arg2 | arg3 | arg4 |
      |   6  |  5   |   7  |  1   |