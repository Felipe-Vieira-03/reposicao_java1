package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Suggestion {
    private Integer id;
    private String description;
    private LocalDate data;
    public Suggestion() {
    }
    public Suggestion(Integer id, String description, LocalDate data) {
        this.id = id;
        this.description = description;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Suggestion [data=" + data + ", description=" + description + ", id=" + id + "]";
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    
    
}
