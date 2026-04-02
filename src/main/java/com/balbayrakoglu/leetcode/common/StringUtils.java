package com.balbayrakoglu.leetcode.common;

public final class StringUtils {

	private StringUtils() {
		// Utility class, prevent instantiation
	}

	public static void main(String[] args) {
		String text = "  hello world  ";
		String word = "deneme";
		String mixed = "Hello";
		String sentence = "the sky is blue";
		String csv = "a,b,c";
		String empty = "";
		String spaces = "   ";
		String numbers = "12345";
		String alphaNumeric = "abc123";

		System.out.println("=== BASIC STRING METHODS ===");

		System.out.println("word.length() => " + word.length());
		System.out.println("word.charAt(0) => " + word.charAt(0));
		System.out.println("word.substring(2) => " + word.substring(2));
		System.out.println("word.substring(1, 4) => " + word.substring(1, 4));

		System.out.println("\n=== COMPARISON METHODS ===");

		System.out.println("word.equals(\"deneme\") => " + word.equals("deneme"));
		System.out.println("mixed.equalsIgnoreCase(\"hello\") => " + mixed.equalsIgnoreCase("hello"));
		System.out.println("word.compareTo(\"deneme\") => " + word.compareTo("deneme"));
		System.out.println("word.compareTo(\"abc\") => " + word.compareTo("abc"));

		System.out.println("\n=== SEARCH METHODS ===");

		System.out.println("word.contains(\"ne\") => " + word.contains("ne"));
		System.out.println("word.startsWith(\"de\") => " + word.startsWith("de"));
		System.out.println("word.endsWith(\"me\") => " + word.endsWith("me"));
		System.out.println("word.indexOf('e') => " + word.indexOf('e'));
		System.out.println("word.lastIndexOf('e') => " + word.lastIndexOf('e'));

		System.out.println("\n=== EMPTY / BLANK-LIKE CASES ===");

		System.out.println("empty.isEmpty() => " + empty.isEmpty());
		System.out.println("spaces.isBlank() => " + spaces.isBlank());

		System.out.println("\n=== CASE CONVERSION ===");

		System.out.println("mixed.toLowerCase() => " + mixed.toLowerCase());
		System.out.println("mixed.toUpperCase() => " + mixed.toUpperCase());

		System.out.println("\n=== TRIM / STRIP ===");

		System.out.println("text => [" + text + "]");
		System.out.println("text.trim() => [" + text.trim() + "]");
		System.out.println("text.strip() => [" + text.strip() + "]");
		System.out.println("\"   hi\".stripLeading() => [" + "   hi".stripLeading() + "]");
		System.out.println("\"hi   \".stripTrailing() => [" + "hi   ".stripTrailing() + "]");

		System.out.println("\n=== REPLACE METHODS ===");

		System.out.println("word.replace('e', 'a') => " + word.replace('e', 'a'));
		System.out.println("word.replace(\"ne\", \"XX\") => " + word.replace("ne", "XX"));
		System.out.println("\"a  b   c\".replaceAll(\"\\\\s+\", \"-\") => " + "a  b   c".replaceAll("\\s+", "-"));
		System.out.println("\"abc123\".replaceAll(\"\\\\d\", \"*\") => " + alphaNumeric.replaceAll("\\d", "*"));

		System.out.println("\n=== SPLIT ===");

		String[] parts1 = sentence.split(" ");
		System.out.println("sentence.split(\" \").length => " + parts1.length);
		for (int i = 0; i < parts1.length; i++) {
			System.out.println("part[" + i + "] => " + parts1[i]);
		}

		String[] parts2 = csv.split(",");
		System.out.println("csv.split(\",\").length => " + parts2.length);
		for (int i = 0; i < parts2.length; i++) {
			System.out.println("csv part[" + i + "] => " + parts2[i]);
		}

		System.out.println("\n=== ARRAY / CHAR METHODS ===");

		char[] chars = word.toCharArray();
		System.out.println("word.toCharArray().length => " + chars.length);
		for (int i = 0; i < chars.length; i++) {
			System.out.println("chars[" + i + "] => " + chars[i]);
		}

		System.out.println("\n=== REPEAT ===");

		System.out.println("word.repeat(2) => " + word.repeat(2));
		System.out.println("\"-\".repeat(10) => " + "-".repeat(10));

		System.out.println("\n=== VALUE CONVERSION ===");

		System.out.println("String.valueOf(123) => " + String.valueOf(123));
		System.out.println("String.valueOf(true) => " + String.valueOf(true));
		System.out.println("String.valueOf('A') => " + String.valueOf('A'));

		System.out.println("\n=== MATCHES (REGEX) ===");

		System.out.println("numbers.matches(\"\\\\d+\") => " + numbers.matches("\\d+"));
		System.out.println("word.matches(\"[a-zA-Z]+\") => " + word.matches("[a-zA-Z]+"));
		System.out.println("alphaNumeric.matches(\"[a-zA-Z0-9]+\") => " + alphaNumeric.matches("[a-zA-Z0-9]+"));

		System.out.println("\n=== OPTIONAL USEFUL METHODS ===");

		System.out.println("word.concat(\" test\") => " + word.concat(" test"));
		System.out.println("\"\".isEmpty() => " + "".isEmpty());
		System.out.println("\"abc\".intern() == \"abc\" => " + ("abc".intern() == "abc"));
	}
}