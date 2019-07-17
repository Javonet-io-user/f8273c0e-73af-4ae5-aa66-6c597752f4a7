package jio.System.Drawing;

public enum StringAlignment {
  Near(0L),
  Center(1L),
  Far(2L),
  ;
  private long numVal;

  StringAlignment(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
