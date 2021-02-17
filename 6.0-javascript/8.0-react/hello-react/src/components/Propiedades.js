
import React from 'react'

function Propiedades(props) {
    return (
        <div>
            <ul>
                <li>{props.string}</li>
                <li>{props.numero}</li>
                <li>{props.array[0]}</li>
            </ul>
        </div>
    )
}

Propiedades.defaultProps = {
    porDefecto: 'Esto lo envio por defecto',
    comment: 'Como es que va todo aprendiendo React?'
}

export default Propiedades
