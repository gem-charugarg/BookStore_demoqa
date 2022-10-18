Feature: Book Store

  @tag1
  #Scenario Outline: Register a new user in Book Store
   # Given launch the site
   #Then Click on NewUser Button
    #Then Enter First Name in "<field1>"
    #Then Enter Last Name in "<field2>"
    #Then Enter UserName in "<field3>"
    #Then Enter Password in "<field4>"
    #Then Click On Captcha
    #And Click on Register Button.

    #Examples:
     # | field1 | field2 | field3 | field4     |
      #|  jfdfh | yuhjker| dfjdsjf| @CItygh12# |

  #@tag2
  #Scenario Outline:Verify after registeration alert popup with message "User Register Successfully".
   # Given launch the site
    #Then Click on NewUser Button
    #Then Enter First Name in "<field1>"
    #Then Enter Last Name in "<field2>"
    #Then Enter UserName in "<field3>"
    #Then Enter Password in "<field4>"
    #Then Click On Captcha
    #And Click on Register Button.
    #Then Click on Ok and Verify the Sucess "<message>"
    #Examples:
     # | field1 | field2    | field3 | field4   | message                     |
  #| hjbc   | gjsnbcbbg | hibsbd | AB@3$G67 | User Register Successfully. |


  #@tag3
  #Scenario Outline: Login in Book Store
   # Given launch the site
    #Then Enter the "<Username>" in Username field
    #Then Enter the "<Password>" in Password field
    #And Click on Login Button

    #Examples:
     # | Username | Password      |
     #| Charu    | @Criminal1234 |

  #@tag4
  #Scenario Outline: Verify User can search in global search box
   # Then Search the book "<value>" in searchbox
    #And  Verify the book is displayed after search

   # Examples:
    #  | value            |
    #  | Git Pocket Guide |


  #Scenario Outline: Verify after login User can search in global search box
   # Given launch the site
    #Then Enter the "<Username>" in Username field
    #Then Enter the "<Password>" in Password field
    #And Click on Login Button
    #Then Click on GoStrore Button
    #Then Search the book "<value>" in searchbox
    #And  Verify the book is displayed after search

    #Examples:
     # | value            | Username | Password      |
     # | Git Pocket Guide | Charu    | @Criminal1234 |

  #Scenario Outline: User can Logout after login
   # Given launch the site
    #Then Enter the "<Username>" in Username field
    #Then Enter the "<Password>" in Password field
    #And Click on Login Button
    #Then Click on Logout Button

    #Examples:
     # | Username | Password      |
      #| Charu    | @Criminal1234 |

  #Scenario Outline: Verify User name displayed after login
   # Given launch the site
   # Then Enter the "<Username>" in Username field
   # Then Enter the "<Password>" in Password field
   # And Click on Login Button
   # And Verify the "<value>" of Username display after login
   # Examples:
   #   | Username | Password      |
    #  | Charu    | @Criminal1234 |

  Scenario: Verify the column headers of Book Store table
    Then Verify the Headers of the columns for  Book Store table

  #Scenario: Verify User can click on Book Title and user redirected to its info page
   # Then Click on any book Title
   # And  Verify user can see all the info related to book
    #And Click On the link for more info.
    #Then Close the browser.

  #Scenario: Verify User can go to book store page after landing to Book info page.
   # Then Click on any book Title
   # And  Verify user can see all the info related to book
   # Then User can click on Back to Book Store Button.
