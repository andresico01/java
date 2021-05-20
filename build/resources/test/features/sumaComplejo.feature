Feature: Suma Complejo
  quiero sumar numeros complejos

  Scenario Outline: sumando complejos
    Given quiero una suma de complejos
    When los numeros son <arg1> + <arg2>i mas <arg3> + <arg4>i
    Then el resultado esperado es <arg11> + <arg21>i
    Examples:
      | arg1 | arg2 | arg3 | arg4 | arg11 | arg21 |
      | 3    | 4    | 5    | 7    | 8     | 11    |