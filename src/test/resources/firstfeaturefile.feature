
@google_search
Feature: Google_Search_Functionality

  Scenario: TC01_iPhone_search

    Given kullanici google sayfasindadir
    And kullanici iPhone arar
    Then kullanici sonuclarda IPhone oldugunu verify et
    Then kullanici application kapatir

  Scenario: TC02_caydanlik_search

    Given kullanici google sayfasindadir
    And kullanici caydanlik arar
    Then kullanici sonuclarda caydanlik oldugunu verify et
    Then kullanici application kapatir

  Scenario: TC02_cicek_search
    Given kullanici google sayfasindadir
    And kullanici cicek'i arar
    Then kullanici sonuclarda cicek oldugunu verify eder
    Then kullanici application kapatir