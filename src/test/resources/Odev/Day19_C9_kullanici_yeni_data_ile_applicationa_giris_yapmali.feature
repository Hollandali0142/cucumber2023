
@data_table
  Feature: scenario_outline
    Scenario Outline: TC01_datayi_tets_et
      Given kullanici database sayfasindadir
      And kullanici new buttona tiklar
      When kullanici firstname "<firstname>" girer
      When kullanici lastname "<lastname>" girer
      When kullanici position "<position>" girer
      When kullanici office "<office>" girer
      When kullanici extension "<extension>" girer
      When kullanici startdate "<startdate>" girer
      When kullanici salary "<salary>" girer
      And creat buttuna tikla
      And kullanici firstname "<firstname>" arayacak
      Then cikan listede  firstname "<firstname>" oldugunu verify eder
      Then kullanici application kapatir


      Examples:data table icin test data
        | firstname | lastname | position | office | extension | startdate  | salary |
        | John      | Walker   | teacher  | NYC    | 123       | 2023-05-10 | 90000  |
        | Adam      | Brown    | QA       | TX     | 234       | 2023-05-10 | 100000 |
        | Sue       | Jackson  | Manager  | LONDON | 345       | 2023-05-10 | 120000 |
        | Sam       | Walker   | teacher  | NYC    | 123       | 2023-05-10 | 90000  |
        | Vince     | Brown    | QA       | TX     | 234       | 2023-05-10 | 100000 |
        | Ali       | Jackson  | Manager  | LONDON | 345       | 2023-05-10 | 120000 |

        @excel_data_tables
        Scenario:tabloyu excel kullanarak olusturma
          Given kullanici database sayfasindadir
          And kullanici tum zorunlu alanlari "data_tables_sheet" alarak girer
