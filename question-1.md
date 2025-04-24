# 1. Question 1

A password string, `pwd`, consists of binary characters (0s and 1s). A cyber security expert is trying to determine the minimum number of changes required to make the password secure. To do so, it must be divided into substrings of non-overlapping, even length substrings. Each substring can only contain 1s or 0s, not a mix. This helps to ensure that the password is strong and less vulnerable to hacking attacks.

Find the minimum number of characters that must be flipped in the password string, i.e. changed from 0 to 1 or 1 to 0 to allow the string to be divided as described.

> **Note:** A *substring* is a contiguous sequence of characters in a string.

---

### Example

Given `pwd = "1110011000"`

```
Original:      1 1 1 0 0 1 1 0 0 0
Flips needed:        ↑ ↑     ↑
Result:        1 1 1 1 1 1 1 1 0 0
```

It is optimal to flip three zeros of the string `pwd` to get `"1111111100"`  
which can now be divided into two valid substrings:

```
11111111   00
```

The two substrings have lengths 8 and 2 respectively. Since both lengths are even, the division is valid. So the answer is **3**.

---

## Function Description

Complete the function `getMinFlips` in the editor below.

```python
def getMinFlips(pwd: str) -> int:
    pass
```

### Arguments:

- `str pwd`: the binary string

### Returns:

- `int`: the minimum number of flips to make the division possible

---

## Constraints

- 2 ≤ len(pwd) ≤ 10⁵
- The length of `pwd` is even.
- `pwd` contains only `1`s and `0`s.

---

## Input Format For Custom Testing

The first line contains a string, `pwd`.
