/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019-2020 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.hal.simulation;

import edu.wpi.first.hal.HALValue;

@FunctionalInterface
public interface SimValueCallback2 {
  void callback(String name, int handle, int direction, HALValue value);

  default void callbackNative(String name, int handle, int direction, int type, long value1, double value2) {
    callback(name, handle, direction, HALValue.fromNative(type, value1, value2));
  }
}
