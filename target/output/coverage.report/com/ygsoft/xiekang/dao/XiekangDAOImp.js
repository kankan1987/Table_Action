var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":0,"methods":[{"el":14,"sc":2,"sl":12},{"el":21,"sc":2,"sl":16},{"el":26,"sc":2,"sl":23},{"el":31,"sc":2,"sl":28},{"el":36,"sc":2,"sl":33},{"el":41,"sc":2,"sl":38}],"name":"XiekangDAOImp","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":38}],"name":"testDao","pass":true,"statements":[{"sl":39},{"sl":40}]},"test_1":{"methods":[{"sl":23}],"name":"testData","pass":true,"statements":[{"sl":24}]},"test_2":{"methods":[{"sl":23}],"name":"testData","pass":true,"statements":[{"sl":24}]},"test_3":{"methods":[{"sl":23}],"name":"testData","pass":true,"statements":[{"sl":24}]},"test_4":{"methods":[{"sl":23}],"name":"testData","pass":true,"statements":[{"sl":24}]},"test_5":{"methods":[{"sl":23}],"name":"testData","pass":true,"statements":[{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4, 2, 3, 1, 5], [4, 2, 3, 1, 5], [], [], [], [], [], [], [], [], [], [], [], [], [], [0], [0], [0], [], []]
