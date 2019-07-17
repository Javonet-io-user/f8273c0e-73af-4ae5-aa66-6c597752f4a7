package RDPCrystalEDILibrary;

public enum DocumentCreator {
  None(0L),
  EDIFileLoader(1L),
  EDIValidator(2L),
  ;
  private long numVal;

  DocumentCreator(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
