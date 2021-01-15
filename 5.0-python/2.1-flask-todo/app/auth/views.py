from app.auth import auth
from app.forms import Login
from flask import render_template, session
from flask import redirect, flash, url_for
from app.forms import Login


@auth.route('/login', methods=['GET', 'POST'])
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
