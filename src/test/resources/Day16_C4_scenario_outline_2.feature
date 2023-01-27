
@Scenario_outline_2_google_arama

Feature: Google_Arama_Fonksiyonu
  Scenario Outline:
    Given kullanici google sayfasindadir
    And kullanici "<baskent>" arar
    Then kullanici sonuclarda "<baskent>" oldugunu verify et
    Then kullanici application kapatir

    Examples:
      | baskent |
      | London  |
      | Paris   |
      | Vienna  |
      | Berlin  |
      | Madrid  |
