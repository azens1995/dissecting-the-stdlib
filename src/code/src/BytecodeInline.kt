
// region // Things you'll need for the next Five Nights
fun clockIn(location: String) = Unit
fun turnOnLights() = Unit
fun watchSecurityCamera() = Unit
fun closeDoors() = Unit
fun checkRemainingBattery(): Float = 0.5F
fun isFanRunning(): Boolean = true
fun waitItOut(seconds: Long) = Unit
fun clockOut(location: String) = Unit
// endregion





fun workShift(location: String, block: (String) -> Unit) {
  println("Shift start battery level: ${checkRemainingBattery()}")
  block(location)
  println("Shift end battery level: ${checkRemainingBattery()}")
}

fun main() {
  workShift("FNAF01") { location: String ->
    clockIn(location)
    closeDoors()
    watchSecurityCamera()
    turnOnLights()
    clockOut(location)
  }
}








// Also… non-local returns!