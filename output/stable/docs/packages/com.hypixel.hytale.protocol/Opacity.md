---
title: "Opacity"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Opacity"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "enum"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public enum Opacity
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Solid` | 0 | Fully opaque rendering. |
| `Semitransparent` | 1 | Partially transparent rendering with blending. |
| `Cutout` | 2 | Binary transparency (alpha test cutout). |
| `Transparent` | 3 | Fully transparent rendering. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `Opacity` constant.

```java
public static Opacity fromValue(int value)
```

Returns the `Opacity` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
