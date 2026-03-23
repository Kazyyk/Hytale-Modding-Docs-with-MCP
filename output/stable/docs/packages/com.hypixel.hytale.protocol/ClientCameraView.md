---
title: "ClientCameraView"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ClientCameraView"
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
public enum ClientCameraView
```

Identifies the client's current camera view mode.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `FirstPerson` | 0 |  |
| `ThirdPerson` | 1 |  |
| `Custom` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ClientCameraView` constant.

```java
public static ClientCameraView fromValue(int value)
```

Returns the `ClientCameraView` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
