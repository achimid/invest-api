# lo-invest-api

Essa API tem como objetivo agregar as informações publicas do mercado financeiro (FIIs, Ações, ETFs, REITs), coletadas automaticamente de sites como StatusInvest, Investidor10 e B3 e disponibilizar de uma forma estruturada e publica para acessar via API Rest.

O segundo objetivo é como forma de aprendizado para coficiação de projetos.

A API será criada utilizando Java, SpringBoot, Docker e outras tecnologias ainda não definidas.


----------------------------------------------
TODOs
----------------------------------------------

- Criar o projeto com spring initializer
- Install docker na maquina
- Criar docker compose file dentro do projeto
- Criar estruturas de pastas clean arquiteture
- Configurações conexoes com o banco
- Criar endpoints mencionados abaixo


----------------------------------------------
Planejamento dos Endpoints

```
GET - /api/v1/fiis/{ticker}
GET - /api/v1/fiagros/{ticker}
GET - /api/v1/fi-infra/{ticker}
GET - /api/v1/acoes/{ticker}
GET - /api/v1/stocks/{ticker}
GET - /api/v1/bdrs/{ticker}
GET - /api/v1/reits/{ticker}
GET - /api/v1/etfs/{ticker}

POST - /api/v1/injestion/event - Authenticado/Protegido

```

* Entender se a melhor estrategia é criar um enpoint/controller especifico para cada um dos tipos de informações (fiis, ações, stocks...) ou a possibilidade de criar um endpoint só que de forma dinamica retornar as informações.


----------------------------------------------

```
GET - /api/v1/fiis/{ticker}

Response:
{
    "indicators": {
        "value": 9.99,
        "min52Weeks": 9.82,
        "minMonth": 9.98,
        "max52Weeks": 10.68,
        "maxMonth": 10.09,
        "dyPercentage": 11.21,
        "dyLast12Months": 1.12,
        "appreciationYearPercentage": -5.84,
        "appreciationMonthPercentage": -5.84
    },
    "general": {},
    "financial": {},
    "portfolio": {},
    "announcements": {}
}
```
----------------------------------------------




