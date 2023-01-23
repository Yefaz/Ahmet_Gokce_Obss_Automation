Feature:Assessment Test

  Background:
    * Navigate to https://testing-app.witwiser.io/home/
  Scenario: Case1
    Given Kullanıcı girisi
    When Sessions_tanımlama
    Then Sessions atanması
    And Wait for 40
Scenario: Case2
  Given Test Kullanıcısı girisi.
  When Teste basla.
  Then Testi bitir.
  And Wait for 10

