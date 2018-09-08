package hello

object Hello {
    def main(args: Array[String]): Unit = {
        var person = new Person
        println(person.age)
        println(person.name)
        person.sayHello()

    }

    class Person {
        val name = "xuxiaofei"
        var age = 21

        def sayHello() = {
            println("hello")
        }
    }

}
