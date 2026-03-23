---
title: "HytaleConsole"
kind: "class"
package: "com.hypixel.hytale.logger.backend"
fqcn: "com.hypixel.hytale.logger.backend.HytaleConsole"
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
public class HytaleConsole extends Thread
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `TYPE_DUMB` |
| `public static final` | `HytaleConsole` | `INSTANCE` |
| `private final` | `BlockingQueue<LogRecord>` | `logRecords` |
| `private final` | `HytaleLogFormatter` | `formatter` |
| `private` | `OutputStreamWriter` | `soutwriter` |
| `private` | `OutputStreamWriter` | `serrwriter` |
| `private` | `String` | `terminalType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `publish(@Nonnull LogRecord logRecord)` |
| `@Override public` | `void` | `run()` |
| `public` | `void` | `shutdown()` |
| `private` | `void` | `publish0(@Nonnull LogRecord record)` |
| `public` | `void` | `setTerminal(String type)` |
| `private` | `boolean` | `shouldPrintAnsi()` |
| `public` | `HytaleLogFormatter` | `getFormatter()` |
