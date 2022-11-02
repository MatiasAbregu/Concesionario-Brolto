function seleccion(valor) {
    let ford = document.getElementById("novFord");
    let chevrolet = document.getElementById("novChev");
    let bmw = document.getElementById("novBMW");
    let audi = document.getElementById("novAudi");
    let porsche = document.getElementById("novPorsche");

    if (valor === 1) {
        ford.style.display = "block";
        chevrolet.style.display = "none";
        bmw.style.display = "none";
        audi.style.display = "none";
        porsche.style.display = "none";
    } else if (valor === 2) {
        ford.style.display = "none";
        chevrolet.style.display = "block";
        bmw.style.display = "none";
        audi.style.display = "none";
        porsche.style.display = "none";
    } else if (valor === 3) {
        ford.style.display = "none";
        chevrolet.style.display = "none";
        bmw.style.display = "block";
        audi.style.display = "none";
        porsche.style.display = "none";
    } else if (valor === 4) {
        ford.style.display = "none";
        chevrolet.style.display = "none";
        bmw.style.display = "none";
        audi.style.display = "block";
        porsche.style.display = "none";
    } else if (valor === 5) {
        ford.style.display = "none";
        chevrolet.style.display = "none";
        bmw.style.display = "none";
        audi.style.display = "none";
        porsche.style.display = "block";
    }

}