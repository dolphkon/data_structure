经典例题解析

1.有关下述Java代码描述正确的选项是（）

    public class Main {
        public static void main(String [] args){
            ((Main)null).testMothod();
        }
        public static  void  testMothod(){
            System.out.println("testMethod");
        }
    }

答案：运行正常，输出testMethod

解析：静态方法是属于类的，静态方法在对象实例创建前就已经存在了，它的使用不依赖于对象是否被创建。当我们通过类的实例来调用时，最后实际上还是将对象实例转换成了类去掉用该静态方法，所以这里的null只是迷惑大家的跟它没有什么关系。

这里((TestClass)null).testMethod();也可以写成TestClass t = null; t.testMethod();同样可以正确输出。null可以被强制转换成任意类型对象，虽然这个时候t被赋为了空，但这个“空对象”也是属于TestClass的，那么这个“空对象”也就可以去堆上的静态方法区调用testMethod()方法了。

如果这里testMethod把static去掉，该testMethod方法就变成了实例对象的方法了。这时，可以编译通过，但是会报空指针。

同理，对于static变量也是一样的。比如TestClass 中有如下变量：private static String str = "abc"; 我们通过TestClass t = null; System.out.println(t.str);同样可以正确输出。
