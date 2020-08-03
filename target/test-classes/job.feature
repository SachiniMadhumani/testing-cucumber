Feature:User navigation location
  Scenario Outline: User navigate to https://www.gov.lk/welcome.html with different languages
    Given User on the Welcome page of "https://www.gov.lk/welcome.html"
    When User click on <language>
    Then User should navigate to home page successfully with correct <language>
    Examples:
      |language|
      |sinhala|
      |tamil|
      |english|