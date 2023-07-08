Feature: Management User Page Test
  Scenario: Management User Valid Functionality Test
    When User click tab management
    And User click button user
    And User search valid data based nama
    And User search valid data based nik
    And User filter valid data based department
    And User filter valid data based job level
    And User filter valid data based tipe karyawan
    And User filter valid data based posisi kerja
    And User filter valid data based lokasi kerja
    And User edit valid data
    And User delete valid data
    Then User export valid data

  Scenario: Management User Invalid Functionality Test
    When User search invalid data based nama
    Then User get text invalid credentials search nama
