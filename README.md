# 💰 Currency Converter App

##### Um aplicativo Android desenvolvido em Kotlin que realiza a conversão de moedas em tempo real, consumindo dados de uma API REST através da biblioteca Retrofit.
##### O objetivo principal é demonstrar a arquitetura de serviços do Android, utilizando tanto Started Services quanto Bound Services, além de comunicação reativa com LiveData.

##### Este projeto foi criado para fins acadêmicos no contexto da disciplina D2DA2 - Des. Android 2, com foco em:

- Consumo de APIs REST com Retrofit (Call/Execute)
- Implementação de Started Service para busca assíncrona da lista de moedas
- Implementação de Bound Service para processamento de conversão sob demanda
- Uso de LiveData para atualização automática e reativa da interface do usuário (UI)
- Gerenciamento de concorrência com HandlerThread e Handler dentro dos Serviços
- Uso de ViewBinding para manipulação segura da interface e componentes Material Design


## 🚀 Funcionalidades

##### ✔️ Listagem Dinâmica de Moedas: Busca as moedas disponíveis e seus códigos diretamente da API.
##### ✔️ Seleção com AutoComplete: Interface intuitiva usando Material AutoCompleteTextView para escolher as moedas de origem e destino.
##### ✔️ Conversão em Segundo Plano: O cálculo e a requisição de conversão são processados por um serviço vinculado (Bound Service).
##### ✔️ UI Reativa: A interface observa as mudanças nos objetos LiveData e se atualiza instantaneamente assim que os dados chegam da rede.
##### ✔️ Gerenciamento de Ciclo de Vida: Vinculação (bind) e desvinculação (unbind) inteligente de serviços para otimização de recursos.
##### ✔️ Feedback de Resultado: Exibição instantânea do valor convertido no campo de resultado via Observer.


## 🛠 Tecnologias Utilizadas
- Kotlin — Linguagem principal
- Android Studio — IDE de desenvolvimento
- ViewBinding — Acesso seguro aos elementos de UI
- Retrofit — Cliente HTTP para consumo de APIs REST
- Gson — Conversão de JSON para objetos de dados (POJOs)
- LiveData — Componente de arquitetura para observação de dados
- Services (Started & Bound) — Execução de tarefas em background e comunicação entre componentes
- Material Design — Componentes de interface como Toolbar, TextInput e Widgets



## ▶️ Como Executar o Projeto

##### 1. Clone este repositório:
###### git clone https://github.com/MADS1974/CurrencyConverter.git
##### 2. Abra o projeto no Android Studio.
##### 3. Aguarde a sincronização do Gradle.
##### 4. Certifique-se de que o dispositivo/emulador tenha acesso à Internet.
##### 5. Execute o app.


#### 📚 Créditos

##### Projeto acadêmico desenvolvido para a disciplina Desenvolvimento para Android 2 – D2DA2, ministrada pelo professor Pedro Northon Nobile (IFSP).

#### 🙋‍♂️ Autor Márcio Adriano

##### 🔗 Conecte-se comigo:
##### LinkedIn - Márcio Adriano
