package RDPCrystalEDILibrary;

public enum RuleOperator {
  EQ(0L),
  NE(1L),
  GT(2L),
  GE(3L),
  LT(4L),
  LE(5L),
  EXISTS(6L),
  NEXIST(7L),
  ;
  private long numVal;

  RuleOperator(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
