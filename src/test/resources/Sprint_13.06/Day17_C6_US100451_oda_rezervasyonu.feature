
#FEATURE: FE1009Oda rezervasyonu
#US100451: Oda rezervasyonu yapmak için tüm zorunlu alanları doldur
#Description:  Manager olarak, bir oda rezervasyonu yapabilmeli
#Acceptance Criteria:
#Given kullanici application’in sayfasindadir
#And kullanici manager kullanici bilgilerini girer
#When kullanici login button’una click eder
#Then default page’in displayed oldugunu verify eder
#-------------------------------------------------------------------------------
#Given kullanıcı oda rezervasyon sayfasını yönlendirilir
#And kullanıcı tüm zorunlu alanları girer
#And kullanıcı approved checkbox’a click eder
#And kullanıcı paid check box’a click eder
#And kullanıcı save button’una click eder
#Then kullanıcı success mesajını verify eder
#Test Data:
#Url: https://qa-environment.resortsline.com/Account/Logon
#Credentials/Kullanici Bilgileri :
#manager, Manager1!

  @room_rezervasyonu

  Feature:FE1009_room_rezervasyon

    Scenario: TC01_kullanici_manager_profiliyle_login
      Given kullanici application sayfasindadir
      And kullanici manager kullanici bilgilerini girer
        |username|password|
        |manager |Manager1!|
      Then kullanici login buttonuna click eder
      Then kullanici "Hotel Management" oldugunu very eder
      Then  screenshot yap

      Scenario: TC02_kullanici_room_rezervasyon_yapacak
      Given kullanıcı oda rezervasyon sayfasını yönlendirilir
      Then  screenshot yap

    Scenario: TC02_kullanici_room_rezervasyon_yapacak
        And kullanıcı tüm zorunlu alanları girer
          | idUser  | IdOtelRoom | idPrice | dateStart  | dateEnd    | adltAmount | childrenAmount | contactNameSurname | contactPhone   | contactEmail   | notes                     |
          | manager | Harrison   | 700     | 01/25/2023 | 01/30/2023 | 2          | 4              | test               | (870) 256-3569 | teekt@gmail.com | bu datatable ile ilk test |


          And kullanıcı approved checkbox’a click eder
          And kullanıcı paid check box’a click eder
              Then  screenshot yap
          And kullanıcı save button’una click eder
              Then  screenshot yap
          Then kullanıcı success mesajını verify eder
          Then kullanici application kapatir

