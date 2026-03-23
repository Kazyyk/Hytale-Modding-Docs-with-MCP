---
title: "ByteBufUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.util.io"
fqcn: "com.hypixel.hytale.server.core.util.io.ByteBufUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "io"
---

**Package:** `com.hypixel.hytale.server.core.util.io`

```java
public class ByteBufUtil
```

Class in the io subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `MAX_UNSIGNED_SHORT_VALUE` | `int` | Static int field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `writeUTF(@Nonnull ByteBuf buf, @Nonnull String string)` | `void` | static public method. |
| `readUTF(@Nonnull ByteBuf buf)` | `String` | static public method. |
| `writeByteArray(@Nonnull ByteBuf buf, @Nonnull byte[] arr)` | `void` | static public method. |
| `writeByteArray(@Nonnull ByteBuf buf, byte[] arr, int src, int length)` | `void` | static public method. |
| `readByteArray(@Nonnull ByteBuf buf)` | `byte[]` | static public method. |
| `getBytesRelease(@Nonnull ByteBuf buf)` | `byte[]` | static public method. |
| `writeNumber(@Nonnull ByteBuf buf, int bytes, int value)` | `void` | static public method. |
| `readNumber(@Nonnull ByteBuf buf, int bytes)` | `int` | static public method. |
| `writeBitSet(@Nonnull ByteBuf buf, @Nonnull BitSet bitset)` | `void` | static public method. |
| `readBitSet(@Nonnull ByteBuf buf, @Nonnull BitSet bitset)` | `void` | static public method. |
