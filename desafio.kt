// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Aluno(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao (val nome: String, val conteudos: List<ConteudoEducacional>) {
    val nivel: Nivel = gerarNivelAleatorio()
    val alunosMatriculados = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        alunosMatriculados.add(aluno)
    }

    private fun gerarNivelAleatorio(): Nivel {
        val valoresNiveis = Nivel.values()
        val indiceAleatorio = Random.nextInt(valoresNiveis.size)
        return valoresNiveis[indiceAleatorio]
    }
}

fun main() {
    // Cria objetos de ConteudoEducacional
    val conteudo1 = ConteudoEducacional("Kotlin")
    val conteudo2 = ConteudoEducacional("Git")
    val conteudo2 = ConteudoEducacional("Lógica de Programação")


    // Cria formação e adiciona conteudos
    val formacao = Formacao("Desenvolvimento Android", listOf(conteudo1, conteudo2, conteudo3))

    // Cria alunos
    val aluno1 = Aluno("Lorem")
    val aluno2 = Aluno("Ipsum")
    val aluno3 = Aluno("Dolor")


    // Matricula alunos na formação
    formacao.matricular(aluno1)
    formacao.matricular(aluno2)
    formacao.matricular(aluno3)

    // Verifica alunos matriculados na formação
    println("Alunos matriculados na formação ${formacao.nome} de nível ${formacao.nivel}:")
    for (aluno in formacao.alunosMatriculados) {
        println(aluno.nome)
    }
}
