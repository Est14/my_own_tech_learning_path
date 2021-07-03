function validatedF(form){

    let user = form.user;
    if(user.value == "" || user.value == "Write user"){
        alert("Give us a user name")
        user.focus();
        user.select();
        return false;
    }

    let password = form.password;
    if(password.value == "" || password.value.length < 8){
        alert("The password must be equal to or greater than 8 characters")
        password.focus();
        password.select();
        return false;
    }
    let technologies = form.technology;
    let check = false;
    for(let i = 0; i < technologies.length; i++){
        if(technologies[i].checked()){
            check = true;
        }
    }
    if (!check){
        alert("Select a tech")
        return false;
    }

    return true;
}