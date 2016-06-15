/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gemstone.gemfire.codeAnalysis.decode.cp;
import java.io.*;

public class CpLong extends Cp {
    byte b1;
    byte b2;
    byte b3;
    byte b4;
    byte b5;
    byte b6;
    byte b7;
    byte b8;
    CpLong( DataInputStream source ) throws IOException {
        b1 = (byte)source.readUnsignedByte();
        b2 = (byte)source.readUnsignedByte();
        b3 = (byte)source.readUnsignedByte();
        b4 = (byte)source.readUnsignedByte();
        b5 = (byte)source.readUnsignedByte();
        b6 = (byte)source.readUnsignedByte();
        b7 = (byte)source.readUnsignedByte();
        b8 = (byte)source.readUnsignedByte();
    }
}