from flask import Flask, request,
from flask import redirect, make_response, render_template


app = Flask(__name__)

todos = ['TODO 1', 'TODO 2', 'TODO 3']


@app.route('/')
def index():
    # Esto es igual a la IP del usuario
    user_ip = request.remote_addr

    # Esto es la respuesta del servidor
    response = make_response(redirect('/hello'))

    # Esto crea una cookie con el valor de la IP del usuario
    # La cual llamaremos userip1
    response.set_cookie('user_ip1', user_ip)

    return response

# Este es un decorador de flask para establecer rutas


@app.route('/hello')
def hello():

    user_ip2 = request.cookies.get('user_ip1')

    context = {
        'user_IP': user_ip2,
        'todos': todos
    }

    return render_template('hello.html', **context)
