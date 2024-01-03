package com.folheto.photo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Produto {
	
	
	  @Id
	  @GeneratedValue
	  private Long id;
	
	  private String descricao;
	  
	  @Lob
	  private byte[] imageBytes;

	  
	
}
