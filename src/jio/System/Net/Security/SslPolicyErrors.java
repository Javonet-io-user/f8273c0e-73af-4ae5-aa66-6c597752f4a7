package jio.System.Net.Security;

public enum SslPolicyErrors {
  None(0L),
  RemoteCertificateNotAvailable(1L),
  RemoteCertificateNameMismatch(2L),
  RemoteCertificateChainErrors(4L),
  ;
  private long numVal;

  SslPolicyErrors(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
