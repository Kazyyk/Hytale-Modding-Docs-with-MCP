---
title: "CameraNode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.CameraNode"
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
public enum CameraNode
```

Protocol enum type in the Hytale client-server protocol.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 |  |
| `Head` | 1 |  |
| `LShoulder` | 2 |  |
| `RShoulder` | 3 |  |
| `Belly` | 4 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `CameraNode` constant.

```java
public static CameraNode fromValue(int value)
```

Returns the `CameraNode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`4`). The static `VALUES` array is used for O(1) lookup by ordinal.
