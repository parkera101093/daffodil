package daffodil.section17.calc_value_properties

import java.io.File
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import junit.framework.Assert._
import daffodil.xml.XMLUtils
import daffodil.xml.XMLUtils._
import scala.xml._
import daffodil.compiler.Compiler
import daffodil.tdml.DFDLTestSuite
import daffodil.util.LogLevel
import daffodil.util.LoggingDefaults
import daffodil.util.Misc
import daffodil.debugger.Debugger

class TestInputValueCalc extends JUnitSuite {
  val testDir = "/daffodil/section17/calc_value_properties/"
  val ar = testDir + "AR.tdml"
  lazy val runnerAR = new DFDLTestSuite(Misc.getRequiredResource(ar))

  @Test def test_AR000() { runnerAR.runOneTest("AR000") }
  
  val aq = testDir + "AQ.tdml"
  lazy val runnerAQ = new DFDLTestSuite(Misc.getRequiredResource(aq))

  @Test def test_AQ000() { runnerAQ.runOneTest("AQ000") }
  
  val aa = testDir + "AA.tdml"

  lazy val runnerAA = { new DFDLTestSuite(Misc.getRequiredResource(aa)) }
  
  @Test def test_AA000() { runnerAA.runOneTest("AA000") }
  @Test def test_inputValueCalcErrorDiagnostic1() { runnerAA.runOneTest("inputValueCalcErrorDiagnostic1")}
  @Test def test_inputValueCalcErrorDiagnostic2() { runnerAA.runOneTest("inputValueCalcErrorDiagnostic2")}
  @Test def test_inputValueCalcAbsolutePath() { runnerAA.runOneTest("inputValueCalcAbsolutePath")}
  
  val tdml = testDir + "inputValueCalc.tdml"

  lazy val runner = { new DFDLTestSuite(Misc.getRequiredResource(tdml)) }
  
  @Test def test_InputValueCalc_01() { runner.runOneTest("InputValueCalc_01")}
  @Test def test_InputValueCalc_02() { runner.runOneTest("InputValueCalc_02")}
  @Test def test_InputValueCalc_03() { runner.runOneTest("InputValueCalc_03")}
  @Test def test_InputValueCalc_04() { runner.runOneTest("InputValueCalc_04")}
  @Test def test_InputValueCalc_05() { runner.runOneTest("InputValueCalc_05")}
  @Test def test_InputValueCalc_06() { runner.runOneTest("InputValueCalc_06")}
}
