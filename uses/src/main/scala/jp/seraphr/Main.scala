package jp.seraphr

case class Foo(a: Int, b: Long = 20, c: String = "aaa")

object Main extends App {
  val tFooMembers = Members[Foo]
  val tBarMembers = Members[Bar]
  val tFooCompanionMembers = Members[Foo.type]
  val tBarCompanionMembers = Members[Bar.type]
  val tBazMembers = Members[Baz]
  val tQuxMembers = Members[Qux]
  val tBazCompanionMembers = Members[Baz.type]
  val tQuxCompanionMembers = Members[Qux.type]
//
//  println(tFooMembers.size)
//  println(tFooMembers)
//  println(tBarMembers.size)
//  println(tBarMembers)
//  println(tBazMembers.size)
//  println(tBazMembers)
//  println(tQuxMembers.size)
//  println(tQuxMembers)

  println(s"Foo diff Bar = ${tFooMembers diff tBarMembers}")
  println(s"Bar diff Foo = ${tBarMembers diff tFooMembers}")
  println(s"FooCompanion diff BarCompanion = ${tFooCompanionMembers diff tBarCompanionMembers}")
  println(s"BarCompanion diff FooCompanion = ${tBarCompanionMembers diff tFooCompanionMembers}")

  println(s"Baz diff Qux = ${tBazMembers diff tQuxMembers}")
  println(s"Qux diff Baz = ${tQuxMembers diff tBazMembers}")
  println(s"BazCompanion diff QuxCompanion = ${tBazCompanionMembers diff tQuxCompanionMembers}")
  println(s"QuxCompanion diff BazCompanion = ${tQuxCompanionMembers diff tBazCompanionMembers}")
}

case class Bar(a: Int, b: Long = 20, c: String = "aaa")