package fr.hb.teva.calendriergif.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.servlet.http.HttpServlet;
import javax.validation.constraints.NotEmpty;

import org.springframework.ui.context.Theme;

@Entity
public class Utilisateur extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final int NB_POINTS_INITIAL;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String nom;
	
	@NotEmpty
	private String prenom;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String motDePasse;
	
	private int nbPoints;
	
	@OneToMany(mappedBy="utilisateur")
	private List<Gif> gifs;
	
	@ManyToOne
	private Theme theme;
	
	
}
