function validateFields() {
    const field = document.querySelector("#nome-receita-fixa").nodeValue;
    // const validField = document.querySelector(".check-mark-valid");
    return console.log(field);
}
function showMenu() {

    const buttonSideMenu = document.querySelector(".main-button-menu")
    const sideMenu = document.querySelector(".side-menu")
    buttonSideMenu.addEventListener('click', () => {
        sideMenu.classList.add("show-menu");
        sideMenu.classList.remove("hide-menu");
    })
}
function hideMenu() {

    const bgHideSideMenu = document.querySelector(".side-menu")
    const buttonHideSideMenu = document.querySelector(".hide-menu-button-1")
    const sideMenu = document.querySelector(".side-menu")
    bgHideSideMenu.addEventListener('click', () => {
        sideMenu.classList.add("hide-menu")
        sideMenu.classList.remove("show-menu");
    })
    buttonHideSideMenu.addEventListener('click', () => {
        sideMenu.classList.add("hide-menu")
        sideMenu.classList.remove("show-menu");
    })
}
validateFields();
showMenu();
hideMenu();