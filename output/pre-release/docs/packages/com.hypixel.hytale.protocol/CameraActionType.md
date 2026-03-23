---
title: "CameraActionType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraActionType"
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
public enum CameraActionType
```

Identifies the type of camera action triggered by a CameraInteraction.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `ForcePerspective` | 0 |  |
| `Orbit` | 1 |  |
| `Transition` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `CameraActionType` constant.

```java
public static CameraActionType fromValue(int value)
```

Returns the `CameraActionType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [CameraInteraction](CameraInteraction.md)
