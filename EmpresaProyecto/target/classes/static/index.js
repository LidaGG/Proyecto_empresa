// Seleccionar elementos relevantes
const empresasTab = document.getElementById("empresasTab");
const empleadosTab = document.getElementById("empleadosTab");
const dineroTab = document.getElementById("dineroTab");
const empresasForm = document.getElementById("empresasForm");
const empleadosForm = document.getElementById("empleadosForm");
const dineroForm = document.getElementById("dineroForm");

// Funciones para mostrar/ocultar pestañas
function showEmpresas() {
    empresasTab.classList.add("active");
    empleadosTab.classList.remove("active");
    dineroTab.classList.remove("active");
    empresasForm.style.display = "block";
    empleadosForm.style.display = "none";
    dineroForm.style.display = "none";
}

function showEmpleados() {
    empresasTab.classList.remove("active");
    empleadosTab.classList.add("active");
    dineroTab.classList.remove("active");
    empresasForm.style.display = "none";
    empleadosForm.style.display = "block";
    dineroForm.style.display = "none";
}

function showDinero() {
    empresasTab.classList.remove("active");
    empleadosTab.classList.remove("active");
    dineroTab.classList.add("active");
    empresasForm.style.display = "none";
    empleadosForm.style.display = "none";
    dineroForm.style.display = "block";
}

// Mostrar la primera pestaña por defecto
showEmpresas();

// Asignar manejadores
