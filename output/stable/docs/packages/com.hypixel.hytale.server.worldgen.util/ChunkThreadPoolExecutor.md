---
title: "ChunkThreadPoolExecutor"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.ChunkThreadPoolExecutor"
api_surface: false
extends: "ThreadPoolExecutor"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
public final class ChunkThreadPoolExecutor extends ThreadPoolExecutor
```

Extends `ThreadPoolExecutor` to provide ChunkThreadPoolExecutor functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `AtomicInteger` | `GENERATION_COUNTER` | `new AtomicInteger(0)` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `int` | `generation` | `GENERATION_COUNTER.getAndIncrement()` |
| `private final` | `Runnable` | `shutdownHook` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ChunkThreadPoolExecutor(int corePoolSize,
        int maximumPoolSize,
        long keepAliveTime,
        TimeUnit unit,
        BlockingQueue<Runnable> workQueue,
        ThreadFactory threadFactory,
        Runnable shutdownHook)` |
| `@Override protected` | `void` | `terminated()` |
