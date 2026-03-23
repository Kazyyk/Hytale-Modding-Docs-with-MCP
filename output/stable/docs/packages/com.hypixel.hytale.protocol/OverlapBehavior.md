---
title: "OverlapBehavior"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.OverlapBehavior"
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
public enum OverlapBehavior
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Extend` | 0 | Extend the existing value when overlapping. |
| `Overwrite` | 1 | Overwrite the existing value. |
| `Ignore` | 2 | Ignore the new value and keep existing. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `OverlapBehavior` constant.

```java
public static OverlapBehavior fromValue(int value)
```

Returns the `OverlapBehavior` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
