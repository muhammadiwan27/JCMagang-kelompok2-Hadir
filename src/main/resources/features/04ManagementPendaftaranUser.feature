Feature: Management Pendaftaran User Page
  Scenario: Management Pendaftaran User Valid Functionality Test
    When User click button pendaftaran user
    And User click button upload pendaftaran user
    And User input valid nik pendaftaran user
    And User input valid nama pendaftaran user
    And User input valid email pendaftaran user
    And User input valid password pendaftaran user
    And User input valid divisi pendaftaran user
    And User input valid unit pendaftaran user
    And User input valid posisi kerja pendaftaran user
    And User input valid jabatan pendaftaran user
    And User input valid tipe kontrak pendaftaran user
    And User input valid lokasi kerja pendaftaran user
    And User input valid jadwal kerja pendaftaran user
    And User input valid selfie pendaftaran user
    And User input valid jumlah cuti pendaftaran user
    Then User submit valid data pendaftaran user

  Scenario: Management Pendaftaran User Invalid Functionality Test
    When User input invalid nik pendaftaran user
    And User input invalid nama pendaftaran user
    And User input invalid email pendaftaran user
    And User input invalid password pendaftaran user
    And User input invalid divisi pendaftaran user
    And User input invalid unit pendaftaran user
    And User input invalid posisi kerja pendaftaran user
    And User input invalid jabatan pendaftaran user
    And User input invalid tipe kontrak pendaftaran user
    And User input invalid lokasi kerja pendaftaran user
    And User input invalid jadwal kerja pendaftaran user
    And User input invalid selfie pendaftaran user
    And User input invalid jumlah cuti pendaftaran user
    And User submit invalid data pendaftaran user
    Then User get text invalid credentials pendaftaran user
