---
title: "OggVorbisInfoCache"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.OggVorbisInfoCache"
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
public class OggVorbisInfoCache
```

Cache for OGG Vorbis audio file metadata (channels, sample rate, duration). Parses the Vorbis identification header from the raw bytes to extract audio properties. Supports both synchronous and asynchronous retrieval.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `CompletableFuture<OggVorbisInfo>` | `get(String name)` |
| `@Nonnull public static` | `CompletableFuture<OggVorbisInfo>` | `get(@Nonnull CommonAsset asset)` |
| `@Nullable public static` | `OggVorbisInfo` | `getNow(String name)` |
| `public static` | `OggVorbisInfo` | `getNow(@Nonnull CommonAsset asset)` |
| `public static` | `void` | `invalidate(String name)` |

## Inner Classes

### OggVorbisInfo

| Field | Type | Description |
|---|---|---|
| `channels` | `int` | Number of audio channels |
| `sampleRate` | `int` | Sample rate in Hz |
| `duration` | `double` | Duration in seconds (-1.0 if undetermined) |
