---
title: "SoundFileValidators"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.SoundFileValidators"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

```java
public class SoundFileValidators
```

Validators that check whether OGG sound files have the expected channel count (mono or stereo). Uses `OggVorbisInfoCache` to inspect audio metadata.

## Constants

| Modifier | Type | Name | Description |
|---|---|---|---|
| `public static final` | `ChannelValidator` | `MONO` | Validates 1-channel audio |
| `public static final` | `ChannelValidator` | `STEREO` | Validates 2-channel audio |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `String` | `getEncoding(int channelCount)` |

## Inner Classes

### ChannelValidator

Implements `Validator<String>`. Checks that a named sound file's channel count matches the expected value.
