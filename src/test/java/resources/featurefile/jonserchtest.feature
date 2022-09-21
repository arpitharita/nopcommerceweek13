Feature: Job Search Test

 Scenario Outline: verify Job search result using different data set
   Given I am on home page
   And I enter job title "<Job Title>"
   And I enter location"<location>"
   And I select distance "<distance>"
   And I enter salary max "<salary Max>"
   And select salary type "<Job type>"
   And I click on "<Find jobs>"
   Then I verify the result "<result>"

Examples:
  |jobTitle |location | distance |salaryMin |salaryMax |salaryType |jobType |result |
  |Tester |Harrow | up to 5 miles |30000 |500000 |Per annum | Permanent |Permanent
  |Tester |Harrow | up to 5 miles |30000 |500000 |Per annum | Permanent |Permanent
  |Tester |Harrow | up to 5 miles |30000 |500000 |Per annum | Permanent |Permanent
  |Tester |Harrow | up to 5 miles |30000 |500000 |Per annum | Permanent |Permanent
  |Tester |Harrow | up to 5 miles |30000 |500000 |Per annum | Permanent |Permanent
  |Tester |Harrow | up to 5 miles |30000 |500000 |Per annum | Permanent |Permanent