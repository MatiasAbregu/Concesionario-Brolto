let contador = 1;

setInterval(function () {
    seleccion(contador);  
    let check;

    if (contador === 1) {
        contador++;
        check = document.getElementById("radioFord");
    } else if (contador === 2) {
        contador++;
        check = document.getElementById("radioChev");
    } else if (contador === 3) {
        contador++;
        check = document.getElementById("radioBMW");
    } else if (contador === 4) {
        contador++;
        check = document.getElementById("radioAudi");
    } else if (contador === 5) {
        contador++;
        check = document.getElementById("radioPorsche");
    }

    if (contador > 5) {
        contador = 1;
    }

    check.checked = true;
}, 4000);

function seleccion(valor) {
    let ford = document.getElementById("novFord");
    let chevrolet = document.getElementById("novChev");
    let bmw = document.getElementById("novBMW");
    let audi = document.getElementById("novAudi");
    let porsche = document.getElementById("novPorsche");
    contador = valor;

    if (contador === 1) {
        ford.style.display = "block";
        chevrolet.style.display = "none";
        bmw.style.display = "none";
        audi.style.display = "none";
        porsche.style.display = "none";
    } else if (contador === 2) {
        ford.style.display = "none";
        chevrolet.style.display = "block";
        bmw.style.display = "none";
        audi.style.display = "none";
        porsche.style.display = "none";
    } else if (contador === 3) {
        ford.style.display = "none";
        chevrolet.style.display = "none";
        bmw.style.display = "block";
        audi.style.display = "none";
        porsche.style.display = "none";
    } else if (contador === 4) {
        ford.style.display = "none";
        chevrolet.style.display = "none";
        bmw.style.display = "none";
        audi.style.display = "block";
        porsche.style.display = "none";
    } else if (contador === 5) {
        ford.style.display = "none";
        chevrolet.style.display = "none";
        bmw.style.display = "none";
        audi.style.display = "none";
        porsche.style.display = "block";
    }
}