Feature: Management Pendaftaran Sendiri Page
  Scenario: Management Pendaftaran Sendiri Valid Functionality Test
    When User click button pendaftaran sendiri
    And User click button view data pendaftaran sendiri
    And User edit valid divisi pendaftaran sendiri
    And User edit valid unit pendaftaran sendiri
    And User edit valid tipe kontrak pendaftaran sendiri
    And User edit valid posisi kerja pendaftaran sendiri
    And User edit valid jabatan pendaftaran sendiri
    And User edit valid lokasi kerja pendaftaran sendiri
    And User edit valid jadwal kerja pendaftaran sendiri
    And User edit valid selfie pendaftaran sendiri
    And User edit valid jumlah cuti pendaftaran sendiri
    And User submit valid data pendaftaran sendiri
    Then User delete valid data pendaftaran sendiri

  Scenario: Management Pendaftaran Sendiri Invalid Functionality Test
    When User delete invalid data pendaftaran sendiri
    Then User get text invalid credentials pendaftaran sendiri


