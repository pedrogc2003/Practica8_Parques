package com.example.practica8_parques

class ParksProvider {
    companion object{
        val PaksList = listOf<Parks>(
            Parks(
                nombre = "Parque de Maria Luisa",
                descripcion = "El parque de María Luisa es el primer parque urbano de Sevilla y uno de sus pulmones verdes. En 1983 fue declarado Bien de Interés Cultural en la categoría de Jardín Histórico",
                foto = "https://cdn2.civitatis.com/espana/sevilla/guia/parque-maria-luisa.jpg"
            ),
            Parks(
                nombre = "Parque Amate",
                descripcion = "Previsto desde el Plan General de Ordenación Urbana de 1962, el Parque Amate, como muchos otros de la ciudad, no vería abiertas  sus puertas hasta muchos años después",
                foto = "https://d17umfmk0e27oh.cloudfront.net/articulos/articulos-738418.jpg"
            ),
            Parks(
                nombre = "Alameda de Hercules",
                descripcion = "Durante siglos el espacio que ocupa la actual Alameda fue un meandro del Río Guadalquivir, que acabó alejándose paulatinamente del cauce principal. Las primeras murallas romanas dejan fuera de su perímetro defensivo esta zona.",
                foto = "https://offloadmedia.feverup.com/sevillasecreta.co/wp-content/uploads/2017/02/19141017/shutterstock_1018752235-1-1024x597.jpg"
            ),
            Parks(
                nombre = "Plaza de la Magdalena",
                descripcion = "Esta denominación es antigua, probablemente de la época en que se construye la primitiva iglesia de la Magdalena (siglos XIII-XIV). Ya en la segunda mitad el siglo XV se le llama plaza de la Iglesia.",
                foto = "https://upload.wikimedia.org/wikipedia/commons/a/a5/Iglesia_Magdalena_Sevilla_006.jpg"
            ),
            Parks(
                nombre = "Plaza del Salvador",
                descripcion = "La plaza del Salvador es un espacio abierto de carácter peatonal ubicado en el barrio de la Alfalfa, en el distrito Casco Antiguo de la ciudad española de Sevilla, Andalucía",
                foto = "https://static1-sevilla.abc.es/media/pasionensevilla/2022/02/23/s/pasion-salvador-juevessanto-U60162083252MYc-1024x512@abc.jpg"

            )
        )
    }
}