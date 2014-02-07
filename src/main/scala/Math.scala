object Math {
	def add[T](a: T, b: T)(implicit num: Numeric[T]): T  = {
    import num._
    a + b
  }
	def mul[T](a: T, b: T)(implicit num: Numeric[T]): T  = {
    import num._
    a * b
  }
	def sub[T](a: T, b: T)(implicit num: Numeric[T]): T  = {
    import num._
    b - a
  }

  def +[T](a: T, b: T)(implicit num: Numeric[T]): T = add(a,b)
  def *[T](a: T, b: T)(implicit num: Numeric[T]): T = mul(a,b)
  def -[T](a: T, b: T)(implicit num: Numeric[T]): T = add(a,b)
}