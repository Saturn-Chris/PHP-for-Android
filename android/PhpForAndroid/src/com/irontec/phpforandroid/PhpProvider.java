package com.irontec.phpforandroid;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.googlecode.android_scripting.interpreter.InterpreterConstants;
import com.googlecode.android_scripting.interpreter.InterpreterDescriptor;
import com.googlecode.android_scripting.interpreter.InterpreterProvider;
import com.googlecode.android_scripting.interpreter.InterpreterUtils;

public class PhpProvider extends InterpreterProvider {

  private static final String ENV_HOME = "PHPHOME";
  private static final String ENV_PATH = "PHPPATH";
  private static final String ENV_TEMP = "TEMP";
  private static final String ENV_DATA = "ANDROID_DATA"; // Is it really used somewhere?


  @Override
  protected InterpreterDescriptor getDescriptor() {
    return new PhpDescriptor();
  }
//
//  private String getExtrasRoot() {
//    return InterpreterConstants.SDCARD_ROOT + getClass().getPackage().getName()
//        + InterpreterConstants.INTERPRETER_EXTRAS_ROOT;
//  }
//
//  private String getHome() {
//    File file = InterpreterUtils.getInterpreterRoot(mContext, mDescriptor.getName());
//    return file.getAbsolutePath();
//  }
//
//  private String getExtras() {
//    File file = new File(getExtrasRoot(), mDescriptor.getName());
//    return file.getAbsolutePath();
//  }
//
//  private String getTemp() {
//    File tmp = new File(getExtrasRoot(), mDescriptor.getName() + "/tmp");
//    if (!tmp.isDirectory()) {
//      tmp.mkdir();
//    }
//    return tmp.getAbsolutePath();
//  }
//
//  @Override
//  protected Map<String, String> getEnvironmentSettings() {
//    Map<String, String> settings = new HashMap<String, String>(3);
//    settings.put(ENV_HOME, getHome());
//    settings.put(ENV_PATH, getExtras());
//    settings.put(ENV_TEMP, getTemp());
//    return settings;
//  }
//
//  private String getHome() {
//    File parent = mContext.getFilesDir().getParentFile();
//    File file = new File(parent, mDescriptor.getName());
//    return file.getAbsolutePath();
//  }
//
//  private String getExtras() {
//    File file = new File(InterpreterConstants.INTERPRETER_EXTRAS_ROOT, mDescriptor.getName());
//    return file.getAbsolutePath();
//  }
//
//  private String getTemp() {
//    File tmp =
//        new File(InterpreterConstants.INTERPRETER_EXTRAS_ROOT, mDescriptor.getName() + "/tmp");
//    if (!tmp.isDirectory()) {
//      tmp.mkdir();
//    }
//    return tmp.getAbsolutePath();
//  }
//
//  @Override
//  protected Map<String, String> getEnvironmentSettings() {
//    Map<String, String> settings = new HashMap<String, String>(3);
//    settings.put(ENV_HOME, getHome());
//    settings.put(ENV_PATH, getExtras());
//    settings.put(ENV_TEMP, getTemp());
//    return settings;
//  }
  
  @Override
  protected Map<String, String> getEnvironmentSettings() {
    Map<String, String> settings = new HashMap<String, String>(1);
    settings.put(ENV_DATA, InterpreterConstants.SDCARD_ROOT + getClass().getPackage().getName());
    return settings;
  }

}
