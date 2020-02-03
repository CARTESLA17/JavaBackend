package co.com.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public abstract class PersistentObject implements Serializable{

	private static final long serialVersionUID = -7930250123581827476L;
	
	@Version
	@Column(name = "version_number")	
    private long versionNumber;
	
	@Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "creation_timestamp")
    private Date creationTimestamp;
    

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "modification_timestamp")
    private Date modificationTimestamp;

	public long getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(long versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Date getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Date creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Date getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Date modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}
	
}
