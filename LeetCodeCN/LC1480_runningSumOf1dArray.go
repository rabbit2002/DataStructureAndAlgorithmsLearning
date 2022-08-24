package lc

func runningSum(nums []int) []int {
	sum := 0
	var array = make([]int, 0)
	for _, value := range nums {
		sum += value
		array = append(array, sum)
	}

	return array
}
