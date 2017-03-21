package org.openmrs.module.lagtimereport;

import java.io.Serializable;
import java.util.Date;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.User;

public class LagTimeReportSetup extends BaseOpenmrsData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer lagTimeReportId;
	
	private String name;
	
	private String description;
	
	private Double version;
	
	@Override
	public Integer getId() {
		return this.lagTimeReportId;
	}
	
	@Override
	public void setId(Integer lagTimeReportId) {
		this.lagTimeReportId = lagTimeReportId;
		
	}
	
	public Integer getLagTimeReportId() {
		return lagTimeReportId;
	}
	
	public void setLagTimeReportId(Integer lagTimeReportId) {
		this.lagTimeReportId = lagTimeReportId;
	}
	
	@Override
	public User getCreator() {
		return creator;
	}
	
	@Override
	public void setCreator(User creator) {
		this.creator = creator;
	}
	
	@Override
	public String getUuid() {
		return super.getUuid();
	}
	
	@Override
	public void setUuid(String uuid) {
		super.setUuid(uuid);
	}
	
	@Override
	public Date getDateCreated() {
		return super.getDateCreated();
	}
	
	@Override
	public void setDateCreated(Date dateCreated) {
		super.setDateCreated(dateCreated);
	}
	
	@Override
	public Date getDateChanged() {
		return super.getDateChanged();
	}
	
	@Override
	public void setDateChanged(Date dateChanged) {
		super.setDateChanged(dateChanged);
	}
	
	@Override
	public Boolean getVoided() {
		return super.getVoided();
	}
	
	@Override
	public void setVoided(Boolean voided) {
		super.setVoided(voided);
	}
	
	@Override
	public Date getDateVoided() {
		return super.getDateVoided();
	}
	
	@Override
	public void setDateVoided(Date dateVoided) {
		super.setDateVoided(dateVoided);
	}
	
	@Override
	public User getChangedBy() {
		return super.getChangedBy();
	}
	
	@Override
	public void setChangedBy(User changedBy) {
		super.setChangedBy(changedBy);
	}
	
	@Override
	public User getVoidedBy() {
		return super.getVoidedBy();
	}
	
	@Override
	public void setVoidedBy(User voidedBy) {
		super.setVoidedBy(voidedBy);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getVersion() {
		return version;
	}
	
	public void setVersion(Double version) {
		this.version = version;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((lagTimeReportId == null) ? 0 : lagTimeReportId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LagTimeReportSetup other = (LagTimeReportSetup) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (lagTimeReportId == null) {
			if (other.lagTimeReportId != null)
				return false;
		} else if (!lagTimeReportId.equals(other.lagTimeReportId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	
}
