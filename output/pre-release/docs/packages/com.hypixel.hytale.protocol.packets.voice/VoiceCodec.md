---
title: "VoiceCodec"
kind: "enum"
package: "com.hypixel.hytale.protocol.packets.voice"
fqcn: "com.hypixel.hytale.protocol.packets.voice.VoiceCodec"
api_surface: false
extends: "java.lang.Enum"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "protocol"
  - "voice"
---

**Package:** `com.hypixel.hytale.protocol.packets.voice`

```java
public enum VoiceCodec
```

Enumerates the audio codecs supported by the voice chat system.

## Enum Constants

| Constant | Value |
|---|---|
| `Opus` | `0` |

## Methods

```java
public int getValue()
```

Returns the integer wire value of this codec.

```java
public static VoiceCodec fromValue(int value)
```

Returns the `VoiceCodec` for the given wire value. Throws `ProtocolException` if the value is out of range.

## Related Types

- [VoiceConfig](VoiceConfig.md) -- references this enum for codec selection
