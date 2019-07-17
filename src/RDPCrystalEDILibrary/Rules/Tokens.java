package RDPCrystalEDILibrary.Rules;

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
import RDPCrystalEDILibrary.Rules.*;

public class Tokens {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCOMMA() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("COMMA");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCOMMA(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("COMMA", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSEMICOLON() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("SEMICOLON");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSEMICOLON(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SEMICOLON", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSPACE() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("SPACE");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSPACE(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SPACE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getEQUAL() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("EQUAL");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEQUAL(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("EQUAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getEQUALSS() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("EQUALSS");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEQUALSS(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("EQUALSS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getEND() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("END");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEND(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("END", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getIFSTATEMENT() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("IFSTATEMENT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIFSTATEMENT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("IFSTATEMENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getELSEIFSTATEMENT() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ELSEIFSTATEMENT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setELSEIFSTATEMENT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ELSEIFSTATEMENT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getIF() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("IF");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIF(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("IF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getELSEIF() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ELSEIF");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setELSEIF(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ELSEIF", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getELSE() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ELSE");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setELSE(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ELSE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getNULL() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("NULL");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNULL(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("NULL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSYMBOL() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("SYMBOL");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSYMBOL(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SYMBOL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSEGPOS() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("SEGPOS");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSEGPOS(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SEGPOS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getELEMPOS() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ELEMPOS");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setELEMPOS(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ELEMPOS", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSTRINGLIST() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("STRINGLIST");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSTRINGLIST(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("STRINGLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getINTEGERINDEXLIST() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("INTEGERINDEXLIST");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setINTEGERINDEXLIST(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("INTEGERINDEXLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getINTEGERLIST() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("INTEGERLIST");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setINTEGERLIST(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("INTEGERLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getINDEXER() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("INDEXER");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setINDEXER(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("INDEXER", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getINT() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("INT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setINT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("INT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getFLOAT() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("FLOAT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFLOAT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("FLOAT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCONDITION() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("CONDITION");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCONDITION(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("CONDITION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getGREATERTHAN() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("GREATERTHAN");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGREATERTHAN(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("GREATERTHAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getGREATERTHANOREQUALTO() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("GREATERTHANOREQUALTO");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGREATERTHANOREQUALTO(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("GREATERTHANOREQUALTO", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getLESSTHAN() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("LESSTHAN");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLESSTHAN(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("LESSTHAN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getLESSTHANOREQUALTO() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("LESSTHANOREQUALTO");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLESSTHANOREQUALTO(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("LESSTHANOREQUALTO", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getNOTEQUAL() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("NOTEQUAL");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNOTEQUAL(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("NOTEQUAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getAND() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("AND");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAND(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("AND", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getOR() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("OR");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOR(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("OR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getLEFT() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("LEFT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLEFT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("LEFT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getLEFTBRACKET() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("LEFTBRACKET");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLEFTBRACKET(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("LEFTBRACKET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getRIGHT() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("RIGHT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRIGHT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("RIGHT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getRIGHTBRACKET() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("RIGHTBRACKET");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRIGHTBRACKET(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("RIGHTBRACKET", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getDOT() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("DOT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDOT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("DOT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getTHEN() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("THEN");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTHEN(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("THEN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getLOCALCODE() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("LOCALCODE");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setLOCALCODE(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("LOCALCODE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getERROR() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ERROR");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setERROR(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ERROR", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getUSAGE() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("USAGE");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUSAGE(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("USAGE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getELEMENTLIST() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ELEMENTLIST");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setELEMENTLIST(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ELEMENTLIST", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getREQUIRED() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("REQUIRED");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setREQUIRED(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("REQUIRED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getNOTUSED() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("NOTUSED");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNOTUSED(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("NOTUSED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getOPTIONAL() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("OPTIONAL");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOPTIONAL(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("OPTIONAL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getRECOMMENDED() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("RECOMMENDED");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRECOMMENDED(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("RECOMMENDED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getNOTRECOMMENDED() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("NOTRECOMMENDED");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNOTRECOMMENDED(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("NOTRECOMMENDED", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getDEFAULT() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("DEFAULT");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDEFAULT(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("DEFAULT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSegmentNotUsed() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("SegmentNotUsed");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSegmentNotUsed(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SegmentNotUsed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSegmentRecommended() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("SegmentRecommended");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSegmentRecommended(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SegmentRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSegmentMissing() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("SegmentMissing");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSegmentMissing(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SegmentMissing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSegmentNotRecommended() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
              .<NObject>get("SegmentNotRecommended");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSegmentNotRecommended(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("SegmentNotRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getElementHasWrongValue() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ElementHasWrongValue");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setElementHasWrongValue(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ElementHasWrongValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getElementNotUsed() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ElementNotUsed");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setElementNotUsed(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ElementNotUsed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getElementRecommended() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ElementRecommended");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setElementRecommended(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ElementRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getElementNotRecommended() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
              .<NObject>get("ElementNotRecommended");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setElementNotRecommended(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ElementNotRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getElementMissing() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("ElementMissing");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setElementMissing(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("ElementMissing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCompositeElementHasWrongValue() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
              .<NObject>get("CompositeElementHasWrongValue");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCompositeElementHasWrongValue(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
          .set("CompositeElementHasWrongValue", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCompositeElementNotUsed() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
              .<NObject>get("CompositeElementNotUsed");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCompositeElementNotUsed(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("CompositeElementNotUsed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCompositeElementRecommended() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
              .<NObject>get("CompositeElementRecommended");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCompositeElementRecommended(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
          .set("CompositeElementRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCompositeElementNotRecommended() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
              .<NObject>get("CompositeElementNotRecommended");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCompositeElementNotRecommended(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
          .set("CompositeElementNotRecommended", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCompositeElementMissing() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens")
              .<NObject>get("CompositeElementMissing");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCompositeElementMissing(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("CompositeElementMissing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getSTRING() {
    try {
      Object res = Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("STRING");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSTRING(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("STRING", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static TokenDefinition getCODECONDITION() {
    try {
      Object res =
          Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").<NObject>get("CODECONDITION");
      if (res == null) return null;
      return new TokenDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCODECONDITION(TokenDefinition param) {
    try {
      Javonet.getType("RDPCrystalEDILibrary.Rules.Tokens").set("CODECONDITION", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
