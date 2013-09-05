/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs.tcc.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "leito")
public class Leito implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLeito;
    @Column(length = 15)
    private String descricao;
    private boolean ocupado;
    
    @OneToMany(mappedBy = "leito", fetch = FetchType.LAZY)
    @ForeignKey(name = "leitoHospedagem")
    private List<Hospedagem> hospedagens;

    public Integer getIdLeito() {
        return idLeito;
    }

    public void setIdLeito(Integer idLeito) {
        this.idLeito = idLeito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public List<Hospedagem> getHospedagens() {
        return hospedagens;
    }

    public void setHospedagens(List<Hospedagem> hospedagens) {
        this.hospedagens = hospedagens;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.idLeito != null ? this.idLeito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Leito other = (Leito) obj;
        if (this.idLeito != other.idLeito && (this.idLeito == null || !this.idLeito.equals(other.idLeito))) {
            return false;
        }
        return true;
    }         
   
}
