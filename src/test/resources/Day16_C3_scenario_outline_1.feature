
  @Scenario_outline_1_google_arama

    Feature: Google_Arama_Fonksiyonu
      Scenario Outline:
        Given kullanici google sayfasindadir
        And kullanici "<urun>" arar
        Then kullanici sonuclarda "<urun>" oldugunu verify et
        Then kullanici application kapatir


        Examples:
          | urun    |
          | iPhone  |
          | cicek   |
          | tesla   |
          | bmw     |
          | samsung |