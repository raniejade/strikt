package strikt

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import strikt.api.expect
import strikt.assertions.isA
import strikt.assertions.isNotNull
import strikt.assertions.isNull

internal object Block : Spek({
  describe("assertions in blocks") {
    it("evaluates all assertions in the block even if some fail") {
      fails {
        val subject: Any? = "covfefe"
        expect(subject) {
          isNull()
          isNotNull()
          isA<String>()
          isA<Number>()
        }
      }
    }
  }
})
