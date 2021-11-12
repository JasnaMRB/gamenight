package me.jasna

import eu.timepit.refined.api.Refined
import eu.timepit.refined.collection.NonEmpty
import eu.timepit.refined.numeric.Positive

package object gamenight {
  type StringNonEmpty = String Refined NonEmpty
  type IntPositive = Int Refined Positive
}
