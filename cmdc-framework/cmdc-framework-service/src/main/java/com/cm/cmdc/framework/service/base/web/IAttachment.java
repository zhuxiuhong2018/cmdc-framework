package com.cm.cmdc.framework.service.base.web;

import java.util.Date;

public interface IAttachment {

	public String getId();
	public String getName();
	public String getSuffix();
	public long getSize();
	public String getPath();
	public java.util.Date getUploadDt();
	public String getType();
	public boolean isDeleted();
	public String getBusinessId();
	public String getBusinessType();
	public String getCreator();
	public String getCreatorId();
	public java.util.Date getCreateDt();
	public String getLastUpdator();
	public String getLastUpdatorId();
	public java.util.Date getLastUpdateDt();
	
	public String getUploadDir();

	public void setPath(String path);
	public void setCreator(String creator);
	public void setCreatorId(String creatorId);
	public void setCreateDt(Date createDt);
	public void setLastUpdator(String lastUpdator);
	public void setLastUpdatorId(String lastUpdatorId);
	public void setLastUpdateDt(Date lastUpdateDt);
	
}