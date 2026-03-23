---
title: "ToolArgException"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.args.ToolArgException"
api_surface: true
extends: "Exception"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.buildertool.config.args`

```java
public class ToolArgException extends Exception
```

Exception thrown on ToolArg errors.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Message` | `translationMessage` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ToolArgException(@Nonnull Message translationMessage)` |
| `public` | | `ToolArgException(@Nonnull Message translationMessage, Throwable cause)` |
| `@Nonnull public` | `Message` | `getTranslationMessage()` |
