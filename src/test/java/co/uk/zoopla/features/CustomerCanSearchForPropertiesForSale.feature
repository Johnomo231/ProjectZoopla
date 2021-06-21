Feature: Search


  Scenario Outline: User can search for a Properties
    Given I navigate to Ebay homepage
    When I enter Location as "<Location>"
    And I select minimum bed as "<MinBed>"
    And I select maximum bed as "<MaxBed>"
    And I select minimum price as "<MinPrice>"
    And I select maximum price as "<MaxPrice>"
    And I choose "<Property>" as property type
    And I click on search button
    Then search result page is displayed


    Examples: Search Test Data
      | Location | MinBed | MaxBed | MinPrice | MaxPrice | Property    |
      | London   | 3      | 3      | 300,000  | 500,000  | Houses      |
      | London   | 3      | 3      | 300,000  | 500,000  | Flats       |
      | London   | 3      | 3      | 300,000  | 500,000  | Farms/Lands |
      | M9 8PW   | 3      | 3      | 300,000  | 500,000  | Houses      |
      | Bolton   | 3      | 3      | 300,000  | 500,000  | Houses      |
      | Bolton   | 3      | 3      | 300,000  | 500,000  | Flats       |