---
title: "ChunkWorkerThreadFactory"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.ChunkWorkerThreadFactory"
api_surface: false
extends: null
implements: ["ThreadFactory"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
public class ChunkWorkerThreadFactory implements ThreadFactory
```

Implements `ThreadFactory` to provide ChunkWorkerThreadFactory functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `AtomicInteger` | `FACTORY_COUNTER` | `new AtomicInteger()` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ChunkGenerator` | `chunkGenerator` |
| `private final` | `String` | `threadNameFormat` |
| `@Nonnull private final` | `Integer` | `factoryId` |
| `@Nonnull private final` | `AtomicInteger` | `threadCounter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ChunkWorkerThreadFactory(ChunkGenerator chunkGenerator, String threadNameFormat)` |
| `@Nonnull @Override public` | `Thread` | `newThread(Runnable r)` |
| `@Nonnull @Override public` | `String` | `toString()` |
