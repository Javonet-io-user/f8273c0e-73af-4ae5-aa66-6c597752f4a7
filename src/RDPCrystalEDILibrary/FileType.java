package RDPCrystalEDILibrary;

public enum FileType {
  X12(0L),
  EDIFACT(1L),
  ;
  private long numVal;

  FileType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
