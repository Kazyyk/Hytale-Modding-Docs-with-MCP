---
title: "SupportMatch"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.SupportMatch"
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
public enum SupportMatch
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Ignored` | 0 | Block face support is not checked. |
| `Required` | 1 | Block face support is required. |
| `Disallowed` | 2 | Block face support is disallowed. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `SupportMatch` constant.

```java
public static SupportMatch fromValue(int value)
```

Returns the `SupportMatch` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
