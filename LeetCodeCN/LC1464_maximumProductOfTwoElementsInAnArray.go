package lc

import (
	"sort"
)

func maxProduct(nums []int) int {
	for index, value := range nums {
		nums[index] = value - 1
	}
	sort.Slice(nums, func(i, j int) bool {
		return nums[i] > nums[j]
	})

	return nums[0] * nums[1]
}
