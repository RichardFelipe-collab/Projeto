package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela NOTICIA
* @generated
*/
@Entity
@Table(name = "\"NOTICIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Noticia")
public class Noticia implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String titulo;

    /**
    * @generated
    */
    @Column(name = "texto", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String texto;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datapubi", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date datapubi;

    /**
    * Construtor
    * @generated
    */
    public Noticia(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Noticia setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém titulo
    * return titulo
    * @generated
    */
    
    public java.lang.String getTitulo(){
        return this.titulo;
    }

    /**
    * Define titulo
    * @param titulo titulo
    * @generated
    */
    public Noticia setTitulo(java.lang.String titulo){
        this.titulo = titulo;
        return this;
    }
    /**
    * Obtém texto
    * return texto
    * @generated
    */
    
    public java.lang.String getTexto(){
        return this.texto;
    }

    /**
    * Define texto
    * @param texto texto
    * @generated
    */
    public Noticia setTexto(java.lang.String texto){
        this.texto = texto;
        return this;
    }
    /**
    * Obtém datapubi
    * return datapubi
    * @generated
    */
    
    public java.util.Date getDatapubi(){
        return this.datapubi;
    }

    /**
    * Define datapubi
    * @param datapubi datapubi
    * @generated
    */
    public Noticia setDatapubi(java.util.Date datapubi){
        this.datapubi = datapubi;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Noticia object = (Noticia)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}