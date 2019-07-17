package RDPCrystalEDILibrary;

public enum FileSplitLevel {
  FUNCTIONALGROUP(0L),
  HEADER(1L),
  ENVELOPE(2L),
  ;
  private long numVal;

  FileSplitLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
