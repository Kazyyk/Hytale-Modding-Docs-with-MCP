---
title: "HytaleFileHandler"
kind: "class"
package: "com.hypixel.hytale.logger.backend"
fqcn: "com.hypixel.hytale.logger.backend.HytaleFileHandler"
api_surface: false
extends: "Thread"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "logger"
  - "backend"
  - "class"
---

**Package:** `com.hypixel.hytale.logger.backend`

```java
public class HytaleFileHandler extends Thread
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `DateTimeFormatter` | `LOG_FILE_DATE_FORMAT` |
| `public static final` | `HytaleFileHandler` | `INSTANCE` |
| `private final` | `BlockingQueue<LogRecord>` | `logRecords` |
| `private` | `FileHandler` | `fileHandler` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `run()` |
| `@Nullable public` | `FileHandler` | `getFileHandler()` |
| `public` | `void` | `enable()` |
| `public` | `void` | `log(@Nonnull LogRecord logRecord)` |
| `public` | `void` | `shutdown()` |
