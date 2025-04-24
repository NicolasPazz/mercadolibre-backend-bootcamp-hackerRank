># Question 1
>
A password string, `pwd`, consists of binary characters (0s and 1s). A cyber security expert is trying to determine the minimum number of changes required to make the password secure. To do so, it must be divided into substrings of non-overlapping, even >length substrings. Each substring can only contain 1s or 0s, not a mix. This helps to ensure that the password is strong and less vulnerable to hacking attacks.
>
>Find the minimum number of characters that must be flipped in the password string, i.e. changed from 0 to 1 or 1 to 0 to allow the string to be divided as described.
>
>> **Note:** A *substring* is a contiguous sequence of characters in a string.
>
>---
>
>### Example
>
>Given `pwd = "1110011000"`
>
>```
>Original:      1 1 1 0 0 1 1 0 0 0
>Flips needed:        ↑ ↑     ↑
>Result:        1 1 1 1 1 1 1 1 0 0
>```
>
>It is optimal to flip three zeros of the string `pwd` to get `"1111111100"`  
>which can now be divided into two valid substrings:
>
>```
>11111111   00
>```
>
>The two substrings have lengths 8 and 2 respectively. Since both lengths are even, the division is valid. So the answer is **3**.
>
>---
>
>## Function Description
>
>Complete the function `getMinFlips` in the editor below.
>
>```python
>def getMinFlips(pwd: str) -> int:
    >pass
>```
>
>### Arguments:
>
>- `str pwd`: the binary string
>
>### Returns:
>
>- `int`: the minimum number of flips to make the division possible
>
>---
>
>## Constraints
>
>- 2 ≤ len(pwd) ≤ 10⁵
>- The length of `pwd` is even.
>- `pwd` contains only `1`s and `0`s.
>
>---
>
>## Input Format For Custom Testing
>
>The first line contains a string, `pwd`.
---
># Question 2
>
>On a web form, users are asked to enter dates which come in as strings. Before storing them to the database, they need to be converted to a standard date format. Write a function to convert the dates as described.
>
>Given a date string in the format *Day Month Year*, where:
>
>- **Day** is a string in the form `"1st"`, `"2nd"`, `"3rd"`, `"21st"`, `"22nd"`, `"23rd"`, `"31st"` and all others are the number + `"th"`, e.g. `"4th"` or `"12th"`.
>- **Month** is the first three letters of the English language months, like `"Jan"` for January through `"Dec"` for December.
>- **Year** is 4 digits ranging from 1900 to 2100.
>
>Convert the date string `"Day Month Year"` to the date string `"YYYY-MM-DD"` in the format "4 digit year - 2 digit month - 2 digit day".
>
>---
>
>### Example
>
>- `1st Mar 1974 → 1974-03-01`
>- `22nd Jan 2013 → 2013-01-22`
>- `7th Apr 1904 → 1904-04-07`
>
>---
>
>## Function Description
>
>Complete the function `preprocessDate` in the editor below.
>
>```python
>def preprocessDate(dates: list[str]) -> list[str]:
    >pass
>```
>
>### Parameters
>
>- `string dates[n]`: an array of date strings in the format `Day Month Year`
>
>### Returns
>
>- `string[n]`: array of converted date strings
>
>---
>
>## Constraints
>
>- The values of **Day**, **Month**, and **Year** are restricted to the value ranges specified above.
>- The given dates are guaranteed to be valid, so no error handling is necessary.
>- \(1 \leq n \leq 10^4\)
>
>---
>
>## Input Format for Custom Testing
>
>Input from stdin will be processed as follows and passed to the function:
>
>- The first line contains an integer `n`, the size of the array `dates`.
>- Each of the next `n` lines contains a string, `dates[i]` where \(0 \leq i < n\).
>
>---
>
>## Sample Case 0
>
>### Sample Input 0
>
>```
>10
>20th Oct 2052
>6th Jun 1933
>26th May 1960
>20th Sep 1958
>16th Mar 2068
>25th May 1912
>16th Dec 2018
>26th Dec 2061
>4th Nov 2030
>28th Jul 1963
>```
>
>### Sample Output 0
>
>```
>2052-10-20
>1933-06-06
>1960-05-26
>1958-09-20
>2068-03-16
>1912-05-25
>2018-12-16
>2061-12-26
>2030-11-04
>1963-07-28
>```
