package com.guri.lucene.puddle;

import org.apache.lucene.index.DocValuesType;
import org.apache.lucene.index.IndexOptions;
import org.apache.lucene.index.IndexableFieldType;

public class IndexableFieldTypeOptions implements IndexableFieldType {

	@Override
	public boolean stored() {
		return false;
	}

	@Override
	public boolean tokenized() {
		return true;
	}

	@Override
	public boolean storeTermVectors() {
		return true;
	}

	@Override
	public boolean storeTermVectorOffsets() {
		return true;
	}

	@Override
	public boolean storeTermVectorPositions() {
		return true;
	}

	@Override
	public boolean storeTermVectorPayloads() {
		return true;
	}

	@Override
	public boolean omitNorms() {
		return true;
	}

	@Override
	public IndexOptions indexOptions() {
		return IndexOptions.DOCS_AND_FREQS_AND_POSITIONS;
	}

	@Override
	public DocValuesType docValuesType() {
		return DocValuesType.NONE;
	}

	@Override
	public int pointDimensionCount() {
		return 0;
	}

	@Override
	public int pointNumBytes() {
		return 0;
	}

}
