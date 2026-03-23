---
title: "Phobia"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Phobia"
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
public enum Phobia
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `None` | 0 | No phobia filter applied. |
| `Arachnophobia` | 1 | Arachnophobia mode (replaces spider-like entities). |
| `Ophidiophobia` | 2 | Ophidiophobia mode (replaces snake-like entities). |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `Phobia` constant.

```java
public static Phobia fromValue(int value)
```

Returns the `Phobia` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
