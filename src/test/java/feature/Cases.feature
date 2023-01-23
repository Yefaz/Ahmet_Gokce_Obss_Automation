Feature:Assessment Test

  Background:
    * Navigate to https://testing-app.witwiser.io/home/
  Scenario: Case1
    Given Kullanıcı girisi
    When Sessions_tanımlama
    Then Sessions atanması
    And Wait for 40
Scenario: Case2
  Then Search Ikonuna Tıklanır.
  And Wait for 40

