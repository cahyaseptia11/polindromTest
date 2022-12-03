Feature: Palindrom keyword

  Scenario: test valid palindrom
    Given memasukkan kata berupa "nababan"
    When cek polindrom
    Then hasil tes harus "true"

  Scenario: test invalid palindrom
    Given memasukkan kata berupa "jakarta"
    When cek polindrom
    Then hasil tes harus "false"