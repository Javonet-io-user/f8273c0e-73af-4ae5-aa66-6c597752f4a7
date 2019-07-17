package RDPCrystalEDILibrary;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.*;
import jio.System.Collections.ObjectModel.*;
import jio.System.Collections.Generic.*;
import RDPCrystalEDILibrary.Rules.*;

public class EDIValidator extends Component implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setMaxErrorsBeforeThrowingException(java.lang.Long value) {
    try {
      javonetHandle.set("MaxErrorsBeforeThrowingException", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getMaxErrorsBeforeThrowingException() {
    try {
      java.lang.Long res = javonetHandle.get("MaxErrorsBeforeThrowingException");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCopyElementNumber(java.lang.Boolean value) {
    try {
      javonetHandle.set("CopyElementNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCopyElementNumber() {
    try {
      java.lang.Boolean res = javonetHandle.get("CopyElementNumber");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreventInfiniteLoopWhileSearching(java.lang.Boolean value) {
    try {
      javonetHandle.set("PreventInfiniteLoopWhileSearching", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPreventInfiniteLoopWhileSearching() {
    try {
      java.lang.Boolean res = javonetHandle.get("PreventInfiniteLoopWhileSearching");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFileBlockSize(java.lang.Integer value) {
    try {
      javonetHandle.set("FileBlockSize", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getFileBlockSize() {
    try {
      java.lang.Integer res = javonetHandle.get("FileBlockSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTrackDownUnrecognizedLoops(java.lang.Boolean value) {
    try {
      javonetHandle.set("TrackDownUnrecognizedLoops", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getTrackDownUnrecognizedLoops() {
    try {
      java.lang.Boolean res = javonetHandle.get("TrackDownUnrecognizedLoops");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTrimString(java.lang.String value) {
    try {
      javonetHandle.set("TrimString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTrimString() {
    try {
      java.lang.String res = javonetHandle.get("TrimString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAutoDetectDelimiters(java.lang.Boolean value) {
    try {
      javonetHandle.set("AutoDetectDelimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getAutoDetectDelimiters() {
    try {
      java.lang.Boolean res = javonetHandle.get("AutoDetectDelimiters");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTreatWarningsAsErrors(java.lang.Boolean value) {
    try {
      javonetHandle.set("TreatWarningsAsErrors", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getTreatWarningsAsErrors() {
    try {
      java.lang.Boolean res = javonetHandle.get("TreatWarningsAsErrors");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Double getTimeElapsed() {
    try {
      java.lang.Double res = javonetHandle.get("TimeElapsed");
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIDataString(java.lang.String value) {
    try {
      javonetHandle.set("EDIDataString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEDIDataString() {
    try {
      java.lang.String res = javonetHandle.get("EDIDataString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIFile(java.lang.String value) {
    try {
      javonetHandle.set("EDIFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEDIFile() {
    try {
      java.lang.String res = javonetHandle.get("EDIFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCheckForEmptyTrailingElements(java.lang.Boolean value) {
    try {
      javonetHandle.set("CheckForEmptyTrailingElements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCheckForEmptyTrailingElements() {
    try {
      java.lang.Boolean res = javonetHandle.get("CheckForEmptyTrailingElements");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCheckMinMaxRequirements(java.lang.Boolean value) {
    try {
      javonetHandle.set("CheckMinMaxRequirements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCheckMinMaxRequirements() {
    try {
      java.lang.Boolean res = javonetHandle.get("CheckMinMaxRequirements");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCheckDataTypeRequirements(java.lang.Boolean value) {
    try {
      javonetHandle.set("CheckDataTypeRequirements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCheckDataTypeRequirements() {
    try {
      java.lang.Boolean res = javonetHandle.get("CheckDataTypeRequirements");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIFileType(FileType value) {
    try {
      javonetHandle.set("EDIFileType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FileType getEDIFileType() {
    try {
      Object res = javonetHandle.<NEnum>get("EDIFileType");
      if (res == null) return null;
      return FileType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDISource(EDISource value) {
    try {
      javonetHandle.set("EDISource", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EDISource getEDISource() {
    try {
      Object res = javonetHandle.<NEnum>get("EDISource");
      if (res == null) return null;
      return EDISource.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDebugMode(java.lang.Boolean value) {
    try {
      javonetHandle.set("DebugMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDebugMode() {
    try {
      java.lang.Boolean res = javonetHandle.get("DebugMode");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setLoadValidatedData(java.lang.Boolean value) {
    try {
      javonetHandle.set("LoadValidatedData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getLoadValidatedData() {
    try {
      java.lang.Boolean res = javonetHandle.get("LoadValidatedData");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getPassed() {
    try {
      java.lang.Boolean res = javonetHandle.get("Passed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EDILightWeightDocument getEDILightWeightDocument() {
    try {
      Object res = javonetHandle.<NObject>get("EDILightWeightDocument");
      if (res == null) return null;
      return new EDILightWeightDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumberOfLines() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfLines");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIRulesReader(EDIRulesReader value) {
    try {
      javonetHandle.set("EDIRulesReader", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EDIRulesReader getEDIRulesReader() {
    try {
      Object res = javonetHandle.<NObject>get("EDIRulesReader");
      if (res == null) return null;
      return new EDIRulesReader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIRulesFile(java.lang.String value) {
    try {
      javonetHandle.set("EDIRulesFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEDIRulesFile() {
    try {
      java.lang.String res = javonetHandle.get("EDIRulesFile");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIRulesFileData(java.lang.String value) {
    try {
      javonetHandle.set("EDIRulesFileData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEDIRulesFileData() {
    try {
      java.lang.String res = javonetHandle.get("EDIRulesFileData");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public LightWeightLoop getDataLoop() {
    try {
      Object res = javonetHandle.<NObject>get("DataLoop");
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Collection<EDIError> getErrors() {
    try {
      Object res = javonetHandle.<NObject>get("Errors");
      if (res == null) return null;
      return new Collection<EDIError>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Collection<EDIWarning> getWarnings() {
    try {
      Object res = javonetHandle.<NObject>get("Warnings");
      if (res == null) return null;
      return new Collection<EDIWarning>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getErrorCount() {
    try {
      java.lang.Integer res = javonetHandle.get("ErrorCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getWarningCount() {
    try {
      java.lang.Integer res = javonetHandle.get("WarningCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String[] getEDIFileLines(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("EDIFileLines");
      if (res == null) return null;
      return (java.lang.String[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDelimiters(Delimiters value) {
    try {
      javonetHandle.set("Delimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Delimiters getDelimiters() {
    try {
      Object res = javonetHandle.<NObject>get("Delimiters");
      if (res == null) return null;
      return new Delimiters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public List<LightWeightSegment> getValidatedTransactions() {
    try {
      Object res = javonetHandle.<NObject>get("ValidatedTransactions");
      if (res == null) return null;
      return new List<LightWeightSegment>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setValidatedTransactions(List<LightWeightSegment> param) {
    try {
      javonetHandle.set("ValidatedTransactions", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIValidator(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIValidator", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnCodeCondition",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.CodeConditionEvent handler : _OnCodeConditionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CodeConditionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.ValidationCompletedEvent handler : _ValidationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidationEventsArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidationStarted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.ValidationStartedEvent handler : _ValidationStartedListeners) {
                handler.Invoke(Convert(objects[0], Object.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIValidator() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIValidator");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "OnCodeCondition",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.CodeConditionEvent handler : _OnCodeConditionListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], CodeConditionEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidationCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.ValidationCompletedEvent handler : _ValidationCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], ValidationEventsArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "ValidationStarted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIValidator.ValidationStartedEvent handler : _ValidationStartedListeners) {
                handler.Invoke(Convert(objects[0], Object.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIValidator(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void LoadRuleFile(java.lang.String EDIRulesFilePath) {
    try {
      javonetHandle.invoke("LoadRuleFile", EDIRulesFilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Validate(EDIDocument document) {
    try {
      javonetHandle.invoke("Validate", document);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Validate(EDILightWeightDocument document) {
    try {
      javonetHandle.invoke("Validate", document);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Validate() {
    try {
      javonetHandle.invoke("Validate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Validate(java.lang.String ediFile, java.lang.String ediRuleFile) {
    try {
      javonetHandle.invoke("Validate", ediFile, ediRuleFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ResetValidation() {
    try {
      javonetHandle.invoke("ResetValidation");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<EDIValidator.CodeConditionEvent> _OnCodeConditionListeners =
      new java.util.ArrayList<EDIValidator.CodeConditionEvent>();

  public void addOnCodeCondition(EDIValidator.CodeConditionEvent toAdd) {
    _OnCodeConditionListeners.add(toAdd);
  }

  public void removeOnCodeCondition(EDIValidator.CodeConditionEvent toRemove) {
    _OnCodeConditionListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EDIValidator.GeneralEvent> _ProgressChangedListeners =
      new java.util.ArrayList<EDIValidator.GeneralEvent>();

  public void addProgressChanged(EDIValidator.GeneralEvent toAdd) {
    _ProgressChangedListeners.add(toAdd);
  }

  public void removeProgressChanged(EDIValidator.GeneralEvent toRemove) {
    _ProgressChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EDIValidator.ValidationCompletedEvent> _ValidationCompletedListeners =
      new java.util.ArrayList<EDIValidator.ValidationCompletedEvent>();

  public void addValidationCompleted(EDIValidator.ValidationCompletedEvent toAdd) {
    _ValidationCompletedListeners.add(toAdd);
  }

  public void removeValidationCompleted(EDIValidator.ValidationCompletedEvent toRemove) {
    _ValidationCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EDIValidator.ValidationStartedEvent> _ValidationStartedListeners =
      new java.util.ArrayList<EDIValidator.ValidationStartedEvent>();

  public void addValidationStarted(EDIValidator.ValidationStartedEvent toAdd) {
    _ValidationStartedListeners.add(toAdd);
  }

  public void removeValidationStarted(EDIValidator.ValidationStartedEvent toRemove) {
    _ValidationStartedListeners.remove(toRemove);
  }

  public interface GeneralEvent {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(java.lang.Integer progress);
  }

  public interface ValidationStartedEvent {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender);
  }

  public interface ValidationCompletedEvent {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, ValidationEventsArgs e);
  }

  public interface CodeConditionEvent {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, CodeConditionEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
