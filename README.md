# Merging-Algorithm

This Java program merges two input strings by interleaving their characters and then sorts the resulting string in lexicographical order. It starts by defining two strings, word1 and word2, and checks their lengths. If the strings are of equal length, they are directly merged using the LexoMerging method, which interleaves their characters one by one. If word1 is longer, it merges the initial segment of word1 (up to the length of word2) with word2, appends the remaining characters of word1 to the merged result, and then sorts it. Conversely, if word2 is longer, it merges word1 with the initial segment of word2, appends the remaining characters of word2, and sorts the final string. The Sorting method sorts the characters of the merged string in ascending order, ensuring the final output is a lexicographically ordered string. The program then prints this sorted, merged string.
