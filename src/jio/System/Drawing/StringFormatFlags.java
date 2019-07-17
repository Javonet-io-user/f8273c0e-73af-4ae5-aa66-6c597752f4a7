package jio.System.Drawing;

public enum StringFormatFlags {
  DirectionRightToLeft(1L),
  DirectionVertical(2L),
  FitBlackBox(4L),
  DisplayFormatControl(32L),
  NoFontFallback(1024L),
  MeasureTrailingSpaces(2048L),
  NoWrap(4096L),
  LineLimit(8192L),
  NoClip(16384L),
  ;
  private long numVal;

  StringFormatFlags(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
