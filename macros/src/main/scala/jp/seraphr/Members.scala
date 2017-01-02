package jp.seraphr

import scala.language.experimental.macros
import scala.reflect.macros.whitebox.Context

/**
  */
object Members {
  def apply[A]: List[String] = macro macroImpl[A]

  def macroImpl[A: c.WeakTypeTag](c: Context): c.Tree = {
    import c.universe._
    val tType = weakTypeOf[A]
    val tMembers = tType.members.map(_.name.toString).toList

    q"${tMembers}"
  }
}