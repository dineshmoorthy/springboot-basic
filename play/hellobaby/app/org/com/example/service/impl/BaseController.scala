package org.com.example.service.impl
import scala.concurrent.ExecutionContext.Implicits.global

import org.apache.commons.lang3.StringUtils

import javax.inject.Inject
import play.api.libs.json._
import play.api.mvc.{AbstractController, ControllerComponents, Result}

class BaseController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
}