package jio.System.Security.Cryptography.X509Certificates;

public enum X509KeyStorageFlags {
  DefaultKeySet(0L),
  UserKeySet(1L),
  MachineKeySet(2L),
  Exportable(4L),
  UserProtected(8L),
  PersistKeySet(16L),
  EphemeralKeySet(32L),
  ;
  private long numVal;

  X509KeyStorageFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
