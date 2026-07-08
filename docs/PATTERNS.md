# Algoritma Pattern Rehberi

Bu repodaki çözümlerde kullanılan temel pattern'ler. Her pattern için: ne zaman kullanılır, nasıl çalışır ve bu repodaki hangi problemlerde geçer.

## 1. Hash Map / Hash Set

**Ne zaman:** "Daha önce gördüm mü?", "kaç kere geçiyor?", "eşleşen çift var mı?" sorularında. İç içe döngüyü (O(n²)) tek geçişe (O(n)) indirir.

**Fikir:** Gezerken gördüklerini bir map/set'e kaydet; sonraki elemanlarda O(1) sürede sorgula. Klasik takas: **zaman kazan, alan harca**.

```java
Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if (map.containsKey(complement)) return new int[]{map.get(complement), i};
    map.put(nums[i], i);
}
```

**Bu repoda:** TwoSum, ContainsDuplicate, GroupAnagram, TopKFrequentElement, LongestConsecutiveArray, ValidSudoku

## 2. Two Pointers (İki İşaretçi)

**Ne zaman:** Sıralı diziler, palindrom kontrolleri, in-place işlemler. İki alt tür:

**a) İki uçtan (converging):** `left` baştan, `right` sondan; ortada buluşana kadar ilerler.

```java
int left = 0, right = s.length() - 1;
while (left < right) {
    if (s.charAt(left) != s.charAt(right)) return false;
    left++; right--;
}
```

**b) Slow/Fast:** `slow` "geçerli bölgenin" sınırını, `fast` taramayı yapar. In-place silme/taşımada standart.

```java
int slow = 0;
for (int fast = 1; fast < nums.length; fast++) {
    if (nums[fast] != nums[slow]) nums[++slow] = nums[fast];
}
```

**Bu repoda:** Palindrome, ReverseVowelsOfaString (iki uçtan) · RemoveDuplicates (slow/fast) · MergeStringsAlternately (paralel)

## 3. Sliding Window (Kayan Pencere)

**Ne zaman:** "Ardışık (contiguous) alt dizi/alt string" içeren max/min/say problemleri. İki alt tür:

**a) Sabit boyutlu:** Pencere hep k eleman. Kaydırırken yeni gireni ekle, çıkanı çıkar → her adım O(1).

```java
for (int i = k; i < n; i++) {
    sum += nums[i] - nums[i - k];   // giren - çıkan
    maxSum = Math.max(maxSum, sum);
}
```

**b) Değişken boyutlu:** `right` her adımda genişletir; koşul bozulunca `left` daraltır. İki işaretçi de yalnızca ileri gider → toplam O(n).

**Bu repoda:** MaximumAverageSubarraySlidingWindow (sabit) · LongestSubstringWithoutRepeatingCharacters (değişken)

## 4. Stack

**Ne zaman:** "En son açılan en önce kapanmalı" (LIFO) yapısı olan her şey: parantez eşleştirme, geri alma, iç içe yapılar.

**Fikir:** Açılışları push'la; kapanış geldiğinde tepedekiyle eşleşmeli. Java'da `Deque<Character> stack = new ArrayDeque<>()` tercih edilir (`Stack` sınıfı legacy'dir).

**Bu repoda:** ValidParentheses

## 5. Binary Search

**Ne zaman:** Sıralı (veya monoton) bir arama uzayı varsa. Her adımda uzayın yarısını eler → O(log n).

**Klasik hatalar:**
- `mid = (left + right) / 2` → int taşması olabilir; doğrusu `left + (right - left) / 2`
- Döngü koşulu `left <= right` olmalı (tek elemanlı aralık atlanmasın)
- Daraltırken `mid ± 1` unutulursa sonsuz döngü

**Bu repoda:** BinarySearch · MedianTwoSortedArrays (ideal çözümü binary search'tür; repodaki versiyon eğitim amaçlı merge yaklaşımı)

## 6. Prefix / Suffix (Ön işleme)

**Ne zaman:** "Her indeks için sol tarafın X'i ve sağ tarafın Y'si" gerektiğinde. İki ek geçişle her sorgu O(1) olur.

**Fikir:** Soldan bir geçişte kümülatif değeri (toplam/çarpım) biriktir, sağdan ikinci geçişte birleştir.

**Bu repoda:** ProductOfArrayExceptSelf

## 7. Greedy (Açgözlü)

**Ne zaman:** Her adımda "yerel olarak en iyi" seçim, global optimuma götürüyorsa. Kritik soru: *bu seçim gelecekteki seçenekleri kısıtlıyor mu?* Kısıtlamıyorsa greedy güvenlidir.

**Örnek akıl yürütme (CanPlaceFlowers):** Çiçeği dikebileceğin ilk boşluğa dikmek hiçbir gelecekteki yerleştirmeyi engellemez → greedy doğru.

**Bu repoda:** BestTimeToBuyStock, CanPlaceFlowers, IncreasingTripletSubsequence

## 8. Matematik Hileleri

- **Gauss toplamı:** 0..n toplamı `n(n+1)/2` → eksik sayı = beklenen − gerçek (MissingNumber)
- **XOR:** `a ^ a = 0` özelliğiyle eksik/tek sayıyı O(1) alanda bul
- **Öklid algoritması:** `gcd(a, b) = gcd(b, a mod b)` → string EBOB'una uyarlanır (GcdOfStrings)

## 9. Sıralama + Tek Geçiş

**Ne zaman:** Problem "yakın/çakışan elemanları" ilgilendiriyorsa önce sıralamak işi basitleştirir; sıralama sonrası tek geçiş yeter.

**Bu repoda:** MergeIntervals (başlangıca göre sırala, çakışanları birleştir), ValidAnagram (sırala + karşılaştır)

## Karmaşıklık Hızlı Referans

| Notasyon | İsim | Tipik örnek |
|----------|------|-------------|
| O(1) | Sabit | Map/Set erişimi, aritmetik |
| O(log n) | Logaritmik | Binary search |
| O(n) | Doğrusal | Tek geçiş, sliding window, two pointers |
| O(n log n) | Linearitmik | Sıralama (`Arrays.sort`) |
| O(n²) | Karesel | İç içe döngü, bubble/selection sort |

**Pratik kural:** Çözümünde iç içe döngü görüyorsan kendine sor: *hash map, two pointers veya sliding window ile içteki döngüden kurtulabilir miyim?*
