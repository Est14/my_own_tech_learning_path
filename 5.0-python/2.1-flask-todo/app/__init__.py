from flask import Flask
from flask_bootstrap import Bootstrap
from flask_wtf import CsrfProtect
from .config import Config


def create_app():
    app = Flask(__name__)
    bootstrap = Bootstrap(app)
    app.config.from_object(Config)
    csrf = CsrfProtect(app)

    return app
