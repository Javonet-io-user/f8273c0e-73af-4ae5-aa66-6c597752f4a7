package jio.System.Security.AccessControl;

public enum FileSystemRights {
  ListDirectory(1L),
  WriteData(2L),
  AppendData(4L),
  ReadExtendedAttributes(8L),
  WriteExtendedAttributes(16L),
  Traverse(32L),
  DeleteSubdirectoriesAndFiles(64L),
  ReadAttributes(128L),
  WriteAttributes(256L),
  Write(278L),
  Delete(65536L),
  ReadPermissions(131072L),
  Read(131209L),
  ReadAndExecute(131241L),
  Modify(197055L),
  ChangePermissions(262144L),
  TakeOwnership(524288L),
  Synchronize(1048576L),
  FullControl(2032127L),
  ;
  private long numVal;

  FileSystemRights(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
