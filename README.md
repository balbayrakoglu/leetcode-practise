# LeetCode Practise 🎯

Java 17 + JUnit 5 ile çözülmüş LeetCode problemleri. Her çözüm dosyası şu şablonu takip eder:

- **Problem** – sorunun kısa tanımı ve örnek girdi/çıktı
- **Yaklaşım** – hangi *pattern* kullanıldığı ve adım adım mantık ("neden çalışır?")
- **Karmaşıklık** – zaman ve alan (Big-O) analizi
- **LeetCode linki** – orijinal soruya bağlantı

Pattern'lerin (Two Pointers, Sliding Window, vb.) ayrıntılı anlatımı için: [docs/PATTERNS.md](docs/PATTERNS.md)

## Çalıştırma

```bash
mvn test                         # tüm testleri çalıştır
mvn test -Dtest=TwoSumTest       # tek bir testi çalıştır
```

## Problem Dizini

### Arrays & Hashing

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 1 | Two Sum | Easy | Hash Map | O(n) | [TwoSum](src/main/java/com/balbayrakoglu/leetcode/arrays/TwoSum.java) |
| 217 | Contains Duplicate | Easy | Hash Set | O(n) | [ContainsDuplicate](src/main/java/com/balbayrakoglu/leetcode/arrays/ContainsDuplicate.java) |
| 242 | Valid Anagram | Easy | Sıralama / Sayaç | O(n log n) | [ValidAnagram](src/main/java/com/balbayrakoglu/leetcode/arrays/ValidAnagram.java) |
| 49 | Group Anagrams | Medium | Hash Map + kanonik anahtar | O(n·k log k) | [GroupAnagram](src/main/java/com/balbayrakoglu/leetcode/arrays/GroupAnagram.java) |
| 347 | Top K Frequent Elements | Medium | Frekans map + sıralama | O(n log n) | [TopKFrequentElement](src/main/java/com/balbayrakoglu/leetcode/arrays/TopKFrequentElement.java) |
| 238 | Product of Array Except Self | Medium | Prefix/Suffix çarpımı | O(n) | [ProductOfArrayExceptSelf](src/main/java/com/balbayrakoglu/leetcode/arrays/ProductOfArrayExceptSelf.java) |
| 128 | Longest Consecutive Sequence | Medium | Hash Set | O(n) | [LongestConsecutiveArray](src/main/java/com/balbayrakoglu/leetcode/arrays/LongestConsecutiveArray.java) |
| 36 | Valid Sudoku | Medium | Boolean işaretleme | O(1) | [ValidSudoku](src/main/java/com/balbayrakoglu/leetcode/arrays/ValidSudoku.java) |
| 268 | Missing Number | Easy | Gauss toplamı / XOR | O(n) | [MissingNumber](src/main/java/com/balbayrakoglu/leetcode/arrays/MissingNumber.java) |
| 412 | Fizz Buzz | Easy | Kural map'i | O(n) | [FizzBuzz](src/main/java/com/balbayrakoglu/leetcode/arrays/FizzBuzz.java) |
| 1431 | Kids With the Greatest Number of Candies | Easy | İki geçiş | O(n) | [KidsWithTheGreatestNumberOfCandies](src/main/java/com/balbayrakoglu/leetcode/arrays/KidsWithTheGreatestNumberOfCandies.java) |

### Two Pointers

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 125 | Valid Palindrome | Easy | İki uçtan | O(n) | [Palindrome](src/main/java/com/balbayrakoglu/leetcode/strings/Palindrome.java) |
| 345 | Reverse Vowels of a String | Easy | İki uçtan | O(n) | [ReverseVowelsOfaString](src/main/java/com/balbayrakoglu/leetcode/strings/ReverseVowelsOfaString.java) |
| 26 | Remove Duplicates from Sorted Array | Easy | Slow/Fast | O(n) | [RemoveDuplicates](src/main/java/com/balbayrakoglu/leetcode/arrays/RemoveDuplicates.java) |
| 1768 | Merge Strings Alternately | Easy | Paralel ilerleme | O(n+m) | [MergeStringsAlternately](src/main/java/com/balbayrakoglu/leetcode/strings/MergeStringsAlternately.java) |

### Sliding Window

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 643 | Maximum Average Subarray I | Easy | Sabit pencere | O(n) | [MaximumAverageSubarraySlidingWindow](src/main/java/com/balbayrakoglu/leetcode/arrays/MaximumAverageSubarraySlidingWindow.java) |
| 3 | Longest Substring Without Repeating Characters | Medium | Değişken pencere + map | O(n) | [LongestSubstringWithoutRepeatingCharacters](src/main/java/com/balbayrakoglu/leetcode/arrays/LongestSubstringWithoutRepeatingCharacters.java) |

### Stack

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 20 | Valid Parentheses | Easy | Stack (LIFO eşleşme) | O(n) | [ValidParentheses](src/main/java/com/balbayrakoglu/leetcode/arrays/ValidParentheses.java) |

### Binary Search

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 704 | Binary Search | Easy | Klasik binary search | O(log n) | [BinarySearch](src/main/java/com/balbayrakoglu/leetcode/arrays/BinarySearch.java) |
| 4 | Median of Two Sorted Arrays | Hard | Merge + sıralama (eğitim amaçlı) | O((m+n) log(m+n)) | [MedianTwoSortedArrays](src/main/java/com/balbayrakoglu/leetcode/arrays/MedianTwoSortedArrays.java) |

### Greedy

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 121 | Best Time to Buy and Sell Stock | Easy | Min takibi | O(n) | [BestTimeToBuyStock](src/main/java/com/balbayrakoglu/leetcode/arrays/BestTimeToBuyStock.java) |
| 605 | Can Place Flowers | Easy | Greedy yerleştirme | O(n) | [CanPlaceFlowers](src/main/java/com/balbayrakoglu/leetcode/arrays/CanPlaceFlowers.java) |
| 334 | Increasing Triplet Subsequence | Medium | İki aday takibi | O(n) | [IncreasingTripletSubsequence](src/main/java/com/balbayrakoglu/leetcode/arrays/IncreasingTripletSubsequence.java) |

### Strings

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 14 | Longest Common Prefix | Easy | Yatay/Dikey tarama | O(S) | [LongestCommonPrefix](src/main/java/com/balbayrakoglu/leetcode/strings/LongestCommonPrefix.java) |
| 151 | Reverse Words in a String | Medium | Sondan tarama | O(n) | [ReverseWordsInAString](src/main/java/com/balbayrakoglu/leetcode/strings/ReverseWordsInAString.java) |
| 271 | Encode and Decode Strings | Medium | Uzunluk ön-eki | O(n) | [EncodeAndDecode](src/main/java/com/balbayrakoglu/leetcode/strings/EncodeAndDecode.java) |
| 1071 | GCD of Strings | Easy | Öklid algoritması | O(m+n) | [GcdOfStrings](src/main/java/com/balbayrakoglu/leetcode/strings/GcdOfStrings.java) |

### Intervals & Linked List

| # | Problem | Zorluk | Pattern | Zaman | Çözüm |
|---|---------|--------|---------|-------|-------|
| 56 | Merge Intervals | Medium | Sıralama + birleştirme | O(n log n) | [MergeIntervals](src/main/java/com/balbayrakoglu/leetcode/arrays/MergeIntervals.java) |
| 2181 | Merge Nodes in Between Zeros | Medium | Linked list tek geçiş | O(n) | [MergeNodesInBetweenZeros](src/main/java/com/balbayrakoglu/leetcode/arrays/MergeNodesInBetweenZeros.java) |

### Sorting

| Problem | Pattern | Zaman | Çözüm |
|---------|---------|-------|-------|
| Sıralama + arama (eğitim amaçlı) | Selection-sort benzeri | O(n²) | [BubbleSort](src/main/java/com/balbayrakoglu/leetcode/sort/BubbleSort.java) |

## Diğer Klasörler

- **`common/`** – Java core konu tekrarları: Streams (`flatMap`, `groupingBy`), koleksiyon karşılaştırmaları (`ArrayList` vs `LinkedList`, `TreeSet` vs `HashSet`), `equals`/`hashCode` sözleşmesi, immutable sınıf tasarımı, tarih API'si vb.
- **`deutscheBank/`** – Mülakat pratiği: thread-safe `BankAccount`, `LRUCache` (LinkedHashMap ile), `RetryExecutor`, string problemleri.
- **`datastructure/`, `tree/`** – Ortak veri yapısı tanımları (`Node`, `TreeNode`).

## Çalışma Önerisi 📚

1. Önce [docs/PATTERNS.md](docs/PATTERNS.md) dosyasından ilgili pattern'i oku.
2. Problemi LeetCode linkinden aç ve **çözüme bakmadan** kendin dene.
3. Takılırsan çözüm dosyasındaki "Yaklaşım" bölümünü oku ama kodu okuma; ipucuyla tekrar dene.
4. Kendi çözümünü buradakiyle karşılaştır, karmaşıklık analizini kendin yapıp doğrula.
5. Testleri çalıştırarak edge case'leri incele (`null`, boş dizi, tek eleman...).
