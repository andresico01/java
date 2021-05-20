Feature: Resta complejo
  quiero restar numeros complejos
  Scenario Outline: restando complejos
    Given quiero una resta de complejos
    When los numeros son <arg1> + <arg2>i menos <arg3> + <arg4>i
    Then la respuesta esperada es <res1> + <res2>i
    Examples:
      | arg1 | arg2 | arg3 | arg4 | res1 | res2 |
      |  12  |  4   |   8  |  3   |  4   |  1   |
