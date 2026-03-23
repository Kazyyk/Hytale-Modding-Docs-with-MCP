---
title: "CameraPerspectiveType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraPerspectiveType"
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
public enum CameraPerspectiveType
```

Specifies first-person or third-person camera perspective.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `First` | 0 |  |
| `Third` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `CameraPerspectiveType` constant.

```java
public static CameraPerspectiveType fromValue(int value)
```

Returns the `CameraPerspectiveType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [CameraInteraction](CameraInteraction.md)
