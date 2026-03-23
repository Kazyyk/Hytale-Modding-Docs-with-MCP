---
title: "ValidationResult"
kind: "record"
package: "com.hypixel.hytale.protocol.io"
fqcn: "com.hypixel.hytale.protocol.io.ValidationResult"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "io"
  - "record"
---

**Package:** `com.hypixel.hytale.protocol.io`

```java
public record ValidationResult(boolean isValid, @Nullable String error)
```

Immutable record representing the result of a packet validation check.

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `public static final` | `ValidationResult` | `OK` | Singleton for successful validation |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ValidationResult` | `error(String message)` |
| `public` | `void` | `throwIfInvalid()` |
