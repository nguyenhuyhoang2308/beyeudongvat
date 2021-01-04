/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NgNha
 */
@Entity
@Table(name = "gallery", catalog = "animal_db", schema = "")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Gallery.findAll", query = "SELECT g FROM Gallery g"),
    @NamedQuery(name = "Gallery.findById", query = "SELECT g FROM Gallery g WHERE g.id = :id"),
    @NamedQuery(name = "Gallery.findByThumbnail", query = "SELECT g FROM Gallery g WHERE g.thumbnail = :thumbnail")
})
public class Gallery implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "_id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2083)
    @Column(name = "Thumbnail")
    private String thumbnail;
    @JoinColumn(name = "AnimalId", referencedColumnName = "_id")
    @ManyToOne(optional = false)
    private Animal animalId;

    public Gallery()
    {
    }

    public Gallery(Integer id)
    {
        this.id = id;
    }

    public Gallery(Integer id, String thumbnail)
    {
        this.id = id;
        this.thumbnail = thumbnail;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getThumbnail()
    {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public Animal getAnimalId()
    {
        return animalId;
    }

    public void setAnimalId(Animal animalId)
    {
        this.animalId = animalId;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gallery))
        {
            return false;
        }
        Gallery other = (Gallery) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.Gallery[ id=" + id + " ]";
    }
    
}
