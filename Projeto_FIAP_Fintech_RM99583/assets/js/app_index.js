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


function saveRevenue () {
    const nmReceitaFixa = document.querySelector("#nome-receita-fixa");
    const vlReceitaFixa = document.querySelector("#valor-receita-fixa");

    const buttonSaveRevenue = document.querySelector("#btn-salvar-receita")
    buttonSaveRevenue.addEventListener("click", function (e) {
        e.preventDefault();

        const tableBody = document.querySelector("#table-body");

        const nmRFixValue = nmReceitaFixa.value;
        const vlRFixValue = vlReceitaFixa.value;

        const tableRow = document.createElement("tr");
        tableRow.className = "table-row";
        tableRow.innerHTML = `
            <td class="text-start px-2 col-1-data text-info"><i class="fa-sharp fa-solid fa-dollar-sign"></i></td>
            <td class="text-start px-2 col-2-data">${nmRFixValue}</td>
            <td class="text-start px-2 col-3-data">R$</td>
            <td class="text-end px-2 col-4-data">${vlRFixValue.replace("R$ ", "")}</td>
        `;

        tableBody.appendChild(tableRow);

        nmReceitaFixa.value = "";
        vlReceitaFixa.value = "";
        const validFields = document.querySelectorAll(".icon-checkmark");
        validFields.forEach((checkmark) => {
            checkmark.style.color = "#00000000"
        })

    });
}



function addRevenue() {
    const nmReceitaVar = document.querySelector("#nome-receita-variavel");
    const vlReceitaVar = document.querySelector("#valor-receita-variavel");

    const buttonAddRevenue = document.querySelector("#btn-adicionar-receita");
    buttonAddRevenue.addEventListener("click", function(e) {
        e.preventDefault();

        const tableBody = document.querySelector("#table-body");

        const nmRVarValue = nmReceitaVar.value;
        const vlRVarValue = vlReceitaVar.value;

        const tableRow = document.createElement("tr");
        tableRow.className = "table-row";
        tableRow.innerHTML = `
            <td class="text-start px-2 col-1-data text-info"><i class="fa-sharp fa-solid fa-dollar-sign"></i></td>
            <td class="text-start px-2 col-2-data">${nmRVarValue}</td>
            <td class="text-start px-2 col-3-data">R$</td>
            <td class="text-end px-2 col-4-data">${vlRVarValue.replace("R$ ", "")}</td>
        `;

        tableBody.appendChild(tableRow);

        nmReceitaVar.value = "";
        vlReceitaVar.value = "";
        const validFields = document.querySelectorAll(".icon-checkmark");
        validFields.forEach((checkmark) => {
            checkmark.style.color = "#00000000"
        })

    });
}


function deleteRevenues() {

    const buttonDelRevenue = document.querySelector("#btn-limpar-tabela");
    buttonDelRevenue.addEventListener("click", function(e) {
        e.preventDefault();

        const tableBody = document.querySelector("#table-body");

        while (tableBody.firstChild) {
            tableBody.firstChild.remove();
        }

        const tableRow = document.createElement("tr");
        tableRow.className = "table-row";
        tableRow.innerHTML = `
            <td class="text-start px-2 col-1-data text-info"><i class="fa-sharp fa-solid fa-dollar-sign"></i></td>
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
saveRevenue();
addRevenue();
deleteRevenues();
