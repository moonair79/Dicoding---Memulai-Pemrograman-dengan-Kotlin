fun main(){
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    println(office)

    val officeOpen = 7
    val officeClosed = 16
    val now1 = 20

    val isOpen = now1 >= officeOpen && now1 <= officeClosed

    println("Office is open : $isOpen")

    val isClose = now1 < officeOpen || now1 > officeClosed

    println("Office is closed : $isClose")

    val now2 = 10
    val isOpen1 = now2 > officeOpen

    if (!isOpen1) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

}