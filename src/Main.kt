import kotlin.system.exitProcess

fun main() {
    println("--------------------------------------------------")
    println("Olá professor(a), Bem vindo(a) ao CalMediaLP   ")
    println("--------------------------------------------------")
    digitarNotasAluno()

}

fun digitarNotasAluno(){
    var notaDoAlunoPrimeiro = DoubleArray (4)
    var  i : Int = 0

    for (i in notaDoAlunoPrimeiro.indices) {

        do {
            println("Por favor informe a ${i + 1} nota do aluno: ")
            notaDoAlunoPrimeiro[i] = readln().toDouble()

            if (notaDoAlunoPrimeiro[i] !in 0.0..10.0) {
                println("A nota deve ser entre 0 e 10")
            }
        } while (notaDoAlunoPrimeiro[i] !in 0.0..10.0)

    }
    calcularMedia(notaDoAlunoPrimeiro)
}

fun calcularMedia(notaDoAlunoSegundo: DoubleArray){
    var soma : Double = 0.0
    var media: Double

    notaDoAlunoSegundo.forEach() {i ->
        soma = soma + i
    }

    media = soma / 4
    println("-----------------------------")
    println("Média do aluno : $media")
    println("-----------------------------")
    menuSairOuCalculo()
}

fun about(){
    println("CalMediaLP  \n" +
            "criado em 20 de abril 2022\n" +
            "Versão: 1.0 \n" +
            "Desenvolvedor: Luiz Paulo Rodrigues.\n"+
            "Linguagem ultilizada: Kotlin")
    menuDeVolta()
}

fun menuDeVolta(){
    var digitaDois: Int
    println("\n1 - Volta / 2- Fechar o programa")
    digitaDois = readln().toInt()

    while (digitaDois != 1 && digitaDois !==2 ){
        println("O valor digitado está incorreto")
        println("Por favor digite novamente")
        println("\n 1 - Volta / 2- Fechar o programa")
        digitaDois = readln().toInt()
    }
    when(digitaDois){
        1 -> menuSairOuCalculo()
        2 -> {
            println("\nObrigado por utilizar o sitema!")
            exitProcess(0)
        }
    }
}
fun menuSairOuCalculo(){
    var digita: Int
    println("\nNovo cálculo (1- sim / 2- não/ 3- About)")
    digita = readln().toInt()

    while (digita != 1 && digita !==2 && digita !== 3){
        println("ATENÇÃO!")
        println("O valor digitado está incorreto")
        println("Por favor digite novamente")
        println("\nNovo cálculo (1- sim / 2- não/ 3- About)")
        digita = readln().toInt()
    }
    when(digita){
        1 -> digitarNotasAluno()
        2 -> {
            println("Obrigado por utilizar o sitema!")
            exitProcess(0)
        }
        3 -> about()
    }
}