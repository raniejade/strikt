package strikt.api.reporting

import strikt.api.Status.Failed
import strikt.api.Status.Passed
import strikt.api.Status.Pending

internal open class DefaultResultWriter : ResultWriter {
  override fun writeTo(writer: Appendable, result: Reportable) {
    writeIndented(writer, result)
  }

  private fun writeIndented(writer: Appendable, result: Reportable, indent: Int = 0) {
    writeLine(writer, result, indent)
    result.results.forEach {
      writeIndented(writer, it, indent + 1)
    }
  }

  protected open fun writeLine(writer: Appendable, result: Reportable, indent: Int) {
    when (result) {
      is Subject<*> -> result.writeSubject(writer, indent)
      is Result -> result.writeResult(writer, indent)
    }
  }

  private fun Subject<*>.writeSubject(writer: Appendable, indent: Int) {
    writeLineStart(writer, this, indent)
    writeSubjectIcon(writer)
    writer.append(description.format(formatValue(value)))
    writeLineEnd(writer, this)
  }

  private fun Result.writeResult(writer: Appendable, indent: Int) {
    writeLineStart(writer, this, indent)
    writeStatusIcon(writer, this)
    writer.append(description.format(formatValue(expected), formatValue(actual)))
    writeLineEnd(writer, this)
  }

  protected open fun writeLineStart(writer: Appendable, node: Reportable, indent: Int) {
    writer.append("".padStart(2 * indent))
  }

  protected open fun writeLineEnd(writer: Appendable, node: Reportable) {
    writer.append("\n")
  }

  protected open fun writeStatusIcon(writer: Appendable, node: Result) {
    writer.append(when (node.status) {
      Passed -> "✓ "
      Failed -> "✗ "
      Pending -> "? "
    })
  }

  protected open fun writeSubjectIcon(writer: Appendable) {
    writer.append("▼ ")
  }
}