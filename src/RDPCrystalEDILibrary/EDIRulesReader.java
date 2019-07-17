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
import jio.System.Collections.Generic.*;
import jio.System.IO.*;

public class EDIRulesReader extends Component implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.String, java.lang.String> getLoopDescriptions() {
    try {
      Object res = javonetHandle.<NObject>get("LoopDescriptions");
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSampleData(List<java.lang.String> value) {
    try {
      javonetHandle.set("SampleData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<java.lang.String> getSampleData() {
    try {
      Object res = javonetHandle.<NObject>get("SampleData");
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getParsed() {
    try {
      java.lang.Boolean res = javonetHandle.get("Parsed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumberOfLoopsCreated() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfLoopsCreated");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<ElementCounterDisplay> getElementCounterDisplays() {
    try {
      Object res = javonetHandle.<NObject>get("ElementCounterDisplays");
      if (res == null) return null;
      return new List<ElementCounterDisplay>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<SummaryDisplay> getSummaries() {
    try {
      Object res = javonetHandle.<NObject>get("Summaries");
      if (res == null) return null;
      return new List<SummaryDisplay>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<ElementEqualityDisplay> getElementEqualities() {
    try {
      Object res = javonetHandle.<NObject>get("ElementEqualities");
      if (res == null) return null;
      return new List<ElementEqualityDisplay>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<RuleDisplay> getRules() {
    try {
      Object res = javonetHandle.<NObject>get("Rules");
      if (res == null) return null;
      return new List<RuleDisplay>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SortedDictionary<java.lang.Integer, Element> getElements() {
    try {
      Object res = javonetHandle.<NObject>get("Elements");
      if (res == null) return null;
      return new SortedDictionary<java.lang.Integer, Element>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SortedDictionary<java.lang.String, Segment> getSegments() {
    try {
      Object res = javonetHandle.<NObject>get("Segments");
      if (res == null) return null;
      return new SortedDictionary<java.lang.String, Segment>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRuleFileData(Dictionary<java.lang.String, java.lang.String> value) {
    try {
      javonetHandle.set("RuleFileData", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.String, java.lang.String> getRuleFileData() {
    try {
      Object res = javonetHandle.<NObject>get("RuleFileData");
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SortedDictionary<java.lang.String, Segment> getCompositesSegments() {
    try {
      Object res = javonetHandle.<NObject>get("CompositesSegments");
      if (res == null) return null;
      return new SortedDictionary<java.lang.String, Segment>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.Integer, ElementCodeList> getElementCodes() {
    try {
      Object res = javonetHandle.<NObject>get("ElementCodes");
      if (res == null) return null;
      return new Dictionary<java.lang.Integer, ElementCodeList>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.Integer, SegmentSchema> getSegmentSchemas() {
    try {
      Object res = javonetHandle.<NObject>get("SegmentSchemas");
      if (res == null) return null;
      return new Dictionary<java.lang.Integer, SegmentSchema>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.String, java.lang.String> getFileData() {
    try {
      Object res = javonetHandle.<NObject>get("FileData");
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.String, CodeList> getCodeLists() {
    try {
      Object res = javonetHandle.<NObject>get("CodeLists");
      if (res == null) return null;
      return new Dictionary<java.lang.String, CodeList>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Dictionary<java.lang.String, java.lang.String> getElementFormats() {
    try {
      Object res = javonetHandle.<NObject>get("ElementFormats");
      if (res == null) return null;
      return new Dictionary<java.lang.String, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Loop getSchema() {
    try {
      Object res = javonetHandle.<NObject>get("Schema");
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIRulesFilePath(java.lang.String value) {
    try {
      javonetHandle.set("EDIRulesFilePath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEDIRulesFilePath() {
    try {
      java.lang.String res = javonetHandle.get("EDIRulesFilePath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEDIRulesFile(Stream value) {
    try {
      javonetHandle.set("EDIRulesFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Stream getEDIRulesFile() {
    try {
      Object res = javonetHandle.<NObject>get("EDIRulesFile");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public EDIRulesReader(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesReader", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIRulesReader.GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnErrorOccurred",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIRulesReader.ErrorEvent handler : _OnErrorOccurredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EDIRulesReaderEventArg.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesReader() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesReader");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIRulesReader.GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnErrorOccurred",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIRulesReader.ErrorEvent handler : _OnErrorOccurredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EDIRulesReaderEventArg.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesReader(java.lang.String ediRuleFilePath) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIRulesReader", ediRuleFilePath);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIRulesReader.GeneralEvent handler : _ProgressChangedListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "OnErrorOccurred",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EDIRulesReader.ErrorEvent handler : _OnErrorOccurredListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], EDIRulesReaderEventArg.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIRulesReader(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Reset() {
    try {
      javonetHandle.invoke("Reset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Parse(java.lang.String rulesFilePath) {
    try {
      javonetHandle.invoke("Parse", rulesFilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Parse() {
    try {
      javonetHandle.invoke("Parse");
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

  private java.util.ArrayList<EDIRulesReader.GeneralEvent> _ProgressChangedListeners =
      new java.util.ArrayList<EDIRulesReader.GeneralEvent>();

  public void addProgressChanged(EDIRulesReader.GeneralEvent toAdd) {
    _ProgressChangedListeners.add(toAdd);
  }

  public void removeProgressChanged(EDIRulesReader.GeneralEvent toRemove) {
    _ProgressChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<EDIRulesReader.ErrorEvent> _OnErrorOccurredListeners =
      new java.util.ArrayList<EDIRulesReader.ErrorEvent>();

  public void addOnErrorOccurred(EDIRulesReader.ErrorEvent toAdd) {
    _OnErrorOccurredListeners.add(toAdd);
  }

  public void removeOnErrorOccurred(EDIRulesReader.ErrorEvent toRemove) {
    _OnErrorOccurredListeners.remove(toRemove);
  }

  public interface GeneralEvent {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(java.lang.Integer progress);
  }

  public interface ErrorEvent {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(Object sender, EDIRulesReaderEventArg e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
