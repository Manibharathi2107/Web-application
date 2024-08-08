function validationForm() { 
    let x = document.forms["myform"]["name1"].value;{
    if(x==""){
        alert("UserName must be filled out");
        return false;
    }
}

let y = document.forms["myform"]["email1"].value;{
    if(y==""){
        alert("Emailid must be filled out");
        return false;
    }
}

let z = document.forms["myform"]["password1"].value;{
    if(z==""){
        alert("Password must be filled out");
        return false;
    }
}

let a = document.forms["myform"]["password2"].value;{
    if(z==""){
        alert("Password must be filled out");
        return false;
    }
}
}
