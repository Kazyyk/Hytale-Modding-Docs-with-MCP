---
title: "FailOnType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.FailOnType"
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
public enum FailOnType
```

Determines what target type causes an interaction to fail.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Neither` | 0 |  |
| `Entity` | 1 |  |
| `Block` | 2 |  |
| `Either` | 3 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `FailOnType` constant.

```java
public static FailOnType fromValue(int value)
```

Returns the `FailOnType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
