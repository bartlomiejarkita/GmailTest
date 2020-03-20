Feature: Send email
  A user is able to:
  * send empty messages
  * send only attachments, whithout any further content (title, message etc.)
  * see sent message under Sent category

  Scenario: Send empty message with recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I click Send button
    And I click confirmation message about sending an empty email
    Then I should be able to see my sent massage under Sent category

  Scenario: Send empty message with only one attachment and recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I click Add Attachments button
    And I add an attachment
    And I click Send button
    And I click confirmation message about sending an empty email
    Then I should be able to see my sent massage under Sent category

  Scenario: Send empty message with multiple attachments and recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I click Add Attachments button
    And I add multiple attachments
    And I click Send button
    And I click confirmation message about sending an empty email
    Then I should be able to see my sent massage under Sent category

  Scenario: Send empty message with subject and recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I fill subject field
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send empty message with subject, recipent field and attachment added
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I fill subject field
    And I click Add Attachments button
    And I add an attachment
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send empty message with subject, recipent field and multiple attachments added
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I fill subject field
    And I click Add Attachments button
    And I add an attachment
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send filled message with recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I fill message field with some content
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send filled message with only one attachment and recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I click Add Attachments button
    And I add an attachment
    And I fill message field with some content
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send filled message with multiple attachments and recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I click Add Attachments button
    And I add multiple attachments
    And I fill message field with some content
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send filled message with subject and recipent field filled
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I fill subject field
    And I fill message field with some content
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send filled message with subject, recipent field and attachment added
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I fill subject field
    And I click Add Attachments button
    And I add an attachment
    And I fill message field with some content
    And I click Send button
    Then I should be able to see my sent massage under Sent category

  Scenario: Send filled message with subject, recipent field and multiple attachments added
    Given I'm logged in to my gmail account using "testtesttest84685935@gmail.com" email and "testtesttest123" password
    And I'm on gmail homepage
    When I click Create button
    And I fill recipient field with valid email "testtesttest84685935@gmail.com"
    And I fill subject field
    And I click Add Attachments button
    And I add an attachment
    And I fill message field with some content
    And I click Send button
    Then I should be able to see my sent massage under Sent category