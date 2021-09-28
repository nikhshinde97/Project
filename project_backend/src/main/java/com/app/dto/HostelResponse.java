package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@ToString
public class HostelResponse {
       
	private String hostelName;
	private String AadharCard;
	private double amountPerDay;
	private boolean isVerified;
	private boolean isAvailable;
}
