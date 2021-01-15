from flask import Flask
from .config import DevelomentComfig


def create_app():
    app = Flask(__name__)
    app.config.from_object(DevelomentComfig)
    return app
