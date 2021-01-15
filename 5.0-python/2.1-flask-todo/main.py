from flask import render_template, session
import pyrebase
import unittest
from app import create_app
from app.forms import Login


app = create_app()

firebaseConfigutarion = {
    'apiKey': "AIzaSyCFoAW7wHLLn_40ZHME2IMSKb6FzvP70WA",
    'authDomain': "todo-3b1a1.firebaseapp.com",
    'projectId': "todo-3b1a1",
    'storageBucket': "todo-3b1a1.appspot.com",
    'messagingSenderId': "223875631211",
    'appId': "1:223875631211:web:6de3df349f0c022853092e",
    'measurementId': "G-7N2G73GE9F"
}

firebase = pyrebase.initialize_app(firebaseConfigutarion)
db-firebase.database()

@app.cli.command()
def test():
    test = unittest.TestLoader().discover('tests')
    unittest.TextTestRunner().run(test)


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/auth/login', methods=['GET'])
def login():
    login_form = Login()

    return render_template('login.html',
                           login_form=login_form)


@app.route('/profile')
def profile():
    username = session['username']
    return render_template('profile.html', username=username)


@app.errorhandler(404)
def page_not_found(error):
    return render_template('404.html')


if __name__ == "__main__":
    app.run(debug=True, port=3000)
