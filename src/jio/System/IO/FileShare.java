package jio.System.IO;

public enum FileShare {
  None(0L),
  Read(1L),
  Write(2L),
  ReadWrite(3L),
  Delete(4L),
  Inheritable(16L),
  ;
  private long numVal;

  FileShare(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
