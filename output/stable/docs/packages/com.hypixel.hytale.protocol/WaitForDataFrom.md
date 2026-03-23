---
title: "WaitForDataFrom"
kind: "enum"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.WaitForDataFrom"
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
public enum WaitForDataFrom
```

Enum with 3 constants used in the protocol serialization layer.

## Constants

| Constant | Ordinal | Description |
|---|---|---|
| `Client` | 0 | Wait for data from the client. |
| `Server` | 1 | Wait for data from the server. |
| `None` | 2 | Do not wait for data. |

## Methods

```java
public int getValue()
```

Returns the integer wire value for this `WaitForDataFrom` constant.

```java
public static WaitForDataFrom fromValue(int value)
```

Returns the `WaitForDataFrom` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`2`). The static `VALUES` array is used for O(1) lookup by ordinal.
