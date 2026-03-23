---
title: "ConnectedBlockRuleSetType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ConnectedBlockRuleSetType"
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
public enum ConnectedBlockRuleSetType
```

Identifies the type of connected block rule set.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Stair` | 0 |  |
| `Roof` | 1 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `ConnectedBlockRuleSetType` constant.

```java
public static ConnectedBlockRuleSetType fromValue(int value)
```

Returns the `ConnectedBlockRuleSetType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`1`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [ConnectedBlockRuleSet](ConnectedBlockRuleSet.md)
