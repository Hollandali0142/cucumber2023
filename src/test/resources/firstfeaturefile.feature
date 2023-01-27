
@google_search

Feature: Google_Search_Functionality

  Background: aplication_sayfasina_git
    Given kullanici google sayfasindadir

    @smoker @tesla
  Scenario: TC01_iPhone_search

    And kullanici iPhone arar
    Then kullanici sonuclarda IPhone oldugunu verify et
    Then kullanici application kapatir

      @regressions @caydanlik
  Scenario: TC02_caydanlik_search

    And kullanici caydanlik arar
    Then kullanici sonuclarda caydanlik oldugunu verify et
    Then kullanici application kapatir

    @smoke @bmw @tesla
  Scenario: TC03_cicek_search

    And kullanici cicek'i arar
    Then kullanici sonuclarda cicek oldugunu verify eder
    Then kullanici application kapatir

        @Kahve @smoke
  Scenario: TC04_volkswagen_search

    And kullanici volkswagen'i arar
    Then kullanici sonuclarda volkswagen oldugunu verify eder
    Then kullanici application kapatir