package RDPCrystalEDILibrary;

public enum SnipTestLevel {
  DoesNotApply(0L),
  Integrity(1L),
  Requirement(2L),
  Balance(3L),
  Situational(4L),
  CodeSet(5L),
  ;
  private long numVal;

  SnipTestLevel(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
