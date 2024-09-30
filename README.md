# lo-invest-api

==============================================
Tasks
==============================================

- criar o projeto com spring initializer
- install docker
- criar docker compose dentro do projeto
- criar estruturas de pastas clean arquiteture
- configurações conexoes com o banco
- criar end point fiis
- criar os testes integração



==============================================
Endpoint de informações de Fundos Imobiliários
==============================================
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

==============================================




