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

validateFields();
