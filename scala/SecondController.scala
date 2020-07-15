package org.com.example

import javax.inject.Inject
import org.apache.commons.logging.Log
import org.com.example.exception.{AppExceptionLog, TestRegistrationsException}
import org.com.example.service.impl.TestRegistrationsServiceImpl
import play.api.libs.json._
import play.api.mvc.{AbstractController, Action, ControllerComponents, Result}

class SecondController @Inject() (testRegistrationsService: TestRegistrationsServiceImpl)
                                 (cc: ControllerComponents) extends AbstractController(cc) {

  def upsertAppEvent(registrationId: Int): Action[JsValue] = Action(parse.json) {
    implicit request =>

      val payload = request.body
      //Log.info("method=upsertAppEvent, payload=" + Json.prettyPrint(payload))

      try {

        val validationResult = (payload \ "first").validate[AppExceptionLog]

        if (validationResult.isError) {
          throw TestRegistrationsException(status = BAD_REQUEST, message = Json.stringify(JsError.toJson(validationResult.asEither.left.get)),
            errorType = "ValidationError")
        }

        val reg = testRegistrationsService.getRegistrationById(registrationId)

        if (!"R".equalsIgnoreCase(reg.toString)) {
          throw TestRegistrationsException(status = BAD_REQUEST, message = "cannot update registration with status: " + reg.toString)
        }


       // handleSuccessResponse(ServiceResponse.apply(code = OK))A
      } /*catch {
        case tRegEx: TestRegistrationsException => {
          Log.error(s"method=upsertAppEvent, regId=$registrationId", tRegEx)
       //   handleTestRegistrationExceptionResponse(tRegEx)
        }
        case ex: Exception => {
          Log.error(s"method=upsertAppEvent, regId=$registrationId", ex)
       //   handleUnknownExceptionResponse(ex)
        }
      }*/
  }

}