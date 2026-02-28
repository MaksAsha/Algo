# Kotlin Base Algorithms

A collection of fundamental algorithmic problems for developer interview preparation. All solutions are written in **Kotlin**.

---

## 📚 Topics

### 🔤 String Tasks

| # | Problem | Description |
|---|---------|-------------|
| 1 | String Reverse | Reverse a string without using `reverse()` |
| 2 | Palindrome | Check if a string is a palindrome |
| 3 | Anagram | Check if two strings are anagrams of each other |
| 4 | First Non-Repeatable Symbol | Find the index of the first non-repeating character |
| 5 | String Compression | Compress a string by replacing repeated characters with character + count |
| 6 | Reverse Words in Sentence | Reverse the order of words in a sentence |

---

### 🔢 Arrays & Numbers

| # | Problem | Description |
|---|---------|-------------|
| 7 | Two Sum | Find two numbers that add up to a target, return their indices |
| 8 | Find Duplicates | Find all duplicate elements in an array |
| 9 | Max Subarray Sum | Find the subarray with the maximum sum (Kadane's Algorithm) |
| 10 | Missing Number | Find the missing number in an array from 1 to n |
| 11 | Reverse Array | Reverse an array in-place using two pointers |
| 12 | FizzBuzz | Classic FizzBuzz problem |

---

### 🗂️ Collections

| # | Problem | Description |
|---|---------|-------------|
| 13 | Group Anagrams | Group anagrams together from a list of words |
| 14 | Array Intersection | Find the intersection of two arrays |

---

## 🧠 Key Techniques

- **Two Pointers** — left and right pointers moving toward each other (string reverse, palindrome, array reverse)
- **HashMap** — O(1) lookups (Two Sum, anagrams, duplicates)
- **HashSet** — unique elements (array intersection, duplicates)
- **Kadane's Algorithm** — maximum subarray sum in O(n)
- **Math trick** — missing number via sum formula `n*(n+1)/2`

---

## ⚙️ Time & Space Complexity

| Problem | Time | Space |
|---------|------|-------|
| String Reverse | O(n) | O(1) |
| Palindrome | O(n) | O(1) |
| Anagram | O(n) | O(n) |
| First Non-Repeatable Symbol | O(n) | O(n) |
| String Compression | O(n) | O(n) |
| Reverse Words | O(n) | O(n) |
| Two Sum | O(n) | O(n) |
| Find Duplicates | O(n) | O(n) |
| Max Subarray Sum | O(n) | O(1) |
| Missing Number | O(n) | O(1) |
| Reverse Array | O(n) | O(1) |
| FizzBuzz | O(n) | O(1) |
| Group Anagrams | O(n·k log k) | O(n) |
| Array Intersection | O(n+m) | O(n) |