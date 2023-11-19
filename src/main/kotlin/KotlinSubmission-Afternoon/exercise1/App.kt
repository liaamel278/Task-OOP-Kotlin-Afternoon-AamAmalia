package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var namaDepan: String = "Aam"
    var namaBelakang: String = "Amalia"
    var umur: Int = 20
    var status: Boolean = true

    println("====== Profil Saya ======")
    println("Nama    : $namaDepan $namaBelakang\nUmur    : $umur\nStatus : ${if(status == true) "Mahasiswa" else "tidak"}")
    println("=========================\n")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    var detailGroupMember = StringBuilder()
    var result: String

    detailGroupMember.append("Group id : $groupId\n")
    detailGroupMember.append("Group Members:\n")
    for (member in groupMember) {
        detailGroupMember.append("- $member\n")
    }
    detailGroupMember.append("Session : $session")

    result = detailGroupMember.toString()

    return result
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    var listMyTeam = listOf("Unity Force","ahmadnidzhar", "andhika", "vionny", "aamamalia", "sarah","novi", "intan", "alfon", "arif", "rendy", "wahid")
    var myName = "Unity Force"
    val myNameFromList = listMyTeam.firstOrNull { it is String && it.equals(myName, ignoreCase = true) }
    return listOf(myNameFromList ?: "Nama anggota tidak ditemukan")
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>(
        "Mentor Raihan",
        "Mentor Fatih",
        "Mentor Jovian",
        "Mentor Reynaldi",
        "Mentor joy",
        "Mentor Hasan",
        "Mentor Desti")
    val countOfGroup = arrayOf<String>(
        "Aam Amalia",
        "Sarah Khoirunnisa",
        "Ahmad Nidzar",
        "Vionny ",
        "Novi",
        "Andhika",
        "Intan",
        "Wahid",
        "Arif",
        "Alfon",
        "Rendy"

    )

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    println("=========================")
    val myTeam = myTeam()
    println("My team is: $myTeam")
    println("=========================\n")

    println("=========================")
    val totalMember = totalMember()
    println("Total Member group : $totalMember")
    println("=========================\n")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val detailGroup = groupDetail("Unity Force", listOf("Aam Amalia",
        "Sarah Khoirunnisa",
        "Ahmad Nidzar",
        "Vionny ",
        "Novi",
        "Andhika",
        "Intan",
        "Wahid",
        "Arif",
        "Alfon",
        "Rendy"), "Mobile A Afternoon")
    println("=========================")
    println(detailGroup)
    println("=========================\n")

}