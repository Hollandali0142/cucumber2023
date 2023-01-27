@parameterize_google_arama

Feature: Google_Search_Functionality

  Scenario: TC01_iPhone_search
    Given kullanici google sayfasindadir
    And kullanici "IPhone" arar
    Then kullanici sonuclarda "IPhone" oldugunu verify et
    Then kullanici application kapatir

  Scenario: TC02_caydanlik_search
    Given kullanici google sayfasindadir
    And kullanici "caydanlik" arar
    Then kullanici sonuclarda "caydanlik" oldugunu verify et
    Then kullanici application kapatir

  Scenario: TC03_simit_search
    Given kullanici google sayfasindadir
    And kullanici "simit" arar
    Then kullanici sonuclarda "simit" oldugunu verify et
    Then kullanici application kapatir

  Scenario: TC04_bardak_search
    Given kullanici google sayfasindadir
    And kullanici "bardak" arar
    Then kullanici sonuclarda "bardak" oldugunu verify et
    Then kullanici application kapatir

  Scenario: TC05_tesla_search
    Given kullanici google sayfasindadir
    And kullanici "tesla" arar
    Then kullanici sonuclarda "tesla" oldugunu verify et
    Then kullanici application kapatir

  Scenario: TC06_BMW_search
    Given kullanici google sayfasindadir
    And kullanici "BMW" arar
    Then kullanici sonuclarda "BMW" oldugunu verify et
    Then kullanici application kapatir