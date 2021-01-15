from flask import Flask
from flask_sqlalchemy import SQLAlchemy


def create_app():
    app = Flask()
    app.config['SQL_ALCHEMY_DATABASE_URI'] ='mysql+pymysql://root:password@localhost/flaskmysql'

    return app
