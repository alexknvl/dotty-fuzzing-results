// TEST-KEY       = NSEE-7a8676dc28cf6051c2961e49d3892aeb518912e4
// STANDALONE-KEY = NSEE-7a8676dc28cf6051c2961e49d3892aeb518912e4

 object x0 
  {
    trait x1 {
      type x2[_, _]
      type x3[_]
      type x4[_]

      trait x5 
        type x6 = x2[x3[Int], x4[Int]]
        def x7[x2[_]]: x2[x6]
      

      val x8: x5
    }
    val x9: x1 = new x1 {
      type x2[x10[_]] = Int

      val x8: x5 = new x5 
        // type x6 = Int
        def x7[x2[_]](x11: x2[Int]): x2[x6] = x11
      
    }
  }
 