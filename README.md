# grokking-algorithms
《算法图解》笔记及代码
# 第1章 算法简介
* **算法**时一组完成任务的指令。
## 二分查找
* [python代码](chaper01/../chapter01/binary-search.py)
* [Java代码](chapter01/binarySearch.java)
* 二分查找的运行时间为O(log n).
* 简单查找的运行时间为O(n).

# 第2章 选择排序
* 链表的每个元素都存储了下一个元素的地址，从而使一系列随机的内存地址串在一起。
* 链表的优势在插入元素方面。
* 需要随机地读取元素时，数组的效率很高。
* 当需要在中间插入元素时，链表是更好的选择。
* 如果要删除元素，链表是更好的选择，因为只需要修改前一个元素指向的地址即可。

## 选择排序
* [python代码](chapter02/selectionSort.py)
