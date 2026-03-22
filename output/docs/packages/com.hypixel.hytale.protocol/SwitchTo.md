---
title: "SwitchTo"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SwitchTo"
api_surface: false
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
public enum SwitchTo
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Disappear` | 0 | Entity disappears on switch. |
| `PostColor` | 1 | Apply post-processing color effect. |
| `Distortion` | 2 | Apply distortion effect. |
| `Transparency` | 3 | Apply transparency effect. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `SwitchTo` constant.

```java
public static SwitchTo fromValue(int value)
```

Returns the `SwitchTo` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
