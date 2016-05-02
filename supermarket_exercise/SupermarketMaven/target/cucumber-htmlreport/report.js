$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("supermarket.feature");
formatter.feature({
  "line": 1,
  "name": "Various number of items and offers",
  "description": "",
  "id": "various-number-of-items-and-offers",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "\u0027X\u0027 Items each for A, B, C, D with 2 offers",
  "description": "",
  "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "there are \u003citems\u003e of \"A\" that costs \"2.00\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "there are \u003citems\u003e of \"B\" that costs \"1.50\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "there are \u003citems\u003e of \"C\" that costs \"1.25\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "there are \u003citems\u003e of \"D\" that costs \"1.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "there is an offer for \"A\" for 2 units the cost is \"3.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "there is an offer for \"B\" for 3 units the cost is \"3.50\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the total should come up to \"\u003cexpected_total\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;",
  "rows": [
    {
      "cells": [
        "items",
        "expected_total"
      ],
      "line": 15,
      "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;;1"
    },
    {
      "cells": [
        "3",
        "15.25"
      ],
      "line": 16,
      "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;;2"
    },
    {
      "cells": [
        "5",
        "25.75"
      ],
      "line": 17,
      "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;;3"
    },
    {
      "cells": [
        "10",
        "49.50"
      ],
      "line": 18,
      "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "\u0027X\u0027 Items each for A, B, C, D with 2 offers",
  "description": "",
  "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "there are 3 of \"A\" that costs \"2.00\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "there are 3 of \"B\" that costs \"1.50\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "there are 3 of \"C\" that costs \"1.25\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "there are 3 of \"D\" that costs \"1.00\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "there is an offer for \"A\" for 2 units the cost is \"3.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "there is an offer for \"B\" for 3 units the cost is \"3.50\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the total should come up to \"15.25\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 10
    },
    {
      "val": "A",
      "offset": 16
    },
    {
      "val": "2.00",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 244192819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 10
    },
    {
      "val": "B",
      "offset": 16
    },
    {
      "val": "1.50",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 204841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 10
    },
    {
      "val": "C",
      "offset": 16
    },
    {
      "val": "1.25",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 187735,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 10
    },
    {
      "val": "D",
      "offset": 16
    },
    {
      "val": "1.00",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 197144,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "3.00",
      "offset": 51
    }
  ],
  "location": "SupermarketSteps.there_is_an_offer_for_units_the_cost_is(String,int,String)"
});
formatter.result({
  "duration": 240336,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "B",
      "offset": 23
    },
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "3.50",
      "offset": 51
    }
  ],
  "location": "SupermarketSteps.there_is_an_offer_for_units_the_cost_is(String,int,String)"
});
formatter.result({
  "duration": 218098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15.25",
      "offset": 29
    }
  ],
  "location": "SupermarketSteps.the_total_should_come_up_to(String)"
});
formatter.result({
  "duration": 240335,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "\u0027X\u0027 Items each for A, B, C, D with 2 offers",
  "description": "",
  "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "there are 5 of \"A\" that costs \"2.00\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "there are 5 of \"B\" that costs \"1.50\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "there are 5 of \"C\" that costs \"1.25\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "there are 5 of \"D\" that costs \"1.00\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "there is an offer for \"A\" for 2 units the cost is \"3.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "there is an offer for \"B\" for 3 units the cost is \"3.50\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the total should come up to \"25.75\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    },
    {
      "val": "A",
      "offset": 16
    },
    {
      "val": "2.00",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 217671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    },
    {
      "val": "B",
      "offset": 16
    },
    {
      "val": "1.50",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 201847,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    },
    {
      "val": "C",
      "offset": 16
    },
    {
      "val": "1.25",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 205697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    },
    {
      "val": "D",
      "offset": 16
    },
    {
      "val": "1.00",
      "offset": 31
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 184315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "3.00",
      "offset": 51
    }
  ],
  "location": "SupermarketSteps.there_is_an_offer_for_units_the_cost_is(String,int,String)"
});
formatter.result({
  "duration": 158655,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "B",
      "offset": 23
    },
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "3.50",
      "offset": 51
    }
  ],
  "location": "SupermarketSteps.there_is_an_offer_for_units_the_cost_is(String,int,String)"
});
formatter.result({
  "duration": 165498,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25.75",
      "offset": 29
    }
  ],
  "location": "SupermarketSteps.the_total_should_come_up_to(String)"
});
formatter.result({
  "duration": 286094,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "\u0027X\u0027 Items each for A, B, C, D with 2 offers",
  "description": "",
  "id": "various-number-of-items-and-offers;\u0027x\u0027-items-each-for-a,-b,-c,-d-with-2-offers;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "there are 10 of \"A\" that costs \"2.00\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "there are 10 of \"B\" that costs \"1.50\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "there are 10 of \"C\" that costs \"1.25\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "there are 10 of \"D\" that costs \"1.00\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "there is an offer for \"A\" for 2 units the cost is \"3.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "there is an offer for \"B\" for 3 units the cost is \"3.50\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the total should come up to \"49.50\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 10
    },
    {
      "val": "A",
      "offset": 17
    },
    {
      "val": "2.00",
      "offset": 32
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 221519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 10
    },
    {
      "val": "B",
      "offset": 17
    },
    {
      "val": "1.50",
      "offset": 32
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 148392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 10
    },
    {
      "val": "C",
      "offset": 17
    },
    {
      "val": "1.25",
      "offset": 32
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 134707,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 10
    },
    {
      "val": "D",
      "offset": 17
    },
    {
      "val": "1.00",
      "offset": 32
    }
  ],
  "location": "SupermarketSteps.there_are_of_that_costs(int,String,String)"
});
formatter.result({
  "duration": 140267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "3.00",
      "offset": 51
    }
  ],
  "location": "SupermarketSteps.there_is_an_offer_for_units_the_cost_is(String,int,String)"
});
formatter.result({
  "duration": 135990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "B",
      "offset": 23
    },
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "3.50",
      "offset": 51
    }
  ],
  "location": "SupermarketSteps.there_is_an_offer_for_units_the_cost_is(String,int,String)"
});
formatter.result({
  "duration": 186025,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "49.50",
      "offset": 29
    }
  ],
  "location": "SupermarketSteps.the_total_should_come_up_to(String)"
});
formatter.result({
  "duration": 1672513,
  "status": "passed"
});
});