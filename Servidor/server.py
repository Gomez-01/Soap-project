from spyne import Application
from spyne import rpc
from spyne import ServiceBase
from spyne import Double
from spyne.protocol.soap import Soap11
from spyne.server.wsgi import WsgiApplication

from wsgiref.simple_server import make_server


class ServicoFinanceiro(ServiceBase):

    @rpc(Double, Double, Double, _returns=Double)
    def calcularJurosSimples(ctx, capital, taxa, tempo):

        if capital <= 0:
            raise ValueError("Capital inválido")

        return capital + (capital * taxa * tempo)

    @rpc(Double, Double, Double, _returns=Double)
    def calcularJurosCompostos(ctx, capital, taxa, tempo):

        if capital <= 0:
            raise ValueError("Capital inválido")

        return capital * ((1 + taxa) ** tempo)


application = Application(
    [ServicoFinanceiro],
    tns='financeiro.soap',
    in_protocol=Soap11(),
    out_protocol=Soap11()
)

wsgi_app = WsgiApplication(application)

server = make_server(
    '127.0.0.1',
    8000,
    wsgi_app
)

print("Servidor iniciado")
print("http://localhost:8000/?wsdl")

server.serve_forever()