# P0 2048

## Introduction

* Get familiar with java and tools
* Complish Model.java's four methods
* Spec——Style Guide


## Game

* GUI, key-presses and other scaffolding has been put


MergeRules

* two squares of same value merge into one square which has double the initial number
* the resule of a merge will not merge again
* three adjacent squares in the direction of motion have the same number,then the leading two squares in the direction of motion will be merged
* When merge,update score
* After game is over , update the max score


## Assignment && Program
> work with codebases that don't fully understand

MVC pattern
> Model-View-Controller Pattern

Observer pattern
> Advanced

### Tile Class
> Represents numbered tiles on the borad
* if the variable of type Tile is null -> Needn't create

Value()   ->    Returns the value of the given tile




### Side Class
> Enum type of class

Set the side obj's value rather than using new keyword
`Side s = Side.NORTH`

### Model Class  
> Repersents the state of the game

* Where tile obj in
* score

### Board Class
> Board itself

three methods



## Ready for start 

### git

### Idea



## Assignment
> Modify and complete the Model class

### emptySpaceExists
> 要求留有至少一个空白格子则返回真 否则返回假

Board类中的tile方法可以返回(col,row)的对象Tile 如果tile为空 则为Null
利用双循环遍历格子 尝试判定是否有空白格子

### maxTileExists
> 判定是否有板子值为2048

tile()方法返回的对象可以用.value()方法查询板子上的值 遍历一遍后 如果为2048则返回true

### atLeastOneMoveExists
> 存在有效的移动则返回true
> 有效移动即导致游戏发生变化的操作

有效移动的条件
* 板子上至少有一个空位
* 两个相邻的瓦片有相同的值

首先emptyspaceexists方法判定是否有空格子 有则返回真
双循环遍历板子 向右向下查两次 有相同的则返回真
时间复杂度..


## Main Task----Game logic

### tilt 倾斜方法

> 移动所有的瓦片
> 更新评分
> 如果有变化1修改局部变量changed

只考虑向上的方向
对于输入的其他方向 使用函数转换为向上的方向

实现方法
* 如果从下向上 上面的空格为空 则该块可以向上移动
* 行迭代时 从上向下迭代最为安全
* 确定瓦片最终应该放在那里
* 