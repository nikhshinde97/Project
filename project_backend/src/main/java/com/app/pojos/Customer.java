package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customer_table")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Customer extends BaseEntity{
   
   @Column(name = "petname",length = 30)
   @NotNull
   private String petName;
   
   @Column(name = "pet_description",length = 100)
   @NotNull
   private String petDescription;
   
   @Column(name = "pet_food",length = 30)
   @NotNull
   private String petFood;
   
   @Lob
   @Column(name = "pet_photo")
   @NotNull
   private byte[] petPhoto;
   
   @OneToOne(cascade = CascadeType.ALL,mappedBy = "customer")
   @JsonIgnoreProperties("customer")
   private Bookings booking;
   
   @OneToOne
   @JoinColumn(name = "user_id")
   private User user; 
}
