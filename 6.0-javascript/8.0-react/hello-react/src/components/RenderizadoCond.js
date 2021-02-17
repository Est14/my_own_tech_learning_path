import React, {Component} from 'react';

function Login(){
    return(
        <div>
            <h3>Login</h3>
        </div>
    )
}
function Logout(){
    return(
        <div>
            <h3>Loout</h3>
        </div>
    )
}



class RenderizadoCondicional extends Component{
    constructor(props){
        super(props)
        this.state = {
            session: false
        }
    }
    render(){
        return(
            <div>
                <h2>Renderizado condicional</h2>
                {this.state.session ?<Logout />:<Login /> }
                
            </div>
        )
    }
}


export default RenderizadoCondicional