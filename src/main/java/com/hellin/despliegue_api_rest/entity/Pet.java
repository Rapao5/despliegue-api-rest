package com.hellin.despliegue_api_rest.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id; 
        private String name;
        private LocalDate born;
        private String chip;
        private String category;
        private boolean adopt;

        public void setAdopt(boolean adopt) {
            this.adopt = adopt;
        }
        public boolean getAdopt(){
            return adopt;
        }
        public LocalDate getBorn() {
            return born;
        }
        public String getCategory() {
            return category;
        }
        public String getChip() {
            return chip;
        }public Long getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public void setBorn(LocalDate born) {
            this.born = born;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public void setChip(String chip) {
            this.chip = chip;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }

}
