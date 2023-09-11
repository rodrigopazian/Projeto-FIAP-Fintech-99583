// Implementing still

function validateFields() {
    const fields = document.querySelectorAll(".input");
    const validFields = document.querySelectorAll(".icon-checkmark");

    fields.forEach(function(field, index) {
        field.addEventListener("input", function (e) {
        if (field.validity && field.value !== "") {
            validFields[index].style.color = "#FFF";
        } else {
            validFields[index].style.color = "#00000000";
        }       
        });
    });
}


export function storeLoginPassword() {
    document.querySelector("#btn-criar-email").addEventListener("submit", (e) => {
        e.preventDefault();
        const login = document.querySelector("#email").value;
        const pass = document.querySelector("#password").value;
        return login, pass;
        


    });
}

validateFields();
