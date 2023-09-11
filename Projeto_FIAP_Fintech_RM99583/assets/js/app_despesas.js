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

/*
fdsafasd
fdasfsad
*/

function formatCurrency() {
    const numericInputs = document.querySelectorAll(".number-input");
    
    numericInputs.forEach(function(numericInput) {
        numericInput.addEventListener("input", function() {
        let value = numericInput.value;
        value = value.replace(/\D/g, "");
        
        if (value !== "") {
            value = "R$ " + (parseFloat(value) / 100).toFixed(2).replace(".", ",");
        }

        if (value == "R$ 0,00") {
            value = "";
        }
        
        numericInput.value = value;
        });
    });
}

function showMenu() {

    const buttonSideMenu = document.querySelector(".main-button-menu")
    const sideMenu = document.querySelector(".side-menu")
    buttonSideMenu.addEventListener("click", () => {
        sideMenu.classList.add("show-menu");
        sideMenu.classList.remove("hide-menu");
    })
}

function hideMenu() {

    const bgHideSideMenu = document.querySelector(".side-menu")
    const buttonHideSideMenu = document.querySelector("#hide-menu-button-1")

    const sideMenu = document.querySelector(".side-menu")

    bgHideSideMenu.addEventListener("click", () => {
        sideMenu.classList.add("hide-menu")
        sideMenu.classList.remove("show-menu");
    })
    buttonHideSideMenu.addEventListener("click", () => {
        sideMenu.classList.add("hide-menu")
        sideMenu.classList.remove("show-menu");
    })
}


function saveExpense () {
    const nmDespesaFixa = document.querySelector("#nome-despesa-fixa");
    const vlDespesaFixa = document.querySelector("#valor-despesa-fixa");

    const buttonSaveExpense = document.querySelector("#btn-salvar-despesa")
    buttonSaveExpense.addEventListener("click", function (e) {
        e.preventDefault();

        const tableBody = document.querySelector("#table-body");

        const nmDFixValue = nmDespesaFixa.value;
        const vlDFixValue = vlDespesaFixa.value;

        const tableRow = document.createElement("tr");
        tableRow.className = "table-row";
        tableRow.innerHTML = `
            <td class="text-start px-2 col-1-data text-danger"><i class="fa-sharp fa-solid fa-dollar-sign"></i></td>
            <td class="text-start px-2 col-2-data">${nmDFixValue}</td>
            <td class="text-start px-2 col-3-data">R$</td>
            <td class="text-end px-2 col-4-data">${vlDFixValue.replace("R$ ", "")}</td>
        `;

        tableBody.appendChild(tableRow);

        nmDespesaFixa.value = "";
        vlDespesaFixa.value = "";
        const validFields = document.querySelectorAll(".icon-checkmark");
        validFields.forEach((checkmark) => {
            checkmark.style.color = "#00000000"
        })

    });
}



function addExpense() {
    const nmDespesaVar = document.querySelector("#nome-despesa-variavel");
    const vlDespesaVar = document.querySelector("#valor-despesa-variavel");

    const buttonAddExpense = document.querySelector("#btn-adicionar-despesa");
    buttonAddExpense.addEventListener("click", function(e) {
        e.preventDefault();

        const tableBody = document.querySelector("#table-body");

        const nmDVarValue = nmDespesaVar.value;
        const vlDVarValue = vlDespesaVar.value;

        const tableRow = document.createElement("tr");
        tableRow.className = "table-row";
        tableRow.innerHTML = `
            <td class="text-start px-2 col-1-data text-info"><i class="fa-sharp fa-solid fa-dollar-sign"></i></td>
            <td class="text-start px-2 col-2-data">${nmDVarValue}</td>
            <td class="text-start px-2 col-3-data">R$</td>
            <td class="text-end px-2 col-4-data">${vlDVarValue.replace("R$ ", "")}</td>
        `;

        tableBody.appendChild(tableRow);

        nmDespesaVar.value = "";
        vlDespesaVar.value = "";
        const validFields = document.querySelectorAll(".icon-checkmark");
        validFields.forEach((checkmark) => {
            checkmark.style.color = "#00000000"
        })

    });
}


function deleteExpenses() {

    const buttonDelExpense = document.querySelector("#btn-limpar-tabela");
    buttonDelExpense.addEventListener("click", function(e) {
        e.preventDefault();

        const tableBody = document.querySelector("#table-body");

        while (tableBody.firstChild) {
            tableBody.firstChild.remove();
        }

        const tableRow = document.createElement("tr");
        tableRow.className = "table-row";
        tableRow.innerHTML = `
            <td class="text-start px-2 col-1-data text-danger"><i class="fa-sharp fa-solid fa-dollar-sign"></i></td>
            <td class="text-start px-2 col-2-data">${""}</td>
            <td class="text-start px-2 col-3-data">R$</td>
            <td class="text-end px-2 col-4-data">${""}</td>
        `;

        tableBody.appendChild(tableRow);

    });

}



formatCurrency();
validateFields();
showMenu();
hideMenu();
saveExpense();
addExpense();
deleteExpenses();
