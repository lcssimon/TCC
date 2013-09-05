package lcs.tcc.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncionario;
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
    @Column(length = 30)
    private String cargo;
    @Column(length = 50)
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAdminissao;
    @Column(length = 10)
    private String login;
    @Column(length = 10)
    private String senha;
    @Column(length = 1)
    private String acTotal;
    
    @ManyToOne(optional = false)
    @ForeignKey(name = "cidadeFuncionario")
    private Cidade cidade;    
    

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataAdminissao() {
        return dataAdminissao;
    }

    public void setDataAdminissao(Date dataAdminissao) {
        this.dataAdminissao = dataAdminissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcTotal() {
        return acTotal;
    }

    public void setAcTotal(String acTotal) {
        this.acTotal = acTotal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.idFuncionario != null ? this.idFuncionario.hashCode() : 0);
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
        final Funcionario other = (Funcionario) obj;
        if (this.idFuncionario != other.idFuncionario && (this.idFuncionario == null || !this.idFuncionario.equals(other.idFuncionario))) {
            return false;
        }
        return true;
    }
}
