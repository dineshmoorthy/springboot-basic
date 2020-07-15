package org.com.example.exception


import java.time.LocalDateTime
import play.api.libs.functional.syntax._
import play.api.libs.json._

case class AppExceptionLog(
                            id: Option[Int],
                            registrationId: Option[Int],
                            iamId: Option[String],
                            module: Option[String],
                            msg: String,
                            eventDt: Option[LocalDateTime],
                            stackTrace: Option[String],
                            createdBy: String,
                            createdDt: LocalDateTime)

object AppExceptionLog {
  implicit val appExceptionLogFormats: Format[AppExceptionLog] = (
    (__ \ "id").formatNullable[Int] and
      (__ \ "registration_id").formatNullable[Int] and
      (__ \ "iam_id").formatNullable[String] and
      (__ \ "module").formatNullable[String] and
      (__ \ "msg").format[String] and
      (__ \ "event_dt").formatNullable[LocalDateTime] and
      (__ \ "stack_trace").formatNullable[String] and
      (__ \ "created_by").format[String] and
      (__ \ "created_dt").format[LocalDateTime]
    )(AppExceptionLog.apply _, unlift(AppExceptionLog.unapply _))
}