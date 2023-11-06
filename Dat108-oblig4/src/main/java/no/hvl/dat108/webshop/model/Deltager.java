package no.hvl.dat108.webshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Deltager {
	@Id
    @NotBlank
    @Pattern(regexp = "[0-9]{8}")
    @Column(unique = true)
    private String mobil;  // Mobilnummer (8 siffer)

    @NotBlank
    private String hash;    // Password hash

    @NotBlank
    private String salt;    // Password salt

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-ZæøåÆØÅ -]{1,19}")
    private String fornavn;  // Fornavn (2-20 tegn, første tegn stor bokstav)

    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-ZæøåÆØÅ-]{1,19}")
    private String etternavn;  // Etternavn (2-20 tegn, første tegn stor bokstav)

    @NotBlank
    @Pattern(regexp = "^(mann|kvinne)$")
    private String kjonn;  // Kjønn ("mann" eller "kvinne")

    // Constructors, getters, setters, and other methods
}
}
