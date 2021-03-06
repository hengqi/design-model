# 观察者模式

## 定义  
* 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。
  这个主题对象在状态发生变化时，会通知所有观察者对象，让他们能自动更新自己
  
## 观察者模式的组成
* **抽象主题角色** ：把所有对观察者对象的引用保存在一个集合中，每个抽象主题角色都可以有任意数量的观察者。抽象主题提供了一个接口，可以增加和删除观察者角色。一般用一个抽象类或接口实现。
* **抽象观察者角色** ：为所有具体的观察者定义了一个接口，在得到主题的通知时更新自己。
* **具体主题角色** ：在具体主题角色内部状态发生改变时，给所有登记过的观察者发出通知。具体主题角色通常使用一个子类来实现。
* **具体观察者角色** ：该角色实现了抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。如果需要，具体观察者角色可以保持一个指向具体主题角色的引用。通常用一个子类实现