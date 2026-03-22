---
title: "GenerateI18nCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.i18n.commands"
fqcn: "com.hypixel.hytale.server.core.modules.i18n.commands.GenerateI18nCommand"
api_surface: false
extends: "AbstractAsyncCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "i18n"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.i18n.commands`

```java
public class GenerateI18nCommand extends AbstractAsyncCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` |
| `protected final` | `FlagArg` | `cleanArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override protected` | `CompletableFuture<Void>` | `executeAsync(CommandContext context)` |
| `@Nonnull private` | `TranslationMap` | `mergei18nWithOnDisk(Path path, TranslationMap generated, boolean cleanOldKeys) throws Exception` |
| `private` | `void` | `writeTranslationMap(Path path, TranslationMap translationMap) throws Exception` |
| `@Nonnull private static` | `Set<T>` | `difference(Set<T> a, Set<T> b)` |
