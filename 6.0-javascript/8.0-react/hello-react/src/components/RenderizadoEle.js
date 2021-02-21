import React, {Component} from 'react';
import data from '../helpers/data.json'


function ListItem(props){
    return(
        <li>
            <a href={props.y.web} target="_blank">{props.y.name}</a>
        </li>
    )
}


class RenderizadoEle extends Component{
    constructor(props){
        super(props)
        this.state = {
            seasons : ['Spring', 'Autom', 'Summer', 'Inver']
        }
    }
    render(){
        
        return(
            <div>
                <h2>Renderizado de Elemento</h2>
                <h3>
                    <ul>
                        {
                            this.state.seasons.map( x => <li key={x}>{x}</li>)
                        }
                    </ul>
                </h3>
                <h2>Frameworks of JavaScript</h2>
                <ul>
                    {data.fremaworks.map( y => <ListItem y={y} key={y.name}/>)}
                </ul>

            </div>
        )
    }
}

export default RenderizadoEle