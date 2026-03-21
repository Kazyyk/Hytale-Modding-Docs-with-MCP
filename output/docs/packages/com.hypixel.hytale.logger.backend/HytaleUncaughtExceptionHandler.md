---
title: "HytaleUncaughtExceptionHandler"
kind: "class"
package: "com.hypixel.hytale.logger.backend"
fqcn: "com.hypixel.hytale.logger.backend.HytaleUncaughtExceptionHandler"
api_surface: false
extends: ~
implements: ["UncaughtExceptionHandler"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "logger"
  - "backend"
  - "class"
---

**Package:** `com.hypixel.hytale.logger.backend`

```java
public class HytaleUncaughtExceptionHandler implements UncaughtExceptionHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `HytaleUncaughtExceptionHandler` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `setup()` |
| `@Override public` | `void` | `uncaughtException(Thread t, Throwable e)` |
