package RDPCrystalEDILibrary;

public enum EDISource {
  DataString(0L),
  File(1L),
  ;
  private long numVal;

  EDISource(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
