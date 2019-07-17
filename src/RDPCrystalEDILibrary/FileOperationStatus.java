package RDPCrystalEDILibrary;

public enum FileOperationStatus {
  NotSet(0L),
  Success(1L),
  Failure(2L),
  ;
  private long numVal;

  FileOperationStatus(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
