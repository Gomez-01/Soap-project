# Soap Project

Projeto simples de uma API SOAP em Python para cálculo de juros simples e compostos, usando [Spyne](http://spyne.io/).

## Estrutura

- `requirements.txt`: dependências do projeto.
- `soap-api/server.py`: servidor SOAP com os serviços de cálculo.

## Requisitos

- Python 3.12 ou compatível com o ambiente virtual do projeto.
- `pip` instalado.

## Instalação

No Windows, abra o terminal na raiz do projeto e execute:

```powershell
python -m venv venv
venv\Scripts\activate
pip install -r requirements.txt
```

Se o ambiente virtual já existir, basta ativá-lo e instalar as dependências:

```powershell
venv\Scripts\activate
pip install -r requirements.txt
```

## Execução

Inicie o servidor com:

```powershell
python soap-api\server.py
```

Depois disso, o serviço ficará disponível em:

```text
http://localhost:8000/?wsdl
```

## Serviços disponíveis

O projeto expõe dois métodos SOAP:

- `calcularJurosSimples(capital, taxa, tempo)`
- `calcularJurosCompostos(capital, taxa, tempo)`

Ambos validam se os valores informados são maiores que zero e retornam erro SOAP quando a entrada é inválida.

## Exemplo de uso

Exemplo de parâmetros:

- Capital: `1000`
- Taxa: `0.05`
- Tempo: `12`

Resultado esperado:

- Juros simples: `capital + (capital * taxa * tempo)`
- Juros compostos: `capital * ((1 + taxa) ** tempo)`

## Observações

- A taxa deve ser informada em formato decimal, por exemplo `0.05` para 5%.
- O servidor usa `127.0.0.1:8000` por padrão.