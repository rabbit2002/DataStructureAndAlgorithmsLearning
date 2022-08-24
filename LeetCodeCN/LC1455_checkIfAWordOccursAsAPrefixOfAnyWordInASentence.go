package lc

import "strings"

func isPrefixOfWord(sentence string, searchWord string) int {
	arrays := strings.Split(sentence, " ")
	for index, v := range arrays {
		if strings.Index(v, searchWord) == 0 {
			return index + 1
		}
	}
	return -1
}
