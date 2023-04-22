//  syntax consistent with 'match' expressions
try
    writeTextToFile(text)
catch
    case ioe: IOException => println("Got an IOException.")
    case nfe: NumberFormatException => println("Got a NumberFormatException.")
finally
    println("Clean up your resource here.")