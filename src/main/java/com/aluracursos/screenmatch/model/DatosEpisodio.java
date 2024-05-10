package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosEpisodio(

        @JsonAlias("Title") String titullo,

        @JsonAlias("Episode")Integer numeroepisodio,

        @JsonAlias("imdbRating")String evaluacion,

        @JsonAlias("Released")String fechaDeLanzamiento
) {
}
