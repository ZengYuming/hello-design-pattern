# hello-design-pattern
设计模式学习笔记

## 设计原则
### 职责单一原则
### 开放-封闭原则
### 依赖倒转原则
高层模块不依赖底层模块，两个模块都应该依赖抽象。抽象不依赖细节，细节依赖抽象。针对接口编程，不要针对实现编程
### 里氏代换原则
子类型必须能够替换掉它们的父类型。
### 迪米特法则
也叫最少知识原则。公司电脑坏了，是找IT部还是IT部的某个人？如果那个人不在怎么办？ 如果两个类不必彼此直接通信，那么这两个类就不应当发生直接关系。如果其中一个类需要调用另一个类的方法，可以通过第三者转发这个调用。
强调松耦合

## 设计模式
### simple-factory 简单工厂模式
在工厂类中用switch分支生成对象
优点：工厂类中包含了判断逻辑，根据客户端选择动态实例化相关的类，去除了与具体产品的依赖。
### strategy 策略模式
它定义了算法家族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化，不会影响到使用算法的客户。
所有算法都是完成相同的工作，只是各个算法的实现不同，外部可以用相同的方式调用所有的算法，减少了算法类和使用算法类之间的耦合。
如果需要在不同时间应用不同的业务规则，就可以考虑使用策略模式来处理这种变化。
### decorator 装饰模式
为已有功能（或对象）添加更多功能的一种方式。它吧每个要装饰的功能放在单独的类中，并让这个类包装它所要装饰的对象，客户端可以根据需要有选择的，按顺序的使用装饰功能包装对象。
优点：把装饰功能从类中分离，使核心职责得到独立。
### proxy 代理模式
为其他对象提供一种代理以控制对这个对象的访问。
### factory-method 工厂方法模式
定义了一个用于创建对象的接口，让子类决定实例化哪一个类。使类实例化延迟到其子类。
### prototype 原型模式
用原型实例指定创建对象的种类。让一个原型克隆自身从而创建一个新的对象。
从一个对象再创建另外一个可定制的对象，而且不需知道任何创建的细节。
原型模型的浅复制，相当于Clone，只复制（被复制对象的第一层）结构和数据，不复制对象的（第二层）属性对象的数据
原型模型的深复制，相当于Copy，结构和数据都复制。
### template 模版方法模式
定义一个操作中的算法骨架，而组成骨架的一个一个具体算法将延迟到子类中实现。模版模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
就像试卷一样，之前没有印刷机的时候，是同学们自己抄老师出的考题然后作答的。这样容易出错，后来有了印刷机，就只要写一个试卷模版，然后拿去印刷，发给同学们，这就是模版模式。
当我们要完成在某一细节层次一致的一个过程或一系列步骤，但其个别步骤在更详细的层次上的实现可能不同时，可以使用模版模式。
模版方法模式是通过把不变行为搬移到超类，去除子类中的重复代码来体现它的优势。
当不变和可变行为在方法的子类实现中混合在一起时，不变行为就会在子类中重复出现。通过模版方法模型把这些行为搬到单一的地方，这样就帮助子类摆脱重复的不变行为的纠缠。
### facade 外观模式
为子系统中的一组接口提供一个一致的接口，此模式定义了一个高层接口，这个接口使子系统更加容易使用。
在设计初期，可以有意识的用外观模式进行架构分层，比如经典的三层模型就是用外观模式。
在开放阶段，重构带来的复杂度，可以用外观模式提供一个简单接口，以减少外部调用的复杂度。
在维护阶段，遗留系统可能难维护和扩展，用外观模式和遗留代码交互所有复杂工作。
### builder 建造者模式（生成器模式）
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
如果需要将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示，可以使用建造者模式。
建造者模式需要一个指挥者类，用于封装建造者的构建过程（步骤调用），这个构建过程通常是稳定的。
何时使用？当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时适用的模式。
### 观察者模式










