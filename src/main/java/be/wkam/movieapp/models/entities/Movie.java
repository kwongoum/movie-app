package be.wkam.movieapp.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

             private String title;
             private String director;
             private LocalDate releaseDate;

             @ManyToMany
                @JoinTable(
                        name = "movies_actors",
                        joinColumns = @JoinColumn(name = "movie_id"),
                        inverseJoinColumns = @JoinColumn(name = "actor_id")
                )
             Set<Actor> actors;
             @ManyToMany
                     @JoinTable(
                             name = "movies_genres",
                             joinColumns = @JoinColumn(name ="movie_id"),
                             inverseJoinColumns = @JoinColumn(name = "actor_id")
                     )
             Set<Genre> genres;
            // @OneToMany
            // List<Review> reviews;



}
