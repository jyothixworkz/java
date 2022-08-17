package com.xworkz.cartooncharacterentity;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;
import javax.print.attribute.standard.DateTimeAtCompleted;

import lombok.*;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass

public class CartoonCharacterParentEntity  implements Serializable {
	private String createdBy;
	private String updatedBy;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
	

}
