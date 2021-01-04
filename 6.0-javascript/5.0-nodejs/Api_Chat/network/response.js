exports.sucess = function (req, res, message, status) {
        res.status(status || 200).send({ Error: '',
            body: message
        }
            )
}

exports.error = function (req, res, message, status) {

    res.status(status || 500).send(
        {
            Error: message,
            body: ''
        }
            )
    
}