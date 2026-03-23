---
title: "TagPatternType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.TagPatternType"
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
public enum TagPatternType
```

Enum with 4 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Equals` | 0 | Match a single tag by equality. |
| `And` | 1 | Logical AND of child operands. |
| `Or` | 2 | Logical OR of child operands. |
| `Not` | 3 | Logical NOT of a single operand. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `TagPatternType` constant.

```java
public static TagPatternType fromValue(int value)
```

Returns the `TagPatternType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.
