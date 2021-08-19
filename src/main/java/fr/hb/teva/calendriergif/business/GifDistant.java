package fr.hb.teva.calendriergif.business;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

@Entity
public class GifDistant extends Gif {
	
	@URL
	@Pattern(regexp="(?i)\\.(Gif|GIF|gif)$", message="Le fichier doit avoir une extension gif")
	private String url;
}
