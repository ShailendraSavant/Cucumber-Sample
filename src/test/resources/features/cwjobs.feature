Feature: verify CWjobs Portal
@tag1
  Scenario Outline: I am able to login CWJobs Portal
    Given I has valid url for cwjobs Portal
    When I entered valid "<CW_login>" and vaild "<CW_password>" in step
    Then I click on CW_login button

    Examples: 
      | CW_login                        | CW_password      | status  |
      | shailendrasavant@gmail.com      | WearetheWorld    | Fail    |
      | shailendrasavant@rediffmail.com | DontworrybeHappy | Fail    |
      | shailendrasavant@indiatimes.com | ItsSeptember     | Fail    |
      | shailendrasavant@sqatester.com  | watchmeifyoucan  | Fail    |