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



## Start 
