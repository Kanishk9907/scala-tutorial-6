object caesar{
     def encrypt(n:Int,mesg:String):Unit={

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val shift = (n.toInt + alphabet.size) % alphabet.size

	val inputText = mesg

	val outputText = inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});


	println(outputText);
     }

     def decrypt(m:Int,secr:String):Unit={

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val shift = (m.toInt + alphabet.size) % alphabet.size

	val inputText = secr

	val outputText = inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x - shift) % alphabet.size)
			} 
	});


	println(outputText);
     }


   def main(args:Array[String])
   {
       
           println("Enter the value to be shifted:")
           val n = scala.io.StdIn.readInt()
           println("Enter the secret message: ")
           val mesg=scala.io.StdIn.readLine()
           encrypt(n,mesg)
       
           println("Enter the value has shifted:")
           val m = scala.io.StdIn.readInt()
           println("Enter the secret message: ")
           val secr=scala.io.StdIn.readLine()
           decrypt(m,secr)
       
   }
}
