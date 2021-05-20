Feature: Multiplicando complejo
  quiero Multiplicar numeros complejos
  Scenario Outline: Multiplicando complejos
    Given quiero una multiplicar de complejos
    When los numeros son <arg1> + <arg2>i por <arg3> + <arg4>i
    Then resultado <res1> + <res2>i
    Examples:
      | arg1 | arg2 | arg3 | arg4 | res1 | res2 |
      |   6  |  5   |   7  |  1   |  37  |  41  |