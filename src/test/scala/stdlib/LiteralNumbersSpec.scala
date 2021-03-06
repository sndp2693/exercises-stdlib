/*
 *  scala-exercises - exercises-stdlib
 *  Copyright (C) 2015-2019 47 Degrees, LLC. <http://www.47deg.com>
 *
 */

package stdlib

import org.scalacheck.ScalacheckShapeless._
import org.scalaexercises.Test
import org.scalatest.refspec.RefSpec
import org.scalatestplus.scalacheck.Checkers
import shapeless.HNil

class LiteralNumbersSpec extends RefSpec with Checkers {
  def `integer literals` = {
    check(
      Test.testSuccess(
        LiteralNumbers.integerLiteralsLiteralNumbers _,
        2 :: 31 :: 783 :: 0 :: -2 :: -31 :: -783 :: HNil
      )
    )
  }

  def `long literals` = {
    check(
      Test.testSuccess(
        LiteralNumbers.longLiteralsLiteralNumbers _,
        2L :: 31L :: 783L :: 0L :: -2L :: -31L :: -783L :: HNil
      )
    )
  }

  def `float literals` = {
    check(
      Test.testSuccess(
        LiteralNumbers.floatsAndDoublesLiteralNumbers _,
        3D :: 3D :: 2.73D :: 3D :: 3.22D :: 93e-9 :: 93E-9 :: 0D :: 9.23E-9 :: HNil
      )
    )
  }
}
