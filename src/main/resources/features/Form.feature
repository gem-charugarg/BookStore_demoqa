Feature: Registeration Form

  Scenario Outline: Fill the Registeration Form
    Then Enter the "<value1>" in First Name.
    Then Enter the "<value2>" in Last Name.
    Then Enter the "<value3>" in Email
    #Then Choose the Gender
    Then Enter the "<value4>" in Mobile Number
    #Then Select the value from Calendar
    Then Enter the "<value5>" in subjects
    And Choose the Hobbies

    Examples:
    |value1 | value2 | value3       | value4     |value5  |
    | abcd  | wxyz   |abc@gmail.com | 1234567890 |English |