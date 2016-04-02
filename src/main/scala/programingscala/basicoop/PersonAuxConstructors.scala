package programingscala.basicoop

/**
  * PersonAuxConstructors
  *
  * Author: Noprom <tyee.noprom@qq.com>
  * Date: 16/3/17 下午10:35.
  */
case class Address(street: String, city: String, state: String, zip: String) {
  def this(zip: String) = //
    this("[unknown]", Address.zipToCity(zip), Address.zipToState(zip), zip)
}

class Address {
  def zipToCity(zip: String) = "Anytown"

  def zipToState(zip: String) = "CA"
}

case class Person(name: String, age: Option[Int], address: Option[Address]) {

  def this(name: String) = this(name, None, None)

  def this(name: String, age: Int) = this(name, Some(age), None)

  def this(name: String, age: Int, address: Address) = this(name, Some(age), Some(address))

  def this(name: String, address: Address) = this(name, None, Some(address))
}

object App {
  def main(args: Array[String]) {
    val a1 = new Address("1 Scala Lane", "Anytown", "CA", "98765")
    // Result: Address(1 Scala Lane,Anytown,CA,98765)
    val a2 = new Address("98765")
    // Result: Address([unknown],Anytown,CA,98765)
    new Person("Buck Trends1")
    // Result: Person(Buck Trends1,None,None)
    new Person("Buck Trends2", Some(20), Some(a1))
    // Result: Person(Buck Trends2,Some(20),
    // Some(Address(1 Scala Lane,Anytown,CA,98765)))
    new Person("Buck Trends3", 20, a2)
    // Result: Person(Buck Trends3,Some(20),
    // Some(Address([unknown],Anytown,CA,98765)))
    new Person("Buck Trends4", 20)
    // Result: Person(Buck Trends4,Some(20),None)
  }
}