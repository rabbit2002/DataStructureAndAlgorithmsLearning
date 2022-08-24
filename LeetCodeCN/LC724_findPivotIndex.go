package main

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

func main() {
	println(pivotIndex([]int{1, 7, 3, 6, 5, 6}))
}
