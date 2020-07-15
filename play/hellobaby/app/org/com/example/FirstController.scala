package org.com.example
import javax.inject.{Inject, Singleton}
import play.api.Configuration
import play.api.libs.json.Json
import play.api.mvc.{BaseController, ControllerComponents}
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class FirstController @Inject() (appConfig: Configuration)(cc: ControllerComponents) extends BaseController
{

  def index = Action {
    Ok(Json.toJson(s"""act-services-test-registrations version ${appConfig.get[String]("version")} application is ready."""))
  }

  override protected def controllerComponents: ControllerComponents = ???
}
