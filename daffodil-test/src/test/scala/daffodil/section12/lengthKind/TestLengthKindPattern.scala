package daffodil.section12.lengthKind

import junit.framework.Assert._
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import scala.xml._
import daffodil.xml.XMLUtils
import daffodil.xml.XMLUtils._
import daffodil.compiler.Compiler
import daffodil.util._
import daffodil.tdml.DFDLTestSuite
import java.io.File

class TestLengthKindPattern extends JUnitSuite {
  val testDir = "/daffodil/section12/lengthKind/"
  val aa = testDir + "PatternTests.tdml"
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(aa))
  
  @Test def test_AI000_rev() { runner.runOneTest("AI000_rev") }
  @Test def testLengthKindPattern() { runner.runOneTest("LengthKindPattern") }
  @Test def testLengthKindPatternCompound() { runner.runOneTest("LengthKindPatternCompound") }
  @Test def test_lengthKindPattern_01() { runner.runOneTest("lengthKindPattern_01") }
  @Test def test_lengthKindPattern_02() { runner.runOneTest("lengthKindPattern_02") }
  @Test def test_lengthKindPattern_03() { runner.runOneTest("lengthKindPattern_03") }
  
  val ai = testDir + "AI.tdml"
  lazy val runnerAI = new DFDLTestSuite(Misc.getRequiredResource(ai))

  @Test def test_AI000() { runnerAI.runOneTest("AI000") }

  }
