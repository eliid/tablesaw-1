package com.github.lwhite1.tablesaw.filter.dates;

import com.github.lwhite1.tablesaw.Table;
import com.github.lwhite1.tablesaw.columns.ColumnReference;
import com.github.lwhite1.tablesaw.columns.LocalDateColumn;
import com.github.lwhite1.tablesaw.filter.ColumnFilter;
import org.roaringbitmap.RoaringBitmap;

/**
 *
 */
public class LocalDateIsInNovember extends ColumnFilter {

  public LocalDateIsInNovember(ColumnReference reference) {
    super(reference);
  }

  @Override
  public RoaringBitmap apply(Table relation) {
    LocalDateColumn dateColumn = (LocalDateColumn) relation.column(columnReference().getColumnName());
    return dateColumn.isInNovember();
  }
}