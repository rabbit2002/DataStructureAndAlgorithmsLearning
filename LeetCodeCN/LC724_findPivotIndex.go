package lc

func pivotIndex(nums []int) int {
	total := 0
	for _, v := range nums {
		total += v
	}

	sum := 0
	for k, v := range nums {
		if sum*2+v == total {
			return k
		}
		sum += v
	}

	return -1
}
