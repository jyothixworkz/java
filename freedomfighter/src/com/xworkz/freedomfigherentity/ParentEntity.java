package com.xworkz.freedomfigherentity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass

public class ParentEntity {
	private String createdBy;
	private String updatedBy;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;

}
