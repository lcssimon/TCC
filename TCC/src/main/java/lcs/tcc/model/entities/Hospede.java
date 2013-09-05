/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name = "hospede")
public class Hospede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHospede;
    @Column(length = 60, nullable = false)
    private String nome;
    @Column(length = 10)
    private String sexo;
    @Column(length = 14)
    private String cpf;
    @Column(length = 14)
    private String rg;
    @Column(length = 2)
    private String ssp;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @Column(length = 50)
    private String Endereco;
    @Column(length = 30)
    private String Bairro;
    private String cep;
    @Column(length = 2)
    private String uf;
    @Column(length = 14)
    private String telefone;
    @Column(length = 14)
    private String celuluar;
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String nomePai;
    @Column(length = 50)
    private String nomeMae;
    @ManyToOne(optional = false)
    @ForeignKey(name = "cidadeHospede")
    private Cidade cidade;

    public Integer getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(Integer idHospede) {
        this.idHospede = idHospede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSsp() {
        return ssp;
    }

    public void setSsp(String ssp) {
        this.ssp = ssp;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCeluluar() {
        return celuluar;
    }

    public void setCeluluar(String celuluar) {
        this.celuluar = celuluar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.idHospede != null ? this.idHospede.hashCode() : 0);
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
        final Hospede other = (Hospede) obj;
        if (this.idHospede != other.idHospede && (this.idHospede == null || !this.idHospede.equals(other.idHospede))) {
            return false;
        }
        return true;
    }
}
