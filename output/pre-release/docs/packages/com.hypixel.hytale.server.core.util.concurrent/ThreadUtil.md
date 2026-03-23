---
title: "ThreadUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.util.concurrent"
fqcn: "com.hypixel.hytale.server.core.util.concurrent.ThreadUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "util"
  - "concurrent"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.util.concurrent`

```java
public class ThreadUtil
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `forceTimeHighResolution()` |
| `public static` | `void` | `createKeepAliveThread(Semaphore alive)` |
| `@Nonnull public static` | `ExecutorService` | `newCachedThreadPool(int maximumPoolSize, ThreadFactory threadFactory)` |
| `@Nonnull public static` | `ThreadFactory` | `daemon(String name)` |
| `@Nonnull public static` | `ThreadFactory` | `daemonCounted(String name)` |

## Inner Types

- `ThreadUtil.ThreadWatcher`
