/* (C)2020 */
package saps.catalog.core.retry.catalog;

import java.lang.Integer;
import java.util.List;
import saps.catalog.core.Catalog;
import saps.common.core.model.SapsImage;

public class GetTasksCompletedWithPagination implements CatalogRetry<List<SapsImage>> {

  private Catalog imageStore;
  private Integer page;
  private Integer size;
  private String sortField;
  private String sortOrder;

  public GetTasksCompletedWithPagination(Catalog imageStore, Integer page, Integer size, String sortField, String sortOrder) {
    this.imageStore = imageStore;
    this.page = page;
    this.size = size;
    this.sortField = sortField; 
    this.sortOrder = sortOrder;
  }

  @Override
  public List<SapsImage> run() {
    return imageStore.getTasksCompletedWithPagination(page, size, sortField, sortOrder);
  }
}

