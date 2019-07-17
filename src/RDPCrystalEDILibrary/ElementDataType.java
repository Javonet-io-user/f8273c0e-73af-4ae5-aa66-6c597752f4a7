package RDPCrystalEDILibrary;

public enum ElementDataType {
  ALPHABETIC(0L),
  IDENTIFIER(1L),
  STRING(2L),
  NUMERIC(3L),
  POSITIVE_NUMERIC(4L),
  NEGATIVE_NUMERIC(5L),
  DECIMAL(6L),
  TIME(7L),
  DATETIME(8L),
  ;
  private long numVal;

  ElementDataType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
