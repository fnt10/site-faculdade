document.getElementById("left-arrow").addEventListener("click", function() {
    let noticias = document.querySelector(".noticias");
    if (noticias.scrollLeft <= 0) {
        noticias.scrollTo({
            left: noticias.scrollWidth - noticias.clientWidth,
            behavior: "smooth"
        });
    } else {
        noticias.scrollBy({
            left: -noticias.clientWidth,
            behavior: "smooth"
        });
    }
});

document.getElementById("right-arrow").addEventListener("click", function() {
    let noticias = document.querySelector(".noticias");
    if (noticias.scrollLeft + noticias.clientWidth >= noticias.scrollWidth) {
        noticias.scrollTo({
            left: 0,
            behavior: "smooth"
        });
    } else {
        noticias.scrollBy({
            left: noticias.clientWidth,
            behavior: "smooth"
        });
    }
});