# 饿汉式（静态代码块）

步骤：

1. 构造器私有化，用于防止new
2. 静态代码块中将类实例化
3. 向外暴露一个静态公共方法：getInstance()

优缺点和静态变量方式一样：

1. 写法简单，在类装载时完成实例化，避免了多线程同步问题
2. 类装载时完成实例化，没有用懒加载。类装载的原因有很多，无法保存实例是在首次使用时被创建。如果从始至终都没有使用过这个实现的话，会造成内存浪费
3. 结论：可以使用，但会造成内存浪费