fun main (){

    var name = -8

    if(name > 1) {
        println("Positive")
    }else if(name < 0){
        println("Negative")
    }else{
//        println("0")
    }

     var math = 60
     var eng = 6

    if(math % eng ==0){
        println("Even")
    }else{
//        println("Odd")
    }

    var maths = 60
    var phyc = 55
    var chem = 40
    var bio = 50

    var sum = maths + phyc + chem + bio
    var mean = sum / 4

    if (mean>=80 and 100){
        println("A")
    }else if (mean>=60 and 80){
        println("B")
    }else if (mean>=40 and 60){
        println("C")
    }else if(mean>=0 and 40){
        println("D")
    }else{
        println("Error")
    }
//    println(mean)


//while loop
    var grade = 99

    while (grade < 100){
        println(grade)
        grade++
    }




}



