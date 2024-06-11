# Projeto Agencia Bancária básico
> Criado por Leonardo Vizeu

www.dio.me

### Professor
- [Gleyson Sampaio](https://github.com/glysns)

## Desafio

Trilha de Back-end Java do Santander Bootcamp 2024!

### Diagrama UML Iphone

```
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    } 

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
