---
title: "RequiredArg"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.arguments.system"
fqcn: "com.hypixel.hytale.server.core.command.system.arguments.system.RequiredArg"
api_surface: true
extends: "Argument<RequiredArg<DataType>, DataType>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "command"
  - "system"
  - "arguments"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.command.system.arguments.system`

```java
public class RequiredArg<DataType> extends Argument<RequiredArg<DataType>, DataType>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Message` | `getUsageMessageWithoutDescription()` |
| `@Override @Nonnull public` | `Message` | `getUsageMessage()` |
| `@Override @Nonnull public` | `Message` | `getUsageOneLiner()` |
| `@Nonnull protected` | `RequiredArg<DataType>` | `getThis()` |
