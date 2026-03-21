---
title: "BuilderToolOptionArg"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.buildertools"
fqcn: "com.hypixel.hytale.protocol.packets.buildertools.BuilderToolOptionArg"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "protocol"
  - "buildertools"
  - "struct"
---

**Package:** `com.hypixel.hytale.protocol.packets.buildertools`

```java
public class BuilderToolOptionArg
```

Option-list argument for builder tools with a default selection and array of option strings.

## Fields

| Field | Type |
|---|---|
| `defaultValue` | `String` |
| `options` | `String[]` |

## Protocol Methods

| Method | Return Type | Description |
|---|---|---|
| `deserialize(ByteBuf, int)` | `BuilderToolOptionArg` | Reads this struct from a buffer at the given offset |
| `serialize(ByteBuf)` | `void` | Writes this struct to a buffer |
| `computeSize()` | `int` | Returns the serialized size in bytes |
| `validateStructure(ByteBuf, int)` | `ValidationResult` | Validates buffer structure without full deserialization |
| `clone()` | `BuilderToolOptionArg` | Creates a shallow copy |
