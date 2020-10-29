package saps.catalog.core.retry.catalog;

import saps.common.core.model.SapsImage;

import saps.catalog.core.Catalog;

public class UpdateTaskRetry implements CatalogRetry<Boolean>{

	private Catalog imageStore;
	private SapsImage task;

	public UpdateTaskRetry(Catalog imageStore, SapsImage task) {
		this.imageStore = imageStore;
		this.task = task;
	}
	
	@Override
	public Boolean run() {
		task.setUpdateTime(imageStore.getTaskById(task.getTaskId()).getUpdateTime());
		imageStore.updateImageTask(task);
		return true;
	}

}
