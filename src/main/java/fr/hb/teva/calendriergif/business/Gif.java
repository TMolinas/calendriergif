package fr.hb.teva.calendriergif.business;

import java.util.Date;
import java.util.List;

@Entity
public class Gif {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date dateHeureAjout;
	
	@Lob
	private String legende;
	
	@OneToMany(mappedBy="gif")
	private List<Reaction> reactions;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	@OneToOne
	protected Jour jour;
	
	
	
}
