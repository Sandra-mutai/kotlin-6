fun main() {
    var legs = Car("mordern","wish","grey",14)
    legs.carry(8)
    legs.identity()
    println(legs.calculateParkingFees(20))
    var hands = Bus( "modern","scania","yellow",72,1000.14)
    println(hands.maxTripFare(1000.14))
    println(hands.calculateParkingFees(3))



}
 open class Car(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry(people:Int){
        var x=(people-capacity)
        if (people<=capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity by $x people")
    }
        fun calculateParkingFees(hours:Int):Int {
        return hours * 20

    }
}
    fun identity (){
        println("i am a $colour $make $model")

    }
   open fun calculateParkingFees(hours:Int):Int {
        return hours * 20

    }
}
class Bus( make:String,model:String, colour:String,capacity:Int, fare:Double):Car(make, model, colour, capacity){
    fun maxTripFare(fare: Double):Double{
        return (fare * capacity)
    }
    override fun calculateParkingFees(hours: Int):Int{
        return capacity*hours
    }

}

