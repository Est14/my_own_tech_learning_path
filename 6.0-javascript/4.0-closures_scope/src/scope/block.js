const fruits = () => {
    if (true) {
        var fruit_1 = 'Strawerries'
        let fruit_2 = 'Watermelon'
        const fruit_3 = 'Mango'
        console.log(fruit_2)  // Can access 
        console.log(fruit_3)  // Can access
    }   

    console.log(fruit_1)
    console.log(fruit_2)  // Can't access 
    console.log(fruit_3)  // Can't access
}

function functionName() {
	
	for(let i = 0; i < 10; i++) {
		setTimeout(function() {
			console.log(i);
		}, 1000);
	}

}

functionName()