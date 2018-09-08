package hello.HelloScala

object Hello {
    def main(args: Array[String]): Unit = {
        var person = new Person
        println(person.name)
        println(person.age)
        val s = person.sayHello()
        println(s)

        var persons = new Persons("xuxiaofes",30)
        println(persons.name)
        println(persons.age)
    }


}

/**
  * 无参构造
  */
class Person {
    //val 定义常量
    val name = "xuxiaofei"
    //var 定义变量
    var age = 23

    //定义方法
    def sayHello(): String = {
        println("Hello scala")
        "Hello scala by sayhello return"
    }

}

class Persons(sname: String, sage: Int) {
    val name = sname
    var age: Int = sage
}
