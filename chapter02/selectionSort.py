# 选择排序

# 找出数组中最小的元素
def findSmallest (arr):
	smallest = arr[0]
	smallest_index = 0
	for i in range(1, len(arr)):
		if arr[i] < smallest:
			smallest = arr[i]
			smallest_index = i
	return smallest_index

# 对数组进行排序
def selectionSort(arr):
	newArr = []
	for i in range(len(arr)):
		smallest = findSmallest(arr)
		newArr.append(arr.pop(smallest))
	return newArr

print(selectionSort([5, 3, 6, 2, 10]))