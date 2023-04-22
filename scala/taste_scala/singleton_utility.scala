//  `object` creates a Singleton object
//  defines a class that has exactly one instance

//  Utility methods: object's methods can be accessed like static mehtods

object StringUtils:
  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isNullOrEmpty
  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
  def rightTrim(s: String): String = s.replaceAll("\\s+$", "")

val x = StringUtils.isNullOrEmpty("")   //  true
val x = StringUtils.isNullOrEmpty("a")  //  false