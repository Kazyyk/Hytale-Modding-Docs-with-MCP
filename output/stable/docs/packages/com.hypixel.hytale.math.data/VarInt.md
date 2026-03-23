---
title: "VarInt"
kind: "class"
package: "com.hypixel.hytale.math.data"
fqcn: "com.hypixel.hytale.math.data.VarInt"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "data"
  - "class"
---

**Package:** `com.hypixel.hytale.math.data`

```java
public final class VarInt
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `writeSignedVarLong(long value, DataOutput out) throws IOException` |
| `public static` | `void` | `writeUnsignedVarLong(long value, DataOutput out) throws IOException` |
| `public static` | `void` | `writeSignedVarInt(int value, DataOutput out) throws IOException` |
| `public static` | `void` | `writeUnsignedVarInt(int value, DataOutput out) throws IOException` |
| `public static` | `byte[]` | `writeSignedVarInt(int value)` |
| `public static` | `byte[]` | `writeUnsignedVarInt(int value)` |
| `public static` | `long` | `readSignedVarLong(DataInput in) throws IOException` |
| `public static` | `long` | `readUnsignedVarLong(DataInput in) throws IOException` |
| `public static` | `int` | `readSignedVarInt(DataInput in) throws IOException` |
| `public static` | `int` | `readUnsignedVarInt(DataInput in) throws IOException` |
| `public static` | `int` | `readSignedVarInt(byte[] bytes)` |
| `public static` | `int` | `readUnsignedVarInt(byte[] bytes)` |
