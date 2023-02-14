package be.wkam.movieapp.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String reviewText;
    private  String reviewerName;
     int rating;  // int between 0 and 10
    @ManyToOne(fetch = FetchType.EAGER)
            @JoinColumn(name = "movie_id")
     Movie movie;
}
