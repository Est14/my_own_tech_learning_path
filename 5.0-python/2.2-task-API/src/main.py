from app import create_app
from models import db, task_schema, tasks_schema, ma
from models import Task
from flask import request


app = create_app()


@app.route('/task', methods=['POST'])
def create_task():
    title = request.json['Title']
    description = request.json['Description']

    new_task = Task(title, description)
    db.session.add(new_task)
    db.session.commit()

    return task_schema.jsonify(new_task)


@app.route('/tasks')
def get_tasks():
    new_consult = Task.query.all()
    return tasks_schema.jsonify(new_consult)


@app.route('/tasks/<id>')
def get_task(id):
    task = Task.query.get(id)
    return task_schema.jsonify(task)


@app.route('/tasks/<id>', methods=['PUT'])
def update_task(id):
    task = Task.query.get(id)

    title = request.json['Title']
    description = request.json['Description']

    task.title = title
    task.description = description
    db.session.commit()

    return task_schema.jsonify(task)


@app.route('/tasks/<id>', methods=['DELETE'])
def delete_task(id):
    task = Task.query.get(id)

    db.session.delete(task)
    db.session.commit()

    return task_schema.jsonify(task)


if __name__ == "__main__":
    db.init_app(app)
    with app.app_context():
        db.create_all()
    ma.init_app(app)
    app.run()
