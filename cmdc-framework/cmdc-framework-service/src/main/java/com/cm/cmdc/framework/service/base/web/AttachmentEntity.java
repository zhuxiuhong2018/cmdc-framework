package com.cm.cmdc.framework.service.base.web;

import java.beans.Transient;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

public class AttachmentEntity<T extends IAttachment> {
	/**
	 * 上传的附件JSON格式
	 */
	private String uploadAttachmentJson;
	/**
	 * 附件删除IDs
	 */
	private String delAttachmentIds;
	/**
	 * 附件列表
	 */
	private List<T> attachments;
	
	private List<IAttachment> originalAttachments;
	
	public void setAttachments(List<T> attachments){
		this.attachments = attachments;
	}
	public ParameterizedType getParameterizedType(@SuppressWarnings("rawtypes") Class clazz){
		if(clazz.getSuperclass() == AttachmentEntity.class){
			return (ParameterizedType) clazz.getGenericSuperclass();
		}else{
			return getParameterizedType(clazz.getSuperclass());
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Transient
	public List<T> getAttachments(){
		if(attachments==null){
			attachments = new ArrayList<T>();			
			String json = this.getUploadAttachmentJson();
			if(StringUtils.isEmpty(json)){
				return attachments;
			}
			ParameterizedType ptype = getParameterizedType(this.getClass());
			Class clazz = (Class<T>) ptype.getActualTypeArguments()[0];
			String[] array = json.split("\\|");
			//originalAttachments = AttachmentUtils.getAttachments(array);
			for(IAttachment a : originalAttachments){
				try {
					T t = (T)clazz.newInstance();
					BeanUtils.copyProperties(t, a);
					//OssUpload oss = ApplicationContextUtil.getBean(OssUpload.class);
					//String uploadDir = this.getUploadDir()!=null?this.getUploadDir():t.getUploadDir();
					//oss.storageAttachment(t,uploadDir);
					attachments.add(t);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		//在读取时,将文件复制到目标地址,并且修改地址信息
		return attachments;
	}
	
	public void uploadAttachments(String uploadDir){
		if(attachments==null){
			getAttachments();
		}
		if(attachments.size()==0){
			return;
		}
		//OssUpload oss = ApplicationContextUtil.getBean(OssUpload.class);
		for(T t:attachments){
			//oss.storageAttachment(t,uploadDir);
		}
	}
	public void delAttachments(){
		
	}
	
	public void resizeAttachments(String style){
		if(attachments.size()==0){
			return;
		}
		//OssUpload oss = ApplicationContextUtil.getBean(OssUpload.class);
		for(T t:attachments){
			//if(isImg(t.getSuffix()))
				//oss.resizeAttachment(t,style);
		}
	}
	
	private boolean isImg(String suffix){
		if(StringUtils.isEmpty(suffix))
			return false;
		String[] imgs = {".gif",".jpg",".jpeg",".png",".bmp"};
		for(String img:imgs){
			if(img.equalsIgnoreCase(suffix))
				return true;
		}
		return false;
	}
	
	public void resizeAttachments(){
		
	}
	
	/**
	 * 通过临时保存的附件路径获取最终存储的附件路径
	 * @param oldFilePath
	 * @return
	 */
	public String getNewFilePath(String oldFilePath){
		if(oldFilePath==null||originalAttachments==null||attachments==null)
			return null;
		for(int i=0;i<originalAttachments.size();i++){
			if(oldFilePath.equals(originalAttachments.get(i).getPath())){
				if(attachments.size()>i){
					return attachments.get(i).getPath();
				}
			}
		}
		return null;
	}
	
	
	public String getUploadAttachmentJson() {
		return uploadAttachmentJson;
	}

	public void setUploadAttachmentJson(String uploadAttachmentJson) {
		this.uploadAttachmentJson = uploadAttachmentJson;
	}

	public String getDelAttachmentIds() {
		return delAttachmentIds;
	}

	public void setDelAttachmentIds(String delAttachmentIds) {
		this.delAttachmentIds = delAttachmentIds;
	}
}
