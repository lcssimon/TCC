package lcs.tcc.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "hospedagem")
public class Hospedagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHospedagem;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrada;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataSaida;
    @Column(length = 20)
    private String demanda;
    @Column(length = 20)
    private String diagnostico;
    
    @ManyToOne(optional = false)
    @ForeignKey(name = "hospedeHospedagem")
    private Hospede hospede;
    
    @ManyToOne(optional = false)
    @ForeignKey(name = "leitoHospedagem")
    private Leito leito;

    public Hospedagem() {
        this.leito = new Leito();
        this.hospede = new Hospede();
    }

    public Leito getLeito() {
        return leito;
    }

    public void setLeito(Leito leito) {
        this.leito = leito;
    }

    public Integer getIdHospedagem() {
        return idHospedagem;
    }

    public void setIdHospedagem(Integer idHospedagem) {
        this.idHospedagem = idHospedagem;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDemanda() {
        return demanda;
    }

    public void setDemanda(String demanda) {
        this.demanda = demanda;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.idHospedagem != null ? this.idHospedagem.hashCode() : 0);
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
        final Hospedagem other = (Hospedagem) obj;
        if (this.idHospedagem != other.idHospedagem && (this.idHospedagem == null || !this.idHospedagem.equals(other.idHospedagem))) {
            return false;
        }
        return true;
    }
}
