---
title: "EntityMatcherType"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.EntityMatcherType"
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
public enum EntityMatcherType
```

Identifies the category of entity matching: server-side, vulnerability-based, or player-specific.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Server` | 0 |  |
| `VulnerableMatcher` | 1 |  |
| `Player` | 2 |  |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `EntityMatcherType` constant.

```java
public static EntityMatcherType fromValue(int value)
```

Returns the `EntityMatcherType` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- [EntityMatcher](EntityMatcher.md)
