package jio.System.IO;

public enum FileOptions {
  None(0L),
  Encrypted(16384L),
  DeleteOnClose(67108864L),
  SequentialScan(134217728L),
  RandomAccess(268435456L),
  Asynchronous(1073741824L),
  WriteThrough(-2147483648L),
  ;
  private long numVal;

  FileOptions(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
