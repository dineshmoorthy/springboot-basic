package org.com.example.exception

import org.apache.commons.lang3.StringUtils.EMPTY
import org.apache.commons.lang3.StringUtils.isEmpty
import play.api.http.Status.INTERNAL_SERVER_ERROR
import play.api.libs.json.JsValue

import scala.xml.dtd.EMPTY

/**
 * @author JainA
 *
 */
class TestRegistrationsException(status: Int = INTERNAL_SERVER_ERROR,
                                 errorType: String = EMPTY,
                                 message: String,
                                 cause: Option[Throwable] = None) extends RuntimeException(message, cause.orNull) {

  def getStatusValue: Int = status

  def getStatusCode: String = String.valueOf(status)

  def fetchErrorType: Option[String] = if (isEmpty(errorType)) None else Some(errorType)

}

case class ErrorNode(additionalInfo: Option[JsValue] = None,
                     code: Option[String] = None,
                     message: Option[String] = None)

object TestRegistrationsException {
  def apply(status: Int = INTERNAL_SERVER_ERROR,
            message: String,
            errorType: String = EMPTY,
            cause: Option[Throwable] = None): TestRegistrationsException = {
    new TestRegistrationsException(
      status = status,
      errorType = errorType,
      message = message,
      cause = cause)
  }
}

