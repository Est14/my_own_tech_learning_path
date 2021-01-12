from flask import Flask
from flask import render_template, session, redirect, url_for
from flask import flash
from flask_bootstrap import Bootstrap
from flask_wtf import CsrfProtect
from forms import Login
import unittest


app = Flask(__name__)
bootstrap = Bootstrap(app)
app.config['SECRET_KEY'] = 'SiulNabetse'
csrf = CsrfProtect(app)


@app.cli.command()
def test():
    test = unittest.TestLoader().discover('tests')
    unittest.TextTestRunner().run(test)


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/login', methods=['GET', 'POST'])
def login():
    login_form = Login()

    if login_form.validate_on_submit():
        # This save the user name in a session
        session['username'] = login_form.username.data

        flash('Session exitosa')
        return redirect(url_for('profile'))
    else:
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
