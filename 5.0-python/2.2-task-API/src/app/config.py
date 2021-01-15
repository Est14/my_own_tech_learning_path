class Config(object):
    SECRET_KEY = 'SiulNabetse'


class DevelomentComfig(Config):
    DEBUG = True
    SQLALCHEMY_DATABASE_URI = 'mysql+pymysql://root:root@localhost/flaskmysql'
    SQLALCHEMY_TRACK_MODIFICATIONS = False
