比设计模式更重要的是设计原则
https://www.jianshu.com/p/e378025920f8
SOLID  目的  复用，易于维护

单一职责（Single Responsibility Principle）：高内聚，低耦合，只有一个引起该类变化的原因，启动类 如通过物流单单号查询商品信息的逻辑中生成了出仓码

开放关闭原则（Open Closed Principle）：对扩展开放，对修改关闭，如ifelse策略模式

里氏替代原则（Liskov Substitution Principle）：简单来说，所有使用基类代码的地方，如果换成子类对象的时候还能够正常运行，则满足这个原则。

接口隔离原则（Interface Segregation Principle）：客户端不应该依赖它不需要实现的接口，不建立庞大臃肿的接口，应尽量细化接口，接口中的方法应该尽量少。

依赖倒置原则（Dependence Inversion Principle）：高层模块不应该依赖低层模块，两者都应该依赖其抽象，面向接口编程，如controller层依赖service层接口，service层实现类依赖service层接口，便于解耦。