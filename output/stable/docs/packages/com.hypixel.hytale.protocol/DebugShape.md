---
title: "DebugShape"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.DebugShape"
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
public enum DebugShape
```

Identifies geometric shapes used for debug visualization.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Sphere` | 0 |  |
| `Cylinder` | 1 |  |
| `Cone` | 2 |  |
| `Cube` | 3 |  |
| `Frustum` | 4 |  |
| `Sector` | 5 |  |
| `Disc` | 6 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `DebugShape` constant.

```java
public static DebugShape fromValue(int value)
```

Returns the `DebugShape` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`6`). The static `VALUES` array is used for O(1) lookup by ordinal.
