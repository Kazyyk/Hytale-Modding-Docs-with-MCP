---
title: "AccumulationMode"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.AccumulationMode"
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
public enum AccumulationMode
```

Determines how multiple values are combined when accumulated. Used in stat calculations and effect stacking.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Set` | 0 |  |
| `Sum` | 1 |  |
| `Average` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `AccumulationMode` constant.

```java
public static AccumulationMode fromValue(int value)
```

Returns the `AccumulationMode` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
