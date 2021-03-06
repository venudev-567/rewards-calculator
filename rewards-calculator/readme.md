# Test Data:
This project has a file in resources folder named customerTransactions.json

* That file has the test set that was used for this project.
* The transaction data was only generated for 3 months, and number of transaction were limited to between 10 and 20 generated randomly.

# check output
### /rewards
* this endpoint gives the rewards of all the customer.
* the rewards calculated for each customer are as follows
    * total rewards earned by customer.
    * rewards earned by customer broken down by each month.
    
### /rewards/{customerId}
* this endpoint gives the rewards of requested customer
* the rewards calculated for each customer are as follows
    * total rewards earned by customer.
    * rewards earned by customer broken down by each month.


### change test data

* To change test data, there is another endpoint that was provided.
* Hit /customers/generate post endpoint it should return new data, replace this in the resources file.
* To view the current data, you can hit the /customers get endpoint.

# Test Results

* link with test results: https://github.com/venudev-567/results-rewards-calc 

### Test Input
[
{
"customerId": "1",
"firstName": "Venu1",
"lastName": "yella1",
"transactions": [
{
"date": "2020-12-21",
"value": 108
},
{
"date": "2020-12-16",
"value": 51
},
{
"date": "2021-01-11",
"value": 196
},
{
"date": "2021-02-02",
"value": 194
},
{
"date": "2021-02-25",
"value": 151
},
{
"date": "2020-12-28",
"value": 43
},
{
"date": "2021-01-22",
"value": 103
},
{
"date": "2021-02-04",
"value": 110
},
{
"date": "2021-02-04",
"value": 75
},
{
"date": "2021-02-12",
"value": 76
},
{
"date": "2020-12-06",
"value": 169
},
{
"date": "2020-12-13",
"value": 58
},
{
"date": "2020-12-27",
"value": 126
},
{
"date": "2021-02-09",
"value": 101
},
{
"date": "2020-12-30",
"value": 150
},
{
"date": "2021-03-02",
"value": 100
},
{
"date": "2021-02-13",
"value": 164
},
{
"date": "2020-12-29",
"value": 144
}
]
},
{
"customerId": "2",
"firstName": "Venu2",
"lastName": "yella2",
"transactions": [
{
"date": "2020-12-08",
"value": 14
},
{
"date": "2020-12-26",
"value": 195
},
{
"date": "2021-03-03",
"value": 113
},
{
"date": "2021-01-27",
"value": 196
},
{
"date": "2021-02-15",
"value": 84
},
{
"date": "2021-02-18",
"value": 95
},
{
"date": "2021-02-16",
"value": 97
},
{
"date": "2021-02-01",
"value": 98
},
{
"date": "2020-12-22",
"value": 14
},
{
"date": "2020-12-14",
"value": 121
},
{
"date": "2021-01-12",
"value": 194
},
{
"date": "2021-02-18",
"value": 132
}
]
},
{
"customerId": "3",
"firstName": "Venu3",
"lastName": "yella3",
"transactions": [
{
"date": "2021-01-14",
"value": 120
},
{
"date": "2021-02-02",
"value": 24
},
{
"date": "2021-02-27",
"value": 101
},
{
"date": "2021-02-28",
"value": 17
},
{
"date": "2020-12-19",
"value": 44
},
{
"date": "2021-01-12",
"value": 126
},
{
"date": "2021-02-05",
"value": 58
},
{
"date": "2021-02-09",
"value": 20
},
{
"date": "2021-01-26",
"value": 141
},
{
"date": "2021-02-09",
"value": 145
},
{
"date": "2021-02-22",
"value": 191
},
{
"date": "2021-02-19",
"value": 60
},
{
"date": "2021-01-26",
"value": 189
},
{
"date": "2021-02-12",
"value": 131
},
{
"date": "2021-01-13",
"value": 166
},
{
"date": "2021-03-02",
"value": 74
},
{
"date": "2020-12-20",
"value": 34
},
{
"date": "2020-12-09",
"value": 147
},
{
"date": "2021-01-14",
"value": 55
},
{
"date": "2021-01-27",
"value": 50
},
{
"date": "2021-01-09",
"value": 189
},
{
"date": "2021-02-09",
"value": 147
},
{
"date": "2021-02-23",
"value": 173
},
{
"date": "2020-12-21",
"value": 172
},
{
"date": "2021-01-28",
"value": 124
},
{
"date": "2020-12-24",
"value": 30
},
{
"date": "2021-01-19",
"value": 134
},
{
"date": "2021-02-03",
"value": 94
},
{
"date": "2021-01-17",
"value": 24
},
{
"date": "2021-02-25",
"value": 117
},
{
"date": "2020-12-31",
"value": 66
},
{
"date": "2021-01-11",
"value": 181
},
{
"date": "2021-01-09",
"value": 62
},
{
"date": "2021-01-11",
"value": 78
},
{
"date": "2020-12-08",
"value": 182
},
{
"date": "2021-01-11",
"value": 77
}
]
},
{
"customerId": "4",
"firstName": "Venu4",
"lastName": "yella4",
"transactions": [
{
"date": "2021-01-05",
"value": 161
},
{
"date": "2021-01-04",
"value": 21
},
{
"date": "2021-01-11",
"value": 63
},
{
"date": "2021-01-15",
"value": 151
},
{
"date": "2020-12-30",
"value": 128
},
{
"date": "2021-02-09",
"value": 171
},
{
"date": "2021-02-06",
"value": 75
},
{
"date": "2021-01-15",
"value": 20
},
{
"date": "2021-02-06",
"value": 90
},
{
"date": "2021-01-05",
"value": 148
},
{
"date": "2020-12-05",
"value": 109
},
{
"date": "2021-01-10",
"value": 89
},
{
"date": "2021-01-24",
"value": 169
},
{
"date": "2021-01-14",
"value": 48
},
{
"date": "2021-01-25",
"value": 68
},
{
"date": "2021-02-15",
"value": 15
},
{
"date": "2021-01-02",
"value": 27
},
{
"date": "2021-01-30",
"value": 112
},
{
"date": "2021-02-08",
"value": 197
},
{
"date": "2020-12-13",
"value": 55
},
{
"date": "2020-12-16",
"value": 27
},
{
"date": "2021-01-23",
"value": 38
},
{
"date": "2021-01-13",
"value": 10
},
{
"date": "2020-12-17",
"value": 176
},
{
"date": "2021-01-06",
"value": 117
},
{
"date": "2021-02-25",
"value": 101
},
{
"date": "2021-01-28",
"value": 76
},
{
"date": "2021-03-02",
"value": 15
},
{
"date": "2021-02-17",
"value": 57
},
{
"date": "2021-02-10",
"value": 27
},
{
"date": "2021-02-27",
"value": 49
},
{
"date": "2020-12-05",
"value": 58
},
{
"date": "2021-01-28",
"value": 152
},
{
"date": "2021-01-04",
"value": 195
},
{
"date": "2021-02-02",
"value": 155
},
{
"date": "2021-01-23",
"value": 188
},
{
"date": "2021-02-22",
"value": 192
},
{
"date": "2020-12-13",
"value": 108
},
{
"date": "2020-12-09",
"value": 189
},
{
"date": "2021-01-27",
"value": 79
},
{
"date": "2021-02-10",
"value": 37
},
{
"date": "2021-02-03",
"value": 122
},
{
"date": "2021-01-17",
"value": 197
},
{
"date": "2021-02-12",
"value": 102
},
{
"date": "2021-02-04",
"value": 114
},
{
"date": "2021-01-26",
"value": 178
},
{
"date": "2021-01-09",
"value": 112
}
]
},
{
"customerId": "5",
"firstName": "Venu5",
"lastName": "yella5",
"transactions": [
{
"date": "2021-02-14",
"value": 80
},
{
"date": "2021-02-17",
"value": 189
},
{
"date": "2020-12-09",
"value": 178
},
{
"date": "2020-12-08",
"value": 80
},
{
"date": "2020-12-08",
"value": 119
},
{
"date": "2020-12-27",
"value": 169
},
{
"date": "2021-02-11",
"value": 169
},
{
"date": "2021-01-13",
"value": 29
},
{
"date": "2021-03-02",
"value": 194
},
{
"date": "2020-12-18",
"value": 175
},
{
"date": "2020-12-22",
"value": 24
},
{
"date": "2021-01-27",
"value": 41
},
{
"date": "2021-02-22",
"value": 58
},
{
"date": "2021-01-25",
"value": 108
},
{
"date": "2021-02-22",
"value": 135
},
{
"date": "2021-01-21",
"value": 171
},
{
"date": "2021-01-24",
"value": 136
},
{
"date": "2021-01-22",
"value": 143
},
{
"date": "2021-02-15",
"value": 111
},
{
"date": "2021-02-18",
"value": 179
},
{
"date": "2021-01-19",
"value": 189
},
{
"date": "2021-01-15",
"value": 51
},
{
"date": "2021-03-02",
"value": 91
},
{
"date": "2021-02-24",
"value": 181
},
{
"date": "2020-12-28",
"value": 117
},
{
"date": "2021-01-12",
"value": 31
},
{
"date": "2021-01-02",
"value": 60
},
{
"date": "2021-01-19",
"value": 18
},
{
"date": "2021-02-19",
"value": 139
},
{
"date": "2020-12-25",
"value": 67
},
{
"date": "2021-01-11",
"value": 29
},
{
"date": "2020-12-04",
"value": 170
},
{
"date": "2021-02-25",
"value": 80
},
{
"date": "2021-01-15",
"value": 49
},
{
"date": "2021-01-22",
"value": 18
}
]
},
{
"customerId": "6",
"firstName": "Venu6",
"lastName": "yella6",
"transactions": [
{
"date": "2021-01-17",
"value": 141
},
{
"date": "2021-02-18",
"value": 175
},
{
"date": "2021-01-14",
"value": 113
},
{
"date": "2020-12-15",
"value": 76
},
{
"date": "2021-01-15",
"value": 80
},
{
"date": "2021-02-21",
"value": 127
},
{
"date": "2020-12-31",
"value": 194
},
{
"date": "2020-12-07",
"value": 91
},
{
"date": "2021-01-21",
"value": 182
},
{
"date": "2021-03-02",
"value": 116
},
{
"date": "2021-01-31",
"value": 49
},
{
"date": "2021-02-17",
"value": 59
},
{
"date": "2021-01-27",
"value": 71
},
{
"date": "2021-01-10",
"value": 40
},
{
"date": "2021-01-31",
"value": 59
},
{
"date": "2021-01-15",
"value": 73
},
{
"date": "2020-12-22",
"value": 76
},
{
"date": "2020-12-18",
"value": 90
},
{
"date": "2021-02-01",
"value": 28
},
{
"date": "2021-01-03",
"value": 21
},
{
"date": "2020-12-15",
"value": 177
},
{
"date": "2020-12-13",
"value": 174
},
{
"date": "2021-03-03",
"value": 38
},
{
"date": "2021-01-23",
"value": 93
},
{
"date": "2021-03-02",
"value": 140
},
{
"date": "2021-01-20",
"value": 16
},
{
"date": "2020-12-31",
"value": 11
},
{
"date": "2020-12-13",
"value": 125
},
{
"date": "2020-12-15",
"value": 28
},
{
"date": "2021-01-22",
"value": 163
},
{
"date": "2021-01-07",
"value": 29
},
{
"date": "2021-01-14",
"value": 128
},
{
"date": "2021-01-05",
"value": 30
}
]
},
{
"customerId": "7",
"firstName": "Venu7",
"lastName": "yella7",
"transactions": [
{
"date": "2021-01-08",
"value": 81
},
{
"date": "2021-01-13",
"value": 141
},
{
"date": "2020-12-06",
"value": 183
},
{
"date": "2020-12-27",
"value": 154
},
{
"date": "2021-02-23",
"value": 35
},
{
"date": "2020-12-30",
"value": 88
},
{
"date": "2021-02-16",
"value": 30
},
{
"date": "2021-02-12",
"value": 120
},
{
"date": "2020-12-18",
"value": 12
},
{
"date": "2021-02-16",
"value": 121
},
{
"date": "2020-12-29",
"value": 97
},
{
"date": "2021-01-05",
"value": 115
},
{
"date": "2020-12-12",
"value": 109
},
{
"date": "2021-02-27",
"value": 22
},
{
"date": "2021-01-25",
"value": 22
},
{
"date": "2021-01-08",
"value": 129
},
{
"date": "2021-02-12",
"value": 154
},
{
"date": "2021-02-13",
"value": 94
},
{
"date": "2021-01-31",
"value": 74
},
{
"date": "2021-02-28",
"value": 19
},
{
"date": "2020-12-27",
"value": 197
},
{
"date": "2021-01-16",
"value": 119
},
{
"date": "2020-12-20",
"value": 84
},
{
"date": "2020-12-16",
"value": 118
},
{
"date": "2021-02-02",
"value": 170
},
{
"date": "2020-12-05",
"value": 140
},
{
"date": "2021-02-01",
"value": 71
}
]
},
{
"customerId": "8",
"firstName": "Venu8",
"lastName": "yella8",
"transactions": [
{
"date": "2021-02-13",
"value": 137
},
{
"date": "2020-12-08",
"value": 167
},
{
"date": "2020-12-08",
"value": 102
},
{
"date": "2020-12-28",
"value": 141
},
{
"date": "2021-01-26",
"value": 107
},
{
"date": "2021-02-01",
"value": 90
},
{
"date": "2020-12-13",
"value": 125
},
{
"date": "2021-01-19",
"value": 102
},
{
"date": "2021-02-10",
"value": 58
},
{
"date": "2021-01-14",
"value": 52
},
{
"date": "2021-01-23",
"value": 111
},
{
"date": "2021-02-06",
"value": 125
},
{
"date": "2020-12-30",
"value": 131
},
{
"date": "2021-03-03",
"value": 54
},
{
"date": "2021-01-28",
"value": 191
},
{
"date": "2021-02-13",
"value": 86
},
{
"date": "2021-02-10",
"value": 92
},
{
"date": "2021-02-07",
"value": 169
},
{
"date": "2020-12-11",
"value": 28
},
{
"date": "2020-12-24",
"value": 85
},
{
"date": "2021-02-05",
"value": 106
},
{
"date": "2021-03-03",
"value": 132
},
{
"date": "2021-02-10",
"value": 78
},
{
"date": "2021-01-24",
"value": 17
},
{
"date": "2021-01-30",
"value": 180
},
{
"date": "2021-01-04",
"value": 116
}
]
},
{
"customerId": "9",
"firstName": "Venu9",
"lastName": "yella9",
"transactions": [
{
"date": "2021-01-24",
"value": 113
},
{
"date": "2021-02-06",
"value": 33
},
{
"date": "2020-12-04",
"value": 43
},
{
"date": "2021-02-16",
"value": 111
},
{
"date": "2020-12-24",
"value": 63
},
{
"date": "2021-03-01",
"value": 116
},
{
"date": "2020-12-18",
"value": 36
},
{
"date": "2021-02-18",
"value": 130
},
{
"date": "2020-12-30",
"value": 126
},
{
"date": "2021-01-07",
"value": 158
},
{
"date": "2021-01-26",
"value": 93
},
{
"date": "2020-12-29",
"value": 170
},
{
"date": "2021-01-27",
"value": 96
},
{
"date": "2020-12-29",
"value": 15
},
{
"date": "2021-02-24",
"value": 196
},
{
"date": "2020-12-18",
"value": 177
}
]
}
]

### Test Output
[
{
"customerId": "1",
"firstName": "Venu1",
"lastName": "yella1",
"totalRewardPoints": 1086,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 199
},
{
"month": "DECEMBER",
"rewardsValue": 365
},
{
"month": "MARCH",
"rewardsValue": 50
},
{
"month": "FEBRUARY",
"rewardsValue": 472
}
]
},
{
"customerId": "2",
"firstName": "Venu2",
"lastName": "yella2",
"totalRewardPoints": 799,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 290
},
{
"month": "DECEMBER",
"rewardsValue": 216
},
{
"month": "MARCH",
"rewardsValue": 63
},
{
"month": "FEBRUARY",
"rewardsValue": 230
}
]
},
{
"customerId": "3",
"firstName": "Venu3",
"lastName": "yella3",
"totalRewardPoints": 1774,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 814
},
{
"month": "DECEMBER",
"rewardsValue": 333
},
{
"month": "MARCH",
"rewardsValue": -2
},
{
"month": "FEBRUARY",
"rewardsValue": 629
}
]
},
{
"customerId": "4",
"firstName": "Venu4",
"lastName": "yella4",
"totalRewardPoints": 2414,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 1280
},
{
"month": "DECEMBER",
"rewardsValue": 386
},
{
"month": "MARCH",
"rewardsValue": 0
},
{
"month": "FEBRUARY",
"rewardsValue": 748
}
]
},
{
"customerId": "5",
"firstName": "Venu5",
"lastName": "yella5",
"totalRewardPoints": 1956,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 419
},
{
"month": "DECEMBER",
"rewardsValue": 622
},
{
"month": "MARCH",
"rewardsValue": 176
},
{
"month": "FEBRUARY",
"rewardsValue": 739
}
]
},
{
"customerId": "6",
"firstName": "Venu6",
"lastName": "yella6",
"totalRewardPoints": 1341,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 479
},
{
"month": "DECEMBER",
"rewardsValue": 536
},
{
"month": "MARCH",
"rewardsValue": 156
},
{
"month": "FEBRUARY",
"rewardsValue": 170
}
]
},
{
"customerId": "7",
"firstName": "Venu7",
"lastName": "yella7",
"totalRewardPoints": 1398,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 314
},
{
"month": "DECEMBER",
"rewardsValue": 689
},
{
"month": "FEBRUARY",
"rewardsValue": 395
}
]
},
{
"customerId": "8",
"firstName": "Venu8",
"lastName": "yella8",
"totalRewardPoints": 1332,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 461
},
{
"month": "DECEMBER",
"rewardsValue": 436
},
{
"month": "MARCH",
"rewardsValue": 40
},
{
"month": "FEBRUARY",
"rewardsValue": 395
}
]
},
{
"customerId": "9",
"firstName": "Venu9",
"lastName": "yella9",
"totalRewardPoints": 901,
"monthlyRewards": [
{
"month": "JANUARY",
"rewardsValue": 249
},
{
"month": "DECEMBER",
"rewardsValue": 299
},
{
"month": "MARCH",
"rewardsValue": 66
},
{
"month": "FEBRUARY",
"rewardsValue": 287
}
]
}
]
