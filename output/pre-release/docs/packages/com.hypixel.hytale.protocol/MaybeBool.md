---
title: "MaybeBool"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MaybeBool"
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
public enum MaybeBool
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Null` | 0 | No value set (tri-state null). |
| `False` | 1 | Boolean false. |
| `True` | 2 | Boolean true. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `MaybeBool` constant.

```java
public static MaybeBool fromValue(int value)
```

Returns the `MaybeBool` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
