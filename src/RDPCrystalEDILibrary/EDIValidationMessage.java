package RDPCrystalEDILibrary;

public enum EDIValidationMessage {
  None(0L),
  CompositeElementMissing(1L),
  CompositeElementDataFormatInvalid(2L),
  CompositeElementNotUsed(3L),
  CompositeElementRecommended(4L),
  CompositeElementNotRecommended(5L),
  CompositeElementLessThanMinimumLength(6L),
  CompositeElementGreaterThanMaximumLength(7L),
  CompositeElementHasWrongValue(8L),
  CompositeElementValueAlreadyEntered(9L),
  DuplicateSegment(10L),
  DuplicateLoop(11L),
  ElementHasWrongValue(12L),
  InternalElementHasWrongValue(13L),
  ElementLessThanMinimumLength(14L),
  ElementGreaterThanMaximumLength(15L),
  ElementValueAlreadyEntered(16L),
  ElementDataFormatInvalid(17L),
  ElementNotUsed(18L),
  ElementRecommended(19L),
  ElementNotRecommended(20L),
  ElementMissing(21L),
  EmptyTrailingElements(22L),
  EmptyTrailingCompositeElement(23L),
  ExtraElementFound(24L),
  ExtraCompositeElementFound(25L),
  ExtraDataAtEndOfFile(26L),
  LoopMissing(27L),
  LoopNotUsed(28L),
  LoopNotRecommended(29L),
  LoopRecommended(30L),
  MalformedSegment(31L),
  InvalidIntegerValue(32L),
  InvalidDateValue(33L),
  InvalidTimeValue(34L),
  InvalidAlphabeticValue(35L),
  InvalidPositiveNumberValue(36L),
  InvalidNegativeNumberValue(37L),
  InvalidDecimalValue(38L),
  SegmentNotRecommended(39L),
  SegmentNotUsed(40L),
  SegmentNotInDictionary(41L),
  SegmentRecommended(42L),
  SegmentMissing(43L),
  SummaryValueMismatch(44L),
  UnrecognizedLoop(45L),
  UnrecognizedSegment(46L),
  IllegalCharactorInFile(47L),
  MalformedEDIFile(48L),
  MaximumErrorLimitReached(49L),
  UnexpectedError(50L),
  ;
  private long numVal;

  EDIValidationMessage(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
