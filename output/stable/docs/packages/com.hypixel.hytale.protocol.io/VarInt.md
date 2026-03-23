---
title: "VarInt"
kind: "class"
package: "com.hypixel.hytale.protocol.io"
fqcn: "com.hypixel.hytale.protocol.io.VarInt"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "io"
  - "class"
---

**Package:** `com.hypixel.hytale.protocol.io`

```java
public final class VarInt
```

Utility class for reading and writing variable-length integers (VarInt encoding) to Netty `ByteBuf` buffers. Supports values up to 5 bytes.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `write(ByteBuf buf, int value)` |
| `public static` | `int` | `read(ByteBuf buf)` |
| `public static` | `int` | `peek(ByteBuf buf, int index)` |
| `public static` | `int` | `length(ByteBuf buf, int index)` |
| `public static` | `int` | `size(int value)` |
