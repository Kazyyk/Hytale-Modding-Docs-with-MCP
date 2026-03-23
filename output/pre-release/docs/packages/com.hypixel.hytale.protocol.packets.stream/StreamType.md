---
title: "StreamType"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.stream"
fqcn: "com.hypixel.hytale.protocol.packets.stream.StreamType"
api_surface: false
extends: "java.lang.Enum"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "protocol"
  - "stream"
---

**Package:** `com.hypixel.hytale.protocol.packets.stream`

```java
public enum StreamType
```

Enumerates the types of network streams that can be opened between client and server.

## Enum Constants

| Constant | Value |
|---|---|
| `Game` | `0` |
| `Voice` | `1` |

## Methods

```java
public int getValue()
```

Returns the integer wire value of this stream type.

```java
public static StreamType fromValue(int value)
```

Returns the `StreamType` for the given wire value. Throws `ProtocolException` if the value is out of range.

## Related Types

- [StreamOpen](StreamOpen.md) -- packet that uses this enum
- [StreamOpenResponse](StreamOpenResponse.md) -- response packet that uses this enum
