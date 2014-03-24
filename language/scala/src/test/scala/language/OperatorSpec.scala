package language

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith


// http://www.tutorialspoint.com/scala/scala_basic_syntax.htm
@RunWith(classOf[JUnitRunner])
class OperatorSpec extends FlatSpec {

  "Scala" should "allow alphanumeric identifiers" in {
    val a = 0
    val apple = 0
    val apple1 = 0
    val apple_1__ = 0
  }

  it should "allow literal identifiers" in {
    val `apple` = 0
    val `-apple` = 0
    val `class` = 0
  }

  it should "allow operator identifiers" in {
    val + = 0
    val ++ = 0
    val - = 0
    val --- = 0

    val ! = 0
    val $ = 0
    val % = 0
    val ^ = 0
    val & = 0
    val * = 0

    val ::: = 0
  }

  it should "allow mixed identifiers" in {
    val apple_@ = 0
    val apple_# = 0
  }


}
