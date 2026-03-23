---
title: "SkipSentryException"
kind: "class"
package: "com.hypixel.hytale.logger.sentry"
fqcn: "com.hypixel.hytale.logger.sentry.SkipSentryException"
api_surface: false
extends: "RuntimeException"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "logger"
  - "sentry"
---

**Package:** `com.hypixel.hytale.logger.sentry`

```java
public class SkipSentryException extends RuntimeException
```

Exception thrown on SkipSentry errors.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SkipSentryException()` |
| `public` | | `SkipSentryException(Throwable cause)` |
| `public` | | `SkipSentryException(String message, Throwable cause)` |
| `public static` | `boolean` | `hasSkipSentry(Throwable thrown)` |
