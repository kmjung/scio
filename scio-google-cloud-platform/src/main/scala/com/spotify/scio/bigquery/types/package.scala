/*
 * Copyright 2019 Spotify AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.spotify.scio.bigquery

import org.typelevel.scalaccompat.annotation.nowarn

import scala.annotation.StaticAnnotation
package object types {

  /**
   * Case class field annotation for BigQuery field description.
   *
   * To be used with case class fields annotated with [[BigQueryType.toTable]], For example:
   *
   * {{{
   * @BigQueryType.toTable
   * case class User(@description("user name") name: String,
   *                 @description("user age") age: Int)
   * }}}
   */
  @nowarn
  final class description(value: String) extends StaticAnnotation with Serializable

  /**
   * Case class to serve as raw type for Geography instances to distinguish them from Strings.
   *
   * See also https://cloud.google.com/bigquery/docs/gis-data
   *
   * @param wkt
   *   Well Known Text formatted string that BigQuery displays for Geography
   */
  case class Geography(wkt: String)

  /**
   * Case class to serve as raw type for Json instances to distinguish them from Strings.
   *
   * See also https://cloud.google.com/bigquery/docs/json-data
   *
   * @param wkt
   *   Well Known Text formatted string that BigQuery displays for Json
   */
  case class Json(wkt: String)
}
