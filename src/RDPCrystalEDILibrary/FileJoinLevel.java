package RDPCrystalEDILibrary;

public enum FileJoinLevel {
  FUNCTIONALGROUP(0L),
  HEADER(1L),
  ;
  private long numVal;

  FileJoinLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
