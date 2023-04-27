package hibernate.theater;
import jakarta.persistence.*;
@Entity
@Table(name="Theater")
public class theater {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ticket")
	private int movie_ticket;
	private String Movie_name;
	
	public int getMovieticket() {
		return movie_ticket;
	}
	public void setBookid(int movie_ticket) {
		this.movie_ticket = movie_ticket;
	}
	public String getMoviename() {
		return Movie_name;
	}
	public void setBookName(String Movie_name) {
		this.Movie_name = Movie_name;
	
	}
	public theater(int movie_ticket, String Movie_name) {
	super();
	this.movie_ticket = movie_ticket;
	this.Movie_name = Movie_name;
	}
	@Override
	public String toString() {
	return "Theater [movie_ticket=" + movie_ticket + ", Movie_name=" + Movie_name + "]";
	}
	}