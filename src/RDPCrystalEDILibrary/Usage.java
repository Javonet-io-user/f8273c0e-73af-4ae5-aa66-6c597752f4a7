package RDPCrystalEDILibrary;

public enum Usage {
  NOTUSED(0L),
  REQUIRED(1L),
  RECOMMENDED(2L),
  NOTRECOMMENDED(3L),
  OPTIONAL(4L),
  DEPENDENT(5L),
  LOCALCODE(6L),
  USE_DEFAULT(7L),
  ;
  private long numVal;

  Usage(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
